package array;

public class RotateArray {

    //simple solution but time complexity is more
    public static void rotate(int[] nums, int k) {
        if(k==0 || k==nums.length) return;
        k = k%nums.length;
        if(k<0) k=k+nums.length;
        System.out.println("k: "+k);
        for(int i=0; i<k; i++) {
            int temp = nums[nums.length-1]; //last element
            System.out.println("Temp: "+temp);
            for(int j=nums.length-1; j>0; j--){
                nums[j] = nums[j-1]; //swapping
            }
            nums[0] = temp; //last element to first index
            for(int n: nums) System.out.println(n);
        }
    }

    //this solution give use the best time complexity
    public static void rotate2(int[] nums, int k){
        k%=nums.length;
        if(k<0) k+=nums.length;

        reverse(nums, 0, nums.length-1); //reverse full array
        reverse(nums, 0, k-1); //reverse first k elements
        reverse(nums, k, nums.length-1); //reverse remaining array to its actual position
    }

    //logic for reversing the array
    public static void reverse(int[] nums, int start, int end){
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
//        rotate(arr, k);
        rotate2(arr, k);

        System.out.println("Output: ");
        for(int a:arr) {
            System.out.println(a);
        }
    }


}
