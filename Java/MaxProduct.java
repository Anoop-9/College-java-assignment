public class MaxProduct{
    public static void main(String[] args) {
        int[] nums = {10, 20, 1, 3, 2, 7, 8};
        System.out.print("Original Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        int[] result = findMaxProduct(nums);
        System.out.println("\nThree elements with the highest product: " + result[0] + ", " + result[1] + ", " + result[2]);
        System.out.println("Maximum Product: " + (result[0] * result[1] * result[2]));
    }

    public static int[] findMaxProduct(int[] nums) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("Array must have at least 3 elements.");
        }
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE; 
        int max3 = Integer.MIN_VALUE; 
 
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        return new int[]{max1, max2, max3};
    }
}
