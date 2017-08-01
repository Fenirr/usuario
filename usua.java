import javax.swing.*;
	public class Usuario {
		String usuario; 
		String nombre;
		String direccion;
		String curp;
		String telefono;
		
		public Usuario(){
			this.usuario="fenir";
			this.nombre = "Rafael garcia tomas";
			this.direccion = "Calle guadalupe victoria #56";
			this.curp = "GATR970421HMVZF03";
			this.telefono = "235106465";
		}

		public String getUsuario() {
			usuario=JOptionPane.showInputDialog("Ingrese Su usuario");
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = "fenir";
		}

		public String getNombre() {
			nombre=JOptionPane.showInputDialog("Ingrese Su Nombre");
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = "Rafael garcia tomas";
		}

		public String getDireccion() {
			direccion=JOptionPane.showInputDialog("Ingresa Tu Direccion");
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = "Calle guadalupe victoria #56";
		}

		public String getCurp() {
			curp=JOptionPane.showInputDialog("Ingresa Tu Curp");
			return curp;
		}

		public void setCurp(String curp) {
			this.curp = "GATR970421HMVZF03";
		}

		public String getTelefono() {
			telefono=JOptionPane.showInputDialog("Ingrese su numero De Telefono");
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = "235106465";
		}

	}
