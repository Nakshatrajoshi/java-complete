import java.util.Scanner;

public class BinarySearch {
    public static int Binarysearch(int []arr , int key){
        int low = 0;
        int high = arr.length -1 ;
        int mid = (low + high ) / 2;

        if(key < arr[mid]){
            high = mid - 1;
        }
        else if(key == arr[mid]){
            return mid;
        }
        else{
            low = mid + 1 ;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int a = s.nextInt();
        int [] arry = new int [a];
        for(int i= 0 ; i<a ; i++){
            System.out.print("Enter element "+(i+1)+ " : ");
            arry[i] =s.nextInt() ;
        }
        System.out.println("Enter the search value ");
        int key = s.nextInt();
        int result = Binarysearch(arry,key);
       if (result == -1){
        System.out.println("Element not found in the list ");
       }
       else{
        System.out.print("The element is present at index " + result );
       }

    }
}