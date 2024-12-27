public class App {
    public static void main(String[] args) throws Exception {
       // twoSumTestCase(); uncomment to run corresponding test case
       PalindromeTest();
       
    }

    public static void twoSumTestCase(){
        int[] nums = {3,2,4};
        TwoSum test = new TwoSum();
        int[] results = test.twoSum(nums, 6);
        int i = 0;
        System.out.print("The results are: ");
        while (i < results.length) {
            System.out.print(results[i] + " ");
            i++;
        }
    }

    public static void PalindromeTest() {
        int[] testNums = {121, -121, 10, 11};
        Palindrome checkPalindrome = new Palindrome();
        
        for (int i = 0; i < testNums.length; i++) {
            System.out.println( i+1 + ". Is " + testNums[i] + " a Palindrome? -> " +
                checkPalindrome.isPalindrome(testNums[i]));
        }
        
    }
}
