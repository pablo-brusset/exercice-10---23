
import java.util.Scanner;

public class Exosix {
	public static void main (String[] args)
	{
		Scanner scan= new Scanner(System.in);
		
				int firstnumber = 0;
				
				int secondnumber = 0;
				
				String operateur = ""; 
				
				System.out.println("Choisir un nombre entre -1000 et 1000");
				firstnumber = scan.nextInt();
				System.out.println("Choisir un second nombre entre -1000 et 1000");
				secondnumber = scan.nextInt();
				System.out.println("Saisir un opérateur");
				scan.nextLine();
				operateur = scan.nextLine();
				
				if ((firstnumber >= -1000) && (firstnumber <= 1000) && (secondnumber >= -1000) && (secondnumber <= 1000)) {
				
					switch (operateur) {
						case "+" : System.out.println(firstnumber + secondnumber);
						break;
						
						case "-" : System.out.println(firstnumber - secondnumber);
						break;
						
						case "*" : System.out.println(firstnumber * secondnumber);
						break;
						
						case "/" : 
							if (( firstnumber != 0) && (secondnumber != 0)) {
								System.out.println(firstnumber/secondnumber);
								
							} else {
								System.out.println(" Erreur on ne peut pas diviser par 0");
							}							
						break;
						default: System.out.println("L' operateur n'est pas valide du coup nous ferons un addiction");
					}		
	  }
	 }

 }


