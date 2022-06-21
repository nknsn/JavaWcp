
public class Execise02 {
	public static void main(String[] args) {
		int count = 0;
		for( int i = 1; i <= 10; i++) {
			if( i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		int total = 0;
		for( int i = 0; i <= 10; i += 2) {
			total += i; 
		}
		System.out.println(total);
	}
}
