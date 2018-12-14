import java.util.Scanner;

public class exo15 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int x ;
		String bob;
		String bob2 =null;
		System.out.println("saisi un mot");
		bob = scan.nextLine();
		x= bob.length();
		if (x>3) {
			
			bob2 = bob.substring(bob.length() -3);
			System.out.println("Vous avez saisi: " + bob2);
			
		}
		else {
			System.out.println("mot trop petit");
			
		}
		
	
	}

}
