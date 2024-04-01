import javax.swing.JFileChooser;

public class filechooser {
    public static void main(String[] args) {
        JFileChooser f = new JFileChooser("c :");
        f.showSaveDialog(null);
    }
}
