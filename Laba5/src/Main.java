import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        DoubleVector vector = new DoubleVector(new double[] {5, 3, 6});
        DoubleVector vectorOther = new DoubleVector(new double[] {2, 1, 3});
        String[] results = vector.TestVector(vectorOther, 3);

        JFrame frame = new JFrame("Test Vector");
        frame.setSize(500, 500);

        JLabel label1 = new JLabel(results[0]);
        JLabel label2 = new JLabel(results[1]);
        JLabel label3 = new JLabel(results[2]);

        JPanel c = new JPanel();
        frame.add(c);

        c.add(label1);
        c.add(label2);
        c.add(label3);

        c.setLayout(new FlowLayout());

        frame.setVisible(true);
    }
}