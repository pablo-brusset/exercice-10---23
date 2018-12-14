import java.util.Scanner;

public class exo13 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("veuillez saisir une chaine de caractere plz");
		
		String saisie = scan.nextLine();
		System.out.println("Vous avez saisie: " + saisie);
		
		System.out.println("Pouvez vous choisir une lettre s'il vous plait " );
		String lettre = scan.nextLine();
		char text = lettre.charAt(0);
		int compteur = 0;
		for(int i = 0 ; i < saisie.length();i++){
			System.out.println("ajout d'une lettre");
			if(saisie.charAt(i)== text){
				compteur++;
				
				
			}
			
		}
		System.out.println("votre lettre a été compté "+compteur);
	} 
	
	
}

