public class odd {
	public static void main(String[] args) {
		int start = 0;
		int finish = 150;
		int divis = 0;
		System.out.println(start);
		do 
			{
			divis = start % 2;
			start = start + 1;
			if (divis == 0) System.out.println(start);
			} while (start < finish);

	}
}
