package es.studium.ejercicio7;

public class Piloto
{
	//Atributos
	
	private String nombre;
	private String nacionalidad;
	
	//Constructores
	
	public Piloto() {
		nombre = "";
		nacionalidad = "";
	}

	public Piloto(String nombre, String nacionalidad)
	{
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	
	//Métodos

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNacionalidad()
	{
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}
	
	
}
