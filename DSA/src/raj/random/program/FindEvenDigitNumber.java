package raj.random.program;

public class FindEvenDigitNumber {
    public static void main(String[] args) {
        int[] nums = {12,33,545,2131,66666};

        for (int n : nums){
            int length = String.valueOf(n).length();

            if(length%2 == 0){
                System.out.println(n + " has Even digit");
            }

        }
    }
}
