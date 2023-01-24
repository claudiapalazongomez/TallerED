package es.studium.ejercicio7;

public class Coche
{
	//Atributos
	
	private String fabricante;
	private String modelo;
	private int anioFabricacion;
	private boolean esGasolina;
	
	//Constructores
	
	public Coche() {
		fabricante = "";
		modelo = "";
		anioFabricacion = 0;
		esGasolina = false;
	}

	public Coche(String fabricante, String modelo, int anioFabricacion, boolean esGasolina)
	{
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.esGasolina = esGasolina;
	}
	
	//Métodos

	public String getFabricante()
	{
		return fabricante;
	}

	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public int getAnioFabricacion()
	{
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion)
	{
		this.anioFabricacion = anioFabricacion;
	}

	public boolean isEsGasolina()
	{
		return esGasolina;
	}

	public void setEsGasolina(boolean esGasolina)
	{
		this.esGasolina = esGasolina;
	}
	
	
}
