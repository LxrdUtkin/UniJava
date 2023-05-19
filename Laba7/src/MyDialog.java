import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyDialog extends JFrame {

    JLabel inputLabel = new JLabel("Поле вводу:");
    JTextField inputField = new JTextField(20);

    JLabel outputLabel = new JLabel("Поле виводу:");
    JTextField outputField = new JTextField(20);

    JButton btn = new JButton("Скопіювати");

    MyDialog() {
        super("Копіювання");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputField.setText(inputField.getText());
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        JPanel outputPanel = new JPanel();
        outputPanel.add(outputLabel);
        outputPanel.add(outputField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btn);

        Container c = getContentPane();
        c.add(inputPanel, BorderLayout.NORTH);
        c.add(outputPanel, BorderLayout.CENTER);
        c.add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyDialog();
    }
}


