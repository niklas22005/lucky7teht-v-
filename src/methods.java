package methods;

import java.util.Scanner;

public class methods {

	
	//Pääohjelma (main)
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int pituus, leveys;
		String vastaus;
		
		// Kutsutaan metodia (call)
		tulostaAlkutekstit();
		tulostaAlkutekstit();
		tulostaAlkutekstit();
		
		System.out.println("Anna pituus");
		vastaus = in.nextLine();
		pituus = Integer.parseInt(vastaus);
		
		
		System.out.println("Anna leveys");
		vastaus = in.nextLine();
		leveys = Integer.parseInt(vastaus);
		
		laskePintaAla(pituus, leveys);
		
		
		laskePintaAla(5,6);
		// 5  = pituus, 6 = leveys
		
		tulostaLopputekstit();
		
	} //mainin loppu

	
	// 1. Metodi, joka vain tekee jotain 
	// 2. Metodi, joka tarvitsee lisätietoa, jotta voi toimia
	// 3. Metodi, joka palauttaa jotain.
	
	public static void tulostaAlkutekstit()
	{
		System.out.println("Metodi-ohjelma");
	}
	
	public static void tulostaLopputekstit()
	{
		System.out.println("Kiitos käytöstä");
	}
	
	
	public static void laskePintaAla(int pituus, int leveys)
	{
		int pintaAla;
		pintaAla = pituus * leveys;
		System.out.println("Pinta-ala on " + pintaAla);
	}
	
	
	
}

