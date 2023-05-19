import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import javax.swing.*;

public class PhoneBook extends JFrame implements ActionListener {

    private JTextField nameField, phoneField;
    private JLabel countLabel;
    private TreeSet<String> entries;

    public PhoneBook() {
        super("Phone Book");

        entries = new TreeSet<>();

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel("Прізвище:");
        nameField = new JTextField();
        JLabel phoneLabel = new JLabel("Телефони:");
        phoneField = new JTextField();

        JButton addButton = new JButton("Додати");
        addButton.addActionListener(this);
        JButton printButton = new JButton("Друкувати");
        printButton.addActionListener(this);

        countLabel = new JLabel("0 записів");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(phoneLabel);
        inputPanel.add(phoneField);
        inputPanel.add(addButton);
        inputPanel.add(printButton);

        add(inputPanel, BorderLayout.NORTH);
        add(countLabel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Додати")) {
            String name = nameField.getText();
            String phones = phoneField.getText();
            entries.add(name + " - " + phones);

            countLabel.setText(entries.size() + " записів");
            nameField.setText("");
            phoneField.setText("");
        } else if (command.equals("Друкувати")) {
            System.out.println("Телефонна книжка:");
            for (String entry : entries) {
                System.out.println(entry);
            }
        }
    }
}

