import java.util.Scanner;



public class exo16 {

	public static void main(String args[]) {
		
		String saisie,reverse="";
		Scanner scan= new Scanner(System.in);
		
		System.out.println("veuillez saisir un mot: ");
		saisie =scan.nextLine();
		
		System.out.println("vous avez saisi: " + saisie);
		
		int length = saisie.length();
		 
		for(int i = length -1; i >= 0; i --)
			reverse = reverse + saisie.charAt(i);
	    if (saisie.equals(reverse))
			System.out.println("alors c'est un palindrome. ");
	
	
		else {
				System.out.println("Non ce n'est pas un palindrome.");
				
		}
	}
}
				
			
				

	

