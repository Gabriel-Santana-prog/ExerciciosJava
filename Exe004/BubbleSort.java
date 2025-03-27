import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums= new int[10];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]= random.nextInt(100-1+1)+1;
        }
        for (int i = 0; i < nums.length ; i++) {
            for(int j = i+1; j < nums.length ; j++) {
                if(nums[i]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
