public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		System.out.println("1 sayı gir");
		int a, b;
		System.out.print("sayı=");
		a=kb.nextInt();
		b=(-1 * a);
		if(a<0)
		System.out.println("mutlak değer= " + b);
		else
		System.out.println("mutlak değer= "+a);
		
	}
}

