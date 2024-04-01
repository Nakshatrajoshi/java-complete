import javax.swing.*;
import javax.swing.JButton;
import  java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

public class login extends JFrame implements ActionListener{
    JButton b1;
    JPanel newPanel;
    JLabel userLabel,passLabel;
    final JTextField textField1,textField2;

    login(){
        userLabel= new JLabel();
        userLabel.setText("username");

        textField1 = new JTextField(20);
        passLabel = new JLabel();
        passLabel.setText("password");
        textField2 = new JPasswordField(10);

        b1 = new JButton("Submit");

        newPanel = new JPanel((new GridLayout(3,1)));
        newPanel.add(userLabel);

        newPanel.add(textField1);
        newPanel.add(passLabel);

        newPanel.add(textField2);
        newPanel.add(b1);

        add(newPanel,BorderLayout.CENTER);

        b1.addActionListener(this);

        setTitle("LOGIN ");

    }
    public void actionPerformed(ActionEvent ae){
        String uservalue =textField1.getText();
        String passvalue = textField2.getText();

        if (uservalue.equals("nakshatra@gmail.com")&& passvalue.equals("nakshatra")){
            Newpage page = new Newpage();

            page.setVisible(true);

            JLabel wel_label = new JLabel("welcome:"+uservalue);

            page.getContentPane().add(wel_label);
        }
        else
            System.out.println("please enter valid username and passward ");
    }
}

// class LoginFormDemo
// {
//    public static void main(String[] args) {
//        try{
//            login form =  new login();
//            form.setSize(500,250);
//            form.setVisible(true);
//        }
//        catch (Exception e){
//            JOptionPane.showMessageDialog(null,e.getMessage());

//        }
//    }
// }

