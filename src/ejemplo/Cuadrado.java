package ejemplo;

/**
 * @author manuel.martin3
 * @version 1.01
 */
public class Cuadrado {

	private String nombre;
	private String color;
	private int id;
	private double lado;
	
	// constructor
	public Cuadrado() {
		
	}
	public Cuadrado(String nombre, String color, int id, double lado) {
		this.nombre = nombre;
		this.color = color;
		this.id = id;
		this.lado = lado;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	// metodo toString


	/**
	 * este metodo...
	 * @return printea una cadena
	 */
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", color=" + color + ", id=" + id + ", lado=" + lado + "]";
	}

	
	
	
}
