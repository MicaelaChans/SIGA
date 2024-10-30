
public abstract class Inmuebles {
	private int dormitorios;
	private int baños;
	private int cocheras;
	private String estado;
	private String nombre;
	private float precio;
	
	
	public int getDormitorios() {
		return dormitorios;
	}
	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}
	public int getBaños() {
		return baños;
	}
	public void setBaños(int baños) {
		this.baños = baños;
	}
	public int getCocheras() {
		return cocheras;
	}
	public void setCocheras(int cocheras) {
		this.cocheras = cocheras;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
