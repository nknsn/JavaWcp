public class practice02 {
	public static void main(String[] args) {
		
		int number = 0;
		for ( int i = 1; i <= 10;  i++) {
			if (i % 2 == 0) {
				number++;
			} 
		}
		System.out.println(number);
		

		int total = 0;
		for( int i = 0; i <= 10; i += 2) {
			total += i;
		}
		System.out.println(total);
	}
}
