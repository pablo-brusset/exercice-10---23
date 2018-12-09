import java.util.Scanner;
	public class exonine {
		public static void main(String[]args) {
				
			int nbutil = 1;
			int de020 =0;
			int de2140 = 0;
			int de41100 =0;
			int saisieutil = 1;
			Scanner scan = new Scanner(System.in);
			
			while(nbutil <= 20)
			{
				System.out.println("entrez age"+ nbutil);
				saisieutil = scan.nextInt();
				if (saisieutil<= 100)
				{
					if ((saisieutil > 0) && (saisieutil <= 20))
					{
						de020 ++;
					}
					else if ((saisieutil >= 21) && (saisieutil <= 40 )) 
					{
						de2140++;
					}
					else if ((saisieutil >= 41) && (saisieutil <= 100)) 
					{
						System.out.println("Alors il y a:" + de020);
					}{
						
					}
				}
			}
			
			
				}
				
				
				
		}
		
	
					
				
		
		
	
	
