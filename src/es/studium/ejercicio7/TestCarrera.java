package es.studium.ejercicio7;

public class TestCarrera
{

	public static void main(String[] args)
	{
		//Constructor por par�metros
		Coche coche1 = new Coche("BMW", "320i Berlina", 2022, true);
		Coche coche2 = new Coche("Renault", "Techno Blue dCi", 2020, false);
		Piloto piloto1 = new Piloto("Lewis Hamilton", "Brit�nico");
		Piloto piloto2 = new Piloto("Yuki Tsunoda", "Japon�s");
		
		System.out.println("Hola, me llamo "+ piloto1.getNombre());
		System.out.println("Hola, me llamo "+ piloto2.getNombre());
	}

}
