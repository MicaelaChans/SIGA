
public abstract class Agenda {
	private String nombre;
	private String apellido;
	private int documento;
	private int telefono;
	private String tipo;
	private int id;
	private int dormitorios;
	private int banos;
	private int cocheras;
	private String estado;
	private String direccion;
	private float precio;
	
	public Agenda(int id, int documento, String nombre, String apellido, int telefono, String tipo, int dormitorios, int banos, int cocheras, String estado, String direccion, float precio) {
		setNombre(nombre);
		setApellido(apellido);
		setDocumento(documento);
		setTelefono(telefono);
		setTipo(tipo);
		setId(id);
		setDormitorios(dormitorios);
		setBanos(banos);
		setCocheras(cocheras);
		setEstado(estado);
		setDireccion(direccion);
		setPrecio(precio);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}		
	
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		this.estado = estado;
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
	
	
	public String toString() {
		return "Nombre: " + getNombre() + ", " +
				" Apellido: " + getApellido() + ", " +
				" Documento: " + getDocumento() + ", " +
				" Telefono: " + getTelefono() + ", " +
				" Tipo: " + getTipo() + ", " +
				" Id: " + getId() + ", " +
				" Dormitorios: " + getDormitorios() + ", " +
				" Baños: " + getBanos() + ", " +
				" Cocheras: " + getCocheras() + ", " +
				" Estado: " + getEstado() + ", " +
				" Dirección: " + getDireccion() + ", " +
				" Precio: " + getPrecio() + ", " ;
	}
}

	