package es.indra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * PrintWriter pw = response.getWriter();
		 * 
		 * pw.append("<h1>Bienvenido</h1>"); pw.append("<p>Hola</p>");
		 * pw.append("<p>Jose</p>");
		 * 
		 * pw.close();
		 */
		// Por si quisieramos poner mas parametros
		RequestDispatcher requesDispacher = request.getRequestDispatcher("/hola.jsp");
		requesDispacher.forward(request, response);

		// request.getRequestDispatcher("/index.jsp").forward(request, response);

		/*
		 * Para redireccionar a una pagina
		 * response.sendRedirect("http://localhost:8081/demo-web2/index.jsp");
		 */

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
