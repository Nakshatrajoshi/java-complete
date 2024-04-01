import java.util.Scanner;

public class partime {

    
    public static void main(String[] args) {
    int size , i ,count = 0 ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the array ");
    size=sc.nextInt();
    int [] a = new int[size];
    System.out.println("Enter the element in the array");
    for (i =0; i< size; i++){
        a [i]=sc.nextInt() ;
    }
    for (i = 0; i < size; i++) {
        if(a[i] >= 0){
            System.out.println(" This number is postive "+ a[i]);
          
        System.out.println(count);
        }
        else {
            System.out.println(" Number is negative "+ a[i]);
        }
    }
    }
}