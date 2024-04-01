import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;     


public class mousemotion extends Frame implements MouseMotionListener{
    mousemotion(){
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

 

    public void mouseDragged(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fill3DRect(e.getX(), e.getY(), 20, 20,true);
    }

    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new mousemotion();
    }
}
