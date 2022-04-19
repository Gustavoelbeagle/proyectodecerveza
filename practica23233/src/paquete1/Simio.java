package paquete1;

public class Simio extends Mascota{
	
	private String especie;

	
	public Simio(String nombre, String especie) {
		super(nombre);
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String nombre) {
		this.especie = nombre;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.especie + " y te voy a contar algo o no");
	}

}

