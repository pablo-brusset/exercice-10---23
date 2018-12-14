import java.util.Scanner;

public class exo14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir une chaine de caractere");
		
		String saisie = sc.nextLine();
		System.out.println("vous avez saisi: "+ saisie);
		
		
		saisie = saisie.toUpperCase();
		System.out.println("En majuscule: "+saisie);
		
		saisie= saisie.toLowerCase();
		System.out.println("tout es en miniscules:"+ saisie);
		saisie= saisie.substring(0,1).toUpperCase()+ saisie.substring(1).toLowerCase();
		System.out.println("seulement la premiere lettre est en majuscule: "+ saisie);
	}

}
