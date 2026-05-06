public class MaxProfit {
    public static void main(String[] args) {
        int arr[] = { 3, 3, 3, 3, 9 };
        int res = maxProfit(arr);
        System.out.println(res);

    }

    public static int maxProfit(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                max = Math.max(max, profit);
            }

        }

        return max;
    }
}
