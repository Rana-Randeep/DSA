                                   //SORT COLORS
 /*Given an array arr with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
 with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.*/

public class SortColors {

    static void sortColors(int[] arr,int n){
        //Initialize three pointers
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                swap(arr,high,mid);
                high--;
            }
        }
    }

    //Swap function
    static void swap(int[] arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    //Function to print the array
    static void printSortedArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

   //Main Method
    public static void main(String args[]){
        int[] arr={2,0,2,1,1,0};
        int n=arr.length;
        sortColors(arr,n);   //Calling a function to sort according to question.
        printSortedArray(arr,n);  //Output the sorted array by calling function
    }
}
