public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] nums1 = {7,1,5,3,6,4};
        int result1 = maxProfit(nums1);
        System.out.println("Maximum Profit : "+ result1);
        System.out.println("Time Complexity: O(n) since we only pass through the prices array once. ");
        System.out.println("Space Complexity: O(1) as no additional space is required beyond a few variables.");

    }
}