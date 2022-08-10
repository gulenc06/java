public class Main
{
  
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner (System.in);
	    int a;
	    System.out.print("bir sayı gir");
	    a = kb.nextInt();
	    if(a==31)
	    System.out.println("17 sayıs geçersiz");
	    else{
		for (int i=0 ;i<=a ; i++)
		System.out.println(i);
	}
	}
}

