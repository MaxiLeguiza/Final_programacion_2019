package Entidades;

public class Usuario {
	private Integer id;
	private String Usuario;
	private String contraseña;
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer dni;

	public Usuario(Integer id,String usuario, String contraseña, String nombre, String apellido, String direccion, Integer dni) {
		Usuario = usuario;
		this.id=id;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String mostrarDatos() {
		return "Usuario [Usuario=" + Usuario + ", contraseña=" + contraseña + ", nombre=" + nombre + ", apellido="
				+ apellido + ", direccion=" + direccion + ", dni=" + dni + "]";
	}
	
	

}
