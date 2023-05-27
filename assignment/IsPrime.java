package week1.day1.assignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11; 
		boolean value=false;
		for (int i=2 ; i<=n-1 ; i++)
		{
			
			if(n%i==0)
			{ 
				value = true;
				break;
			}
			
		}
	
		if (value == false)
		{
		
				System.out.println(n + " is a Prime Number");
		}
		else
		{
			System.out.println(n + " is not a prime number");
		}
		}
	}


