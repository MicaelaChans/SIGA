
	public abstract class Clientes{
		private String nombre;
		private String apellido;
		private int documento;
		private char correo;
		private int telefono;
		private String tipo;
		private int id;
		
		public Clientes(int id, int documento, String nombre, String apellido, char correo, int telefono, String tipo) {
			setNombre(nombre);
			setApellido(apellido);
			setDocumento(documento);
			setCorreo(correo);
			setTelefono(telefono);
			setTipo(tipo);
			setId(id);
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
		public char getCorreo() {
			return correo;
		}
		public void setCorreo(char correo) {
			this.correo = correo;
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
		
		public String toString() {
			return "Nombre: " + getNombre() + 
					" Apellido: " + getApellido() + 
					" Documento: " + getDocumento() + 
					" Correo: " + getCorreo() +
					" Telefono: " + getTelefono() +
					" Tipo: " + getTipo() +
					" Id: " + getId(); 
		}
		
	}
	
