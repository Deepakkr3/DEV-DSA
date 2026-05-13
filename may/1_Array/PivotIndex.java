public class PivotIndex {
    public static void main(String[] args) {
  
        // write your code here
        int res=fun(new int[]{2,1,-1});
        System.out.println(res);
    }

    public static int fun(int arr[]){
        int sum =0;
        for(int x:arr){
            sum+=x;
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            int rightSum=sum-leftSum-arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}
