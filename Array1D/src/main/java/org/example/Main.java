package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int arr[]={
                7,1,5,3,6,4
        };
//        int result=binerySearch(arr,10);
//        System.out.println(result);
//        allSubArray(arr);
        int max1 =maxProfit(arr);

        System.out.println(max1);

    }
    public static int trapWater(int[] height) {
        int ans=0;
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=right.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }

        for(int i=0;i<left.length;i++){
            ans+=Math.min(left[i],right[i])-height[i];
        }
        return ans;


    }
    public static int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                max=Math.max(max,profit);
            }
            else{
                buy=prices[i];
            }


        }
        return max;

    }
    public static int maxSubArraySum1(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentSum=0;
                for(int k=i;k<=j;k++){
                    currentSum+=arr[k];
                }

                max=Math.max(max,currentSum);

            }

        }
        return  max;

    }
public static int maxSubArraySumWithPrifixSum(int arr[]){
        int max=Integer.MIN_VALUE;
        int preFix[]=new int[arr.length];
        preFix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            preFix[i]=preFix[i-1]+arr[i];
        }

        for(int i=1;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currSum=i>0?preFix[j]-preFix[i-1]:preFix[j];
                max=Math.max(currSum,max);
            }

        }
        return   max;
}

    public static  int binerySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static  void  allSubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }



}