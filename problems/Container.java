//program to calculate the container with most water
public class Container {

    //Brute Force (O(n^2))
    // public static int ContainerWithMostWater(int[] height) {
    //     int water = 0;

    //     for(int i=0; i<height.length; i++) {
    //         for(int j=i+1; j<height.length; j++) {
    //             int ht = Math.min(height[i], height[j]);
    //             int width = j-i;
    //             water = Math.max(water, ht*width);
    //         }
    //     }
    //     return water;
    // }

    //Two Pointer (O(n))
    public static int StoredWater(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right) {
            int ht = Math.min(height[left], height[right]);
            int width = right - left;
            water = Math.max(water, ht*width);

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println("Container with most water: "+StoredWater(height));
    }
}