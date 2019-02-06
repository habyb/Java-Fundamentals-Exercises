public class Exercise1 {

	public static void main(String[] args) {
		
		// tests scores
		double score1 = 8.5;
		double score2 = 7.5;
		double score3 = 6.0;
		
		// test weights
		int weight1 = 3;
		int weight2 = 2;
		int weight3 = 5;
		
		// partial calculation of the score, multiplying the score by the weight
		double partial1 = score1 * weight1;
		double partial2 = score2 * weight2;
		double partial3 = score3 * weight3;
		
		// calculation of the average, where the sum of the partial ones occurs, divided by the sum of the weights
		double average = (partial1 + partial2 + partial3) / (weight1 + weight2 + weight3);
		
		System.out.println(average);
	}
}
