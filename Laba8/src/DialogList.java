import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class DialogList extends JFrame implements ActionListener {

    private JLabel label;
    private JTextField textField;
    private JButton addButton, printButton;
    private ArrayList<String> inputList;

    public DialogList() {
        super("Input Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);

        inputList = new ArrayList<String>();

        JPanel panel = new JPanel(new FlowLayout());
        label = new JLabel("Enter text: ");
        textField = new JTextField(20);
        addButton = new JButton("Add");
        printButton = new JButton("Print");

        addButton.addActionListener(this);
        printButton.addActionListener(this);

        panel.add(label);
        panel.add(textField);
        panel.add(addButton);
        panel.add(printButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String text = textField.getText();
            inputList.add(text);
            textField.setText("");
        } else if (e.getSource() == printButton) {
            printList();
        }
    }

    private void printList() {
        StringBuilder sb = new StringBuilder();
        for (String input : inputList) {
            sb.append(input).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

}
