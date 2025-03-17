public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        int arr[]={
                1,8,6,3,8,5,6,5,9,12,8,2
        };
        quickSort(arr,0,arr.length-1);
        for(int e:arr){
            System.out.print(e+" ");
        }
//         int arr2[]={4,5,6,7,10,2,3};
//        int ind=findIndSortedAndRotatedArray(arr2,5,0,arr.length-1);
//        System.out.println(ind);

    }
    public static  int findIndSortedAndRotatedArray(int arr[],int key,int si,int ei){
        if(si>=ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
         if(arr[mid]==key){
             return mid;
         }
          if(arr[si]<=arr[mid]){
             if( arr[si]<=key && key <arr[mid]){
               return findIndSortedAndRotatedArray(arr,key,si,mid-1);
             }
             else{
                 return findIndSortedAndRotatedArray(arr,key,mid+1,ei);
             }
         }
          else{
              if(arr[mid]<key && key<=arr[ei]){
                  return findIndSortedAndRotatedArray(arr,key,mid+1,ei);
              }
              else{
                  return findIndSortedAndRotatedArray(arr,key,si,mid-1);
              }
          }



    }


    public  static  void  mergeSort(int arr[],int si,int ei){
       if(si>=ei){
           return;
       }

        int mid=si+ (ei-si)/2;

        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei){


            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];

            }
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=ei){
            temp[k++]=arr[j++];
        }

        for(int m=0;m<temp.length;m++){
            arr[si+m]=temp[m];
        }
    }

    public static void  quickSort(int arr[],int si,int ei){
        if(si>=ei)
        {
            return ;
        }

        int pindex=partation(arr,si,ei);
        quickSort(arr,si,pindex-1);
        quickSort(arr,pindex +1,ei);
    }
    public static int partation(int arr[],int si,int ei){
      int piviot=arr[ei];  //let last index is pivot
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<piviot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        int temp=arr[i];
        arr[i]=piviot;
        arr[ei]=temp;
        return i;


    }
}