import java.util.Scanner;

public class sorting {
    public static void selectionsort(int  [] list){
        for (int i = 0 ; i < list.length-1;i++){
            int  min=list[i];
            int indexmin=i;
            for (int j = i + 1 ; j < list.length; j++) {
                if (list [j] <= min ){
                    min=list[j];
                    indexmin=j;
                }
                }
                if(indexmin != i){
                  list[indexmin] = list[i];
                  list[i] = min;
                }
                
            }
        }
        public static void main(String[] args) {
            System.out.println("Enter the number of the element ");
            Scanner s = new Scanner(System.in);
            int n =s.nextInt();
            int [] arr = new int [n];
            System.out.println("Enter the number of elemnts in the list ");
            for(int i=0;i<n;++i){
                arr[i]=s.nextInt();
            }
              sorting.selectionsort(arr);
              System.out.println("Array after sorting ");
              for (int  d : arr) {
                System.out.println(d + " ");
              }
        }
}