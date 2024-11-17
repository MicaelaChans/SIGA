
	public abstract class Cliente{
		private String nombre;
		private String apellido;
		private int documento;
		private int telefono;
		private int id;
		
		public Cliente(int id, int documento, String nombre, String apellido, int telefono) {
			setNombre(nombre);
			setApellido(apellido);
			setDocumento(documento);
			setTelefono(telefono);
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
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		public String toString() {
			int num=0;
			num = 5 - String.valueOf(getId()).length();
			return  " Id: " + getId()+
					" Nombre: " + getNombre() + 
					" Apellido: " + getApellido() + 
					" Documento: " + getDocumento() + 
					" Telefono: " + getTelefono();
					
		}
	}
	
