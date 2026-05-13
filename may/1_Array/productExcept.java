class productExcept {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4 };

        int res[] = productExceptFun(arr);
        for (int x : res) {
            System.out.print(x + " ");

        }
    }

    public static int[] productExceptFun(int arr[]) {
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int currentProduct = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    currentProduct *= arr[j];
                }

            }
            res[i] = currentProduct;
        }
        return res;

    }
}
