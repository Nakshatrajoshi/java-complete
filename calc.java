import java.awt.*;
import java.awt.event.*;

public class calc extends Frame implements ActionListener{

    TextField tf1,tf2,tf3;
    Button b1,b2,b3,b4;
    private char[] c;

       calc(){
        tf1 = new TextField();
        tf1.setBounds(50, 50, 250, 20);
        tf2 =new TextField();
        tf2.setBounds(50, 100, 250, 20);
        tf3= new TextField();
        tf3.setBounds(50, 150, 250, 20);
        tf3.setEditable(false);
        b1 = new Button("+");
        b1.setBounds(50 ,200, 50,50 );
        b2 = new Button("-");
        b2.setBounds(120,200,50,50);
        b3 = new Button(" X ");
        b3.setBounds(180,200,50,50);
        b4 = new Button("/");
        b4.setBounds(240,200, 50, 50);



        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);


        setSize(350,300);
        setLayout(null);
        setVisible(true);
       }

       public void actionPerformed(ActionEvent e)
       {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        double a = Integer.parseInt(s1);
        double b = Integer.parseInt(s2);

        double c = 0;
        if (e.getSource() == b1) {
            c = a + b ;
  
        }

        else if (e.getSource() == b2){
        c = a-b;
    
       }

       else if(e.getSource() == b3){
        c = a * b ;
       }

       else if(e.getSource() == b4 ){
         c = a / b ;
       }

       String result = String.valueOf(c);
       tf3.setText(result);
    }
    

    public static void main(String[] args){
        new calc();
    }
}

       
