// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed = 1;
		int num = seed;
		int i = 0;
		int count = 1;

		while(seed <= N){
			if(mode.equals("v")){
				System.out.print(seed + " ");
			}
			while(i != 1){
				if(num % 2 == 0){
					num = num / 2;
				}
				else {
					num = num * 3 + 1;
				}
				if(mode.equals("v")){
					System.out.print(num + " ");
				}
				i = num;
				count++;
			}
			i = 0;
			seed++;
			num = seed;
			if(mode.equals("v")){
				System.out.println("(" + count + ")");
			}
			count = 1;
			}

		if(mode.equals("v")){
				System.out.println();
		}
		
		System.out.println("Every one of the first " + N 
							+ " hailstone sequences reached 1.");
	}
}
