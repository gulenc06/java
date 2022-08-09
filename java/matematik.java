public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner (System.in);
	    int x,y , z;
		System.out.println("x=");
		x=kb.nextInt();
		if(x<0)
		{
		    z=(3*x);
		    y=(x*x+2*x);
		}
		else{
		    z=(x*x+10);
		    y=(x);
		}
		System.out.println("z="+z);
		System.out.println("y="+y);
	}
}

