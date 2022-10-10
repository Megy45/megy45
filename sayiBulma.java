package intro;

public class sayiBulma {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5,6,7,8};
		int aranacak=12;
		boolean varMi=false;
		for (int number : numbers) {
			if (number == aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}
		

	}

}
