package paquete1;


public class Perro extends Mascota{
	
	private String raza;

	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.getNombre() + " y ladro");
	}

}
