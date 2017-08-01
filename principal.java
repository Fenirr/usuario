package programa;
    import javax.swing.*;
	public class Principal {
		public static void main(String [] args) {
			Usuario fenir = new Usuario();
			String nombre=fenir.getNombre();
			String curp = fenir.getCurp();
			String direccion = fenir.getDireccion();
			String telefono = fenir.getTelefono();
			
			JOptionPane.showMessageDialog(null, "Su Nombre Es: "+nombre+",\n Su Curp Es: "+curp+","
					+ " \n Su Direccion Es: "+direccion+", \n Su Numero De Telefono es: "+telefono);
