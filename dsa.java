import java.util.Scanner;

class dsa{
    /**
     * @param args
     */
    public static void main(String[] args) {
     System.out.println("enter the value of a and b ");
     Scanner op = new Scanner(System.in);
     int a = op.nextInt();
     int b = op.nextInt();
     if(a < b ){
         System.out.println(" b is greater ");

     }
     else {
        System.out.println(" a is greater ");
     }
     
    }
}

