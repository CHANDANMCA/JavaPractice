package java_22_12_2022;

public class IsPrimeNumber {
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(23));
		boolean isPrime=true;
		String primeNumberString="";
		for(int i=2;i<=100;i++) {
			isPrime=isPrimeNumber(i);

			if(isPrime) {
				primeNumberString+=i+" ";
			}
		}
		System.out.println(primeNumberString);

	}

	public static boolean isPrimeNumber(int num) {

		if(num==0 || num==1)
			return false;

		if(num==2)
			return true;

		for(int j=2;j<=10;j++) {
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)	{
				//System.out.println(num+"is not  a prime number");
				return false;

			}
		}
		}
		//System.out.println(num+" "+"is a prime number");
		return true;

	}

}
