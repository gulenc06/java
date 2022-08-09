public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner (System.in);
		int a, b ;
		System.out.print("a=");
		a=kb.nextInt();
		System.out.print("b=");
		b=kb.nextInt();
		if (a<=b) 
		    if (a==b)
		        System.out.print("a=b");
		    else
		        System.out.print("a<b");
		else
		    System.out.print("a>b");
		
	}
}
