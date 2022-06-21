
public class Practice04 {
	public static void main(String[] args) {
		int[] array = new int[20];
		for(int i = 1; i < array.length; i++) {
			int number = array[i - 1]+ 5;
			array[i] = number;
		} 
			
		for(int i = 0; i < 10; i++) {
			if(array[i] % 2 == 1) {
				System.out.print(array[i] + ",");
			} else {
				continue;
			}
		}
		
		for(int i = 0;  i < 19; i++) {
			if(array[i] % 2 == 0 && array[i] == array[18]) {
				System.out.print(array[i]);
			} else if( array[i] % 2 == 0 && array[i] > array[10]) {
				System.out.print(array[i] + ",");
			} else {
				continue;
			}
		}
	}		
}
