package app;

public class Empleado {
	
	private int clave;
	private String nombre;
	private int salario;
	
	public Empleado(int clave, String nombre, int salario) throws Exception {
		this.clave = clave;
		this.setNombre(nombre);
		this.salario = salario;
	}

	public void setNombre(String nombre) throws Exception {
		if (nombre.length() <= 20)
			this.nombre = nombre;
		else
			throw new Exception("El nombre no puede tener más de 20 caracteres");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [clave=");
		builder.append(clave).append(", nombre=");
		builder.append(nombre).append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
