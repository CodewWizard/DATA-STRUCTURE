package CODES.CONTEST.Weekly332;

public class ArrayConcatenationValue {
    public static void main(String[] args) {
        int[] arr = {7,52,2,4};
        System.out.println(findTheArrayConcVal(arr));
    }

    public static long findTheArrayConcVal(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        long sum = 0;
        int size = nums.length;
        int i = 0;
        int j = size - 1;
        while(size > 0){
            if(i == j){
                sum += nums[i];
            }
            else{
                String a = Integer.toString(nums[i]);
                String b = Integer.toString(nums[j]);
                String concat = a + b;
                int ans = Integer.parseInt(concat);
                sum += ans;
            }
            nums[i] = 0;
            nums[j] = 0;
            i++;
            j--;
            size = size - 2;
        }
        return sum;
    }
}
