import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dialog4 extends JFrame {
    JTextField fld = new JTextField(20);
    JButton btn = new JButton("Натиснути");
    JLabel lbl = new JLabel(" ");

    Dialog4() {
        super("Слухачі (listeners) полів та кнопок");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
        }
        setSize(400, 150);
        Container c = getContentPane();
        c.add(lbl, BorderLayout.NORTH);
        c.add(fld, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnPanel.add(btn);
        c.add(btnPanel, BorderLayout.SOUTH);

        fld.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Введений текст:"+fld.getText());
            }
        });

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Натиснута кнопка");
            }
        });

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Dialog4();
    }
}


