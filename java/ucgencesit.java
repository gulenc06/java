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
		if (a==b)
	
		    if (b==c)
		    System.out.print("eşkenar");
		    else
		    System.out.print("ikizkenar");
	
		else
		
		if (a==c)
		System.out.print("ikizkenar");
		else
		    if (b==c)
		    System.out.print("ikizkenar");
		    else
		    System.out.print("üçgen");
		
		
		
		
	}
}

