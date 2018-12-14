

public class exo10 {

	public static void main(String[] args) {
		int[] names =  {4,67,25,87};
		char[] cara= {'r','2','?','+'};
		double[] tb3= {4.5 , 25.50 , 87.00};
		String[]chainecara = {"Robert","Noemie","David","Bertrand"};
		System.out.println(names[0]);
		names[2]= 42;
		System.out.println(names[2]);
		
		for(int i =0 ; i < tb3.length;i++){
			System.out.println("Voici"+tb3[i]);
		}
			System.out.println("taille du tableau 1 est"+tb3.length);
		}
	}
