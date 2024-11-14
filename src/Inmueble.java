
public class Inmueble {
	private int dormitorios;
	private int banos;
	private int cocheras;
	private String estado;
	private String direccion;
	private float precio;
	private int id;
	
	public Inmueble(int id, int dormitorios, int banos, int cocheras, String estado, String direccion, float precio) {
		setId(id);
		setDormitorios(dormitorios);
		setBanos(banos);
		setCocheras(cocheras);
		setEstado(estado);
		setDireccion(direccion);
		setPrecio(precio);
	}
	
	public int getDormitorios() {
		return dormitorios;
	}
	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}
	public int getBanos() {
		return banos;
	}
	public void setBanos(int banos) {
		this.banos = banos;
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
	        this.estado = "Disponible";
	    }
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Dormitorios: " + getDormitorios() + 
				" Banos: " + getBanos() + 
				" Cocheras: " + getCocheras() + 
				" Estado: " + getEstado() +
				" Direccion: " + getDireccion() +
				" Precio: " + getPrecio() +
				" Id: " + getId();
			
	}
	
}
