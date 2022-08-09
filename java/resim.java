public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner (System.in);
	    int a ;
	    System.out.print("satır");
	    a = kb.nextInt();
		for (int i=0; i<a; i++) {
		    for(int j=a; j>i; j--) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
