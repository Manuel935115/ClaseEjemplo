package ejemplo;

public class Circulo {

	
	
	private String nombre;
	private String color;
	private double radio;
	private int id;
	public Circulo() {
		
	}
	public Circulo(String nombre, String color, double radio, int id) {
		
		this.nombre = nombre;
		this.color = color;
		this.radio = radio;
		this.id = id;
	}
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
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// metodo String
	@Override
	public String toString() {
		return "Circulo [nombre=" + nombre + ", color=" + color + ", radio=" + radio + ", id=" + id + "]";
	}
	
	
}
