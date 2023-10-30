package methods;

import java.util.Random;
import java.util.Scanner;

public class lucky7 {

	public static void main(String[] args) {
	
		   Scanner scanner = new Scanner(System.in);
           Random rand = new Random();
           int nro1 = 0;
           int nro2 = 0;
           int nro3 = 0;
           System.out.println("Anna rahamäärä");
           int money = Integer.parseInt(scanner.nextLine());


	           while(money > 0) {
                   money--;
                   nro1 = rand.nextInt(10) + 1;
                   nro2 = rand.nextInt(10) + 1;
                   nro3 = rand.nextInt(10) + 1;
                   if(nro1 == 7 && nro2 == 7 && nro3 == 7) {
                           money = money + 10;
                           System.out.println("Sait numerot " + nro1 + ", " + nro2 + " ja " + nro3 + ". Voitit pelin ja sait 10 rahaa" );
                           System.out.println("Rahaa jäljellä " + money);
                   }
                   else if(nro1 == 7 && nro2 == 7 || nro2 == 7 && nro3 == 7 || nro1 == 7 && nro3 == 7) {
                           money = money + 5;
                           System.out.println("Sait numerot " + nro1 + ", " + nro2 + " ja " + nro3 + ". Voitit pelin ja sait 5 rahaa");
                           System.out.println("Rahaa jäljellä " + money);
                   }
                   else if(nro1 == 7 || nro2 == 7 || nro3 == 7) {
                           money = money + 3;
                           System.out.println("Sait numerot " + nro1 + ", " + nro2 + " ja " + nro3 + ". Voitit pelin ja sait 3 rahaa");
                           System.out.println("Rahaa jäljellä " + money);
                   }else {
                           System.out.println("Sait numerot " + nro1 + ", " + nro2 + " ja " + nro3 + ". Hävisit pelin");
                           System.out.println("Rahaa jäljellä " + money);
                   }
	       System.out.println("Haluatko pelata uudestaan?");
                   System.out.println("Jos haluat pelata, paina Enter");
                   System.out.println("Jos et halua pelata, kirjoita e ja paina Enter");
                   String vastaus = scanner.nextLine();
                   if(vastaus.equals("e")){
                           System.out.println("Kiitos peleistä. Sinulle jäi rahaa " + money + " euroa");
                           System.exit(0);
                   }
           }
           System.out.println("Rahasi loppuivat");
	}

	}

