package intro;

public class loop {

	public static void main(String[] args) {
		for (int i=2; i <= 10; i=i+2) {
			System.out.print(i);
		}
		System.out.println("For Döngüsü bitti");
		
		int i=1;
		while (i<10) {
			
			System.out.println(i);
			i++;
			
		}
		System.out.println("While Döngüsü bitti");	
         
		int j=1;
          do {
        	  System.out.println(j);
        	  j+=2;
        	  } while (j<10);
          System.out.println("Do-While Döngüsü bitti");
	
	}

}


