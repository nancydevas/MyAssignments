package week1.day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0, secNum = 1, sum = 0;
		for(int i = 1; i<=11; i++)
		{
			sum = firstNum + secNum;
		    System.out.println(firstNum);
		    firstNum = secNum;
		    secNum = sum;
		}

	}

}
