public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int a, b, c ;
		System.out.print("1.kenar");
		a = kb.nextInt();
		System.out.print("2.kenar");
		b = kb.nextInt();
		System.out.print("3.kenar");
		c = kb.nextInt();
		if (a+b>c)
		    if (a+c>b)
		        if(b+c>a)
		        System.out.println("üçgen oluşur");
		        else
		        System.out.println("üçgen oluşmaz");
		    else
		    System.out.println("üçgen oluşmaz");
		else
		System.out.println("üçgen oluşmaz");
	}
}

