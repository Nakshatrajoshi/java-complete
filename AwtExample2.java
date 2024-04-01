import java.awt.*;

class AwtExample2{
    AwtExample2(){
        Frame f = new Frame();
          
        Label l = new Label ("This is a label");  //creating

        Button b = new Button("Submit") ;

        TextField t = new TextField() ;

        l.setBounds(20, 80 , 80, 30);
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100,100,80,30);


        f.add(t);                               //adding components to the frame
        f.add(b);
        f.add(l);


        f.setSize(400,300);

        f.setTitle("Employee Information");

        f.setLayout(null) ;                      //using null layout manager
        f.setVisible(true);



    }

    public static void main(String[] args) {
        
        AwtExample2 awt = new AwtExample2() ;
    }
}
