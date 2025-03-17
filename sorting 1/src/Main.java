public class Main {
    public static void main(String[] args) {


        System.out.println("Hello, World!");
        int  arr[]={1,8,5,6,5,2,6,4};
        insertionSort(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    //bubble sort
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static  void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
             arr[minPos]=arr[i];
             arr[i]=temp;

        }
    }

    public static  void  insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int prev=i;
            while (prev>0 && arr[prev]>arr[prev-1]){
                int temp=arr[prev];
                arr[prev]=arr[prev-1];
                arr[prev-1]=temp;
                prev--;
            }

        }
    }
}