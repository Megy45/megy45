package intro;

import java.util.Iterator;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj= "Bugün hava çok güzel!";
		System.out.println(mesaj);
		
		/*System.out.println("Elaman sayısı :"+mesaj.length());
		System.out.println("5. elaman :"+mesaj.charAt(4)+" harfi");
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("!"));
		char[] karakterler = new char [4];
		mesaj.getChars(6, 10, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));*/
		System.out.println(mesaj.replace(' ', '/'));
		System.out.println(mesaj.substring(6, 10));
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);	
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}

}
