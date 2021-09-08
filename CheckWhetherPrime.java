package week1.day1;

public class CheckWhetherPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;
		boolean flag = false;
		
	    for(int i=2; i<=n/2; i++)
	    {
	    	
	    
	    	if(n%i==0)
	    	{
	    	
	    		flag = true;
	    		break;
	         }
	    	
	    }
	    
	    	if(!flag)
	    		System.out.println("Its a prime number");
	    	else
	    		System.out.println("Its not a prime number");
		

	}

}
