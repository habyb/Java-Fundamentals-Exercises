
public class Exercise_2_4 {

	public static void main(String[] args) {
		
		int count = 0;
		int multi = 1;
		
		for(int i = 1; count < 10; i++) {
			
			if(i % 9 == 0) {
				System.out.println("9 x " + multi +  " = " + i);
				
				count++;
				multi++;
			}
		}
	}

}
