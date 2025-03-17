public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        int arr[][]={
                {1,2,4,19},
                {11,3,5,9},
                {4,9,12,43},
                {6,22,32,10}
        };
        spiralMatrix(arr);

        int sum=sumOfDigonal(arr);
        System.out.println(sum);
    }
    public static boolean findInSortedArray(int matrix[][],int key){
        int sr=0;
        int ec=matrix[0].length-1;
        while (sr<matrix.length && ec>=0){
            if(matrix[sr][ec]==key){
                return  true;
            }
            else if(key<matrix[sr][ec]){
                ec--;
            }
            else{
                sr++;
            }
        }
        return false;
    }

    public  static  int sumOfDigonal(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i][i];
             if(i!=arr[0].length-i-1)
                 sum+=arr[i][arr[0].length-1-i];
        }
        return sum;
    }

    public static  void spiralMatrix(int arr[][]){
        int sr=0;
        int er=arr.length-1;
        int sc=0;
        int ec=arr[0].length-1;
        while (er>=sr && ec>=sc ){

            for(int i=sc;i<=ec;i++){
                System.out.print(arr[0][i]+" ");
            }

            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }

            for(int i=ec-1;i>=sc;i--)
            {  if(sr==er){
                break;
            }
                System.out.print(arr[er][i]+" ");
            }
            for(int i=er-1;i>=sr;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(arr[i][sc]+" ");
            }
            sc++;
            ec--;
            sr++;
            er--;


        }





    }
}