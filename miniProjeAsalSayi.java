package intro;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number =4;
		if ( number == 2) {
			System.out.println(number+ " asal sayıdır!");
		}
		if (number == 1) {
				System.out.println(number+ " asal sayı değildir");
				return;
			}
		if (number < 1){
			System.out.println("Pozitif Tam Sayı Giriniz");
		}

		for (int i=2 ; i<=number ;i++) {
		int remainder =number % i;
		if (number % i == 0) {
				System.out.println(number+ " asal sayı değildir!");
		}
		else if (number % i != 0) {
			System.out.println(number+ " asal sayıdır!");
		}
	
		
		break;
		}
	}

	}


