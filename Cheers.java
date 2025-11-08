//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int num = Integer.parseInt(args[1]);
            String condition = "AEFHILMNORSX";
            int i = 0;
            int j = 0;
        
            word = word.toUpperCase();
            while(i < word.length()){
                char letter = word.charAt(i);
                if(condition.indexOf(letter) != -1){
                        System.out.print("Give me an ");
                }
                else{
                        System.out.print("Give me a  ");
                }
                System.out.println(letter + ": " + letter + "!");
                i++;
            }
            System.out.println("What does that spell?");
            while(j < num){
                System.out.println(word + "!!!");
                j++;
            }
        }
}
