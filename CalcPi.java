// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		int i = 0;
		double sum = 0;
		double denominator = 1;

		while(i < num){
			if(i % 2 == 0){
				sum = sum + 1 / denominator;
			}
			else{
				sum = sum - 1 / denominator;
			}
			
			i++;
			denominator = denominator + 2;
		}
		
		double approx = sum * 4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approx);	
	}
}
