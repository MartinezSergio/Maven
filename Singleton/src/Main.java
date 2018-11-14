
public class Main {

	public static void main(String[] args) {

		SoyUnico ricardo = SoyUnico.getSingletonInstance("Ricardo Moya");
		SoyUnico ramon = SoyUnico.getSingletonInstance("Ramón Invarato");

		// ricardo y ramon son referencias a un único objeto de la clase SoyUnico
		System.out.println(ramon.getNombre());
		System.out.println(ricardo.getNombre());
		
		ricardo.setNombre("Alfonso");
		System.out.println(ricardo.getNombre());
		
		ramon.setNombre("Sergio");
		System.out.println(ricardo.getNombre());
	}
}
