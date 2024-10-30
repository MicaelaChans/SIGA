
	public abstract class Clientes{
		private String nombre;
		private String apellido;
		private int documento;
		private char correo;
		private int telefono;
		private String tipo;		
		
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
		public String getapellido() {
			return apellido;
		}
		public void setapellido(String apellido) {
			this.apellido = apellido;
		}
		public String gettipo() {
			return tipo;
		}
		public void settipo(String tipo) {
			this.tipo = tipo;
		}
		
	}
	
