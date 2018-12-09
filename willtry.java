import java.util.Scanner;
	public class willtry {
		public static void main(String[]args) {
				
			int age = 0;
			int eleves = 0;
			int plusdevingt = 0;
			Scanner scan = new Scanner(System.in);
			for(int i = 0; i <= 20; i++){
				System.out.println("élève numéro" + i);
				age = scan.nextInt();
				
				if(age < 20){
					eleves ++;
				}else{
					System.out.println("plus de 20 piges "); 
					plusdevingt ++;	
				}
			System.out.println("Alors il y a: "+ eleves);
		}
		
		
	}
	
}