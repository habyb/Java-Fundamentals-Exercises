
public class Exercise2_3 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		
//		for (int i = 0; i < 100; i++) {
//			sum = sum + i;
//			
//			if (sum < 100) {
//				System.out.println(i);
//			}
//		}
		
		int r = 0;
		int i = 0;
		
		while (r + i < 100) {
			System.out.println(i);
			
			r += i;
			
			i++;
		}

	}

}
