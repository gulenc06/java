public class Main
{
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int a, b, c ;
		System.out.print("1.sayi");
		a = kb.nextInt();
		System.out.print("2.sayi");
		b = kb.nextInt();
		System.out.print("3.sayi");
		c = kb.nextInt();

	
		if(a>b)
		{
		   if(c>a)
		   System.out.println("c>a>b");
		   else{
		        if(a==c)
		        System.out.println("a=c>b");
		        else
		            if(b>c)
		            System.out.println("a>b>c");
		            else
		                if(b==c)
		                System.out.println("a>b=c");
		                else
		                    if(b>c)
                            System.out.println("a>b>c");
                            else
                            System.out.println("a>c>b");
		   }
		} 
		else{
		    if (a==b)
		        if(b>c)
		        System.out.println("a=b>c");
		        else
		            if(b==c)
		            System.out.println("a=b=c");
		            else
		            System.out.println("c>a=b");
		    else
		        if(b>a)
		        {
		            if(c>b)
		            System.out.println("c>b>a");
		            else
		                if(b==c)
		                System.out.println("b=c>a");
		                else
		                    if(a>c)
		                    System.out.println("b>a>c");
		                    else
		                    if(a==c)
		                        System.out.println("b>a=c");
		                        else
		                        System.out.println("b>c>a"); 
		         }
		            else
		                if(c>b)
		                    if(a>c)
		                    System.out.println("a>c>b");
		                    else
		                        if(c==a)
		                        System.out.println("a=c>b");
		                        else
                                System.out.println("c>a>b");
                        else
                            if(c==b)
                                if(a>c)
                                System.out.println("a>c=b");
                                else
                                    if(a==c)
                                    System.out.println("a=c=b");
                                    else
                                    System.out.println("c=b>a");
                            else
                                if(a>c)
                                    if(a>b)
                                    System.out.println("a>b>c");
                                    else
                                        if(a==b)
                                        System.out.println("a=b>c");
                                        else
                                        System.out.println("a>c>b");
                                else
                                    if(a==c)
                                    System.out.println("b>a=c");
                                    else
                                    System.out.println("b>c>a");
		            
		}            
		    
		
		
		
		
		
		
		
		
	}
}


