import java.util.ArrayList;
public class prime {
	public static void main(String[] args) {
		ArrayList primes = new ArrayList();
		int start = 2;
		int finish = 150;
		int divis = 0;
		int countup = 0;
		int isprime = 0;
		System.out.println(start);
		do 
			{
			countup = 2;
			isprime = 1;
			do
				{
				divis = start % countup;
				if (divis == 0) isprime = 0;
				countup = countup + 1;
				} while (countup < start);
			if (isprime==1) primes.add(start);
			start = start + 1;
			} while (start < finish);
		System.out.println(primes);
	}
}
