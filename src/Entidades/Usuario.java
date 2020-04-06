package Entidades;

public class Usuario {
	private Integer id;
	private String Usuario;
	private String contrase�a;
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer dni;

	public Usuario(Integer id,String usuario, String contrase�a, String nombre, String apellido, String direccion, Integer dni) {
		Usuario = usuario;
		this.id=id;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
		return "Usuario [Usuario=" + Usuario + ", contrase�a=" + contrase�a + ", nombre=" + nombre + ", apellido="
				+ apellido + ", direccion=" + direccion + ", dni=" + dni + "]";
	}
	
	

}
