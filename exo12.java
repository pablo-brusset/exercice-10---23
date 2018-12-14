
public class exo12 {

	public static void main(String[] args) {
		
		int tableauent[]= new int[5];
		
		for(int i =0 ; i < tableauent.length;i++) {
			
			tableauent[i] = 0 + (int)(Math.random() * ((10 - 0) + 1 )); 
			System.out.println("voici"+tableauent[i]);
		}
		
	}

}
