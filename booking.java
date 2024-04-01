import java.util.Scanner;
import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
public class booking {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println(" choose the value  "+"1. Sinup"+"2. login");
         int a = sc.nextInt();
         if(a==1) {
             Sinup f = new Sinup();
         }
         else if (a==2) {

             try {
                 login form = new login();
                 form.setSize(500, 250);
                 form.setVisible(true);
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
             }


         }


    }
}
