
import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame parent = new JFrame();
        parent.setVisible(false);

        MyDialog dialog = new MyDialog(parent);
        dialog.setVisible(true);
    }
}