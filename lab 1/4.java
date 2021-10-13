public class Main
{
    
	public static void main(String[] args)
	{
		float k = 1000;
		
		for(int i=0; i<3; i++)
	    {
	        k += k * 0.06;
	        
	        System.out.println(k);
	        
	    }
	    
	}
}
