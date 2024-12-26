public class App {
    public static void main(String[] args) throws Exception {
       // twoSumTestCase(); uncomment to run corresponding test case
       
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
}
