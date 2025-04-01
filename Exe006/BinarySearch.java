import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(50)+1;
        int[] nums= new int[random.nextInt(50)+1];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]= random.nextInt(50)+1;
        }
        System.out.println(buscaBinaria(nums,target)?"Número encontrado!":"Número não encontrado!");
        System.out.println("Array: "+Arrays.toString(nums));
        System.out.println("Número procurado: " + target);
    }
    public static boolean buscaBinaria(int[] nums, int target){
        if (nums == null || nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        int left = 0;
        int right= nums.length-1;
        while (left<=right){
                int mid = left + (right - left) / 2;
                if(nums[mid]==target)
                    return true;
                if (nums[mid]<target)
                    left= mid+1;
                 else
                     right=mid-1;
        }
        return false;
    }
}
