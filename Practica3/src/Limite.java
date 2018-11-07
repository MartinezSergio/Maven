import java.awt.List;
import java.util.ArrayList;

public class Limite<T> {
	
	private T t;
	
	private T get() {
		return t;
		}
	private void set(T t) {
		this.t = t;
		}
	
	public<U extends Number> void revision(U u) {
		System.out.println("T es de tipo " + t.getClass().getName());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Limite <Integer>lim = new Limite<Integer>();
		Limite<String>limString = new Limite<String>();
		
		lim.set(34);
		limString.set("Hola");
		
		lim.revision(35);
		
		Limite<Double>limD = new Limite<>();
		limD.revision(35d);
		
		//limString.revision("Otro String");		

	}

}
