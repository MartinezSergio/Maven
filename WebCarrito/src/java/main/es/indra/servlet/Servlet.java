package es.indra.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String categoria = request.getParameter("nombre");

		session.setAttribute("id", id);
		session.setAttribute("nombre", categoria);

		int converId = Integer.parseInt(id);

		Connection conn1 = null;
		try {
			String url1 = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7264745";
			String user = "sql7264745";
			String password = "Zb1XGdwrD6";

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn1 = DriverManager.getConnection(url1, user, password);
			if (conn1 != null) {
				System.out.println("Connected to the database sql7264745");
			}
		} catch (SQLException ex) {
			System.out.println("Error en la conexion,usuario /password incorrecto");
			ex.printStackTrace();
		}

		String query = " insert into categorias values (?, ?)";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn1.prepareStatement(query);
			preparedStmt.setInt(1, converId);
			preparedStmt.setString(2, categoria);
			preparedStmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		String query2 = "SELECT * FROM categorias Where id = " + converId  ;
		Statement st;
		
		PrintWriter out = response.getWriter();
		try {
			st = conn1.createStatement();
			ResultSet rs = st.executeQuery(query2);
			while (rs.next()) {
				int id2 = rs.getInt("id");
				String nombre = rs.getString("nombre");
				out.println("<br>" + id2 + " " + nombre);
			}
			st.close();
			conn1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
