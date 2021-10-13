public class Main
{
    
	public static void main(String[] args)
	{
		int x = 1, i = 2; // oszczedzamy niepotrzebne mnozenie 1 * 1
		
	    while(i <= 10)
	    {
            x *= i;
            i++;
	    }
	    
	    System.out.println(x);
	    
	}
}
