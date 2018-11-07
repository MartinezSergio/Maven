
public class MainPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair<Integer, String>p1 = new OrderedPair<Integer, String>(1, "rojo");
		Pair<Integer, String>p2 = new OrderedPair<Integer, String>(2, "azul");
		
		System.out.println(p1.getKey() + " " + p1.getValue());

		/*
		 * K clave
		 * N numero
		 * T tipo
		 * V valor
		 * S,U,V para 2,3,4 tipos
		 */
	}

}
