public class Main
{
	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner (System.in);
		java.util.Scanner kb = new java.util.Scanner (System.in);
		String isim, soyisim;
		int yas ;
		System.out.println("isim giriniz:");
		isim=input.next();
		System.out.println("soyisim giriniz:");
		soyisim=input.next();
		System.out.println("yaşını gir");
		yas = kb.nextInt();
		System.out.println("İsmin :"+isim);
		System.out.println("Soyismin:"+soyisim);
		if (yas==16)
		System.out.println("yaşın=yaşım");
		else 
		System.out.println("yaşın:"+yas);
		

	}
}

