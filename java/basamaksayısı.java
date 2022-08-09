public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int a;
		System.out.print("0-1000 sayı gir");
		a=kb.nextInt();
		    if(a>=1000)
		    
		        System.out.print("4bas");
		    
		    else
		         if(a>=100)
		    
		        System.out.print("3bas");
		        else
		         if(a>=10)
		    
		        System.out.print("2bas");
		    else
		    
		        System.out.print("1bas");
		
	}
}
