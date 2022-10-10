package intro;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 35;
		int sayi3 = 28;
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		
		}
		System.out.println("En büyük sayı:"+enBuyuk);
	}

}
