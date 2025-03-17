public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        printInc(10);
//        int fact=fact(5);
//        int sumof=sumOfNaturalNum(5);
//        int feb=Nthfebonaccie(6);
//        int arr[]={1,5,9,23,58,59,23};
//        System.out.println(lastOcc(arr,23,arr.length-1));
        System.out.println(powerOfN(2,4));
    }

    public  static  int powerOfN(int x,int n){
        if(n==0 || x==1 ){
            return 1;
        }
        return x*powerOfN(x,n-1);
    }

    public static int firstOcc(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }
    public static int lastOcc(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,key,i-1);
    }

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static  int Nthfebonaccie(int n){
        if(n==1|| n==2 ){
            return 1;
        }
        return Nthfebonaccie(n-1)+Nthfebonaccie(n-2);

    }
    public static  int sumOfNaturalNum(int n){
        if(n==1 || n==0){
            return n;
        }
        return n+sumOfNaturalNum(n-1);
    }

    public static  void  printDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDec(n-1);

    }
    public static  void  printInc(int n){
        if(n==0){
            return;
        }

        printInc(n-1);
        System.out.println(n);

    }
    public static  int fact(int n){
        if(n==1 || n==0 ){
            return 1;
        }
        return n*fact(n-1);
    }
}