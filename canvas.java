import java.awt.*;
 
  
// class to construct a frame and containing main method    
public class canvas  
{    
  // class constructor   
  public canvas()    
  {    
  
    // creating a frame  
    Frame f = new Frame("Canvas Example");   
    // adding canvas to frame   
    f.add(new MyCanvas());   
    
  
    // setting layout, size and visibility of frame  
    f.setLayout(null);    
    f.setSize(400, 400);    
    f.setVisible(true);    
   
  }    
  
  // main method  
  public static void main(String args[])    
  {    
    new canvas();    
  }    
}    

// class which inherits the Canvas class  
// to create Canvas  
class MyCanvas extends Canvas    
{    
        // class constructor  
        public MyCanvas() {    
        setBackground (Color.BLACK);    
        setSize(400, 400);    
     }    
  
     // paint() method to draw inside the canvas  
  public void paint(Graphics g)    
  {    
  
    // adding specifications  
    g.setColor(Color.red);    
    g.fill3DRect(100, 150, 200, 100,true);    
  }    
}       