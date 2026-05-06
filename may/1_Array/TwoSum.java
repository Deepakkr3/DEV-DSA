class TwoSum {

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int n = 13;
        int res[] = sum(arr, n);
        System.out.println(res[0] + " " + res[1]);

    }

    public static int[] sum(int arr[], int n) {
        int res[] = new int[2];
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == n) {
                res[0] = i;
                res[1] = j;
                return res;
            } else if (sum > n) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}