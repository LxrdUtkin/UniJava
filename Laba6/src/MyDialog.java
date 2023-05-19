import javax.swing.*;
import java.awt.*;

public class MyDialog extends JDialog {
    private JLabel label1, label2;
    private JTextField textField1, textField2;
    private JButton okButton, cancelButton;

    public MyDialog(JFrame parent) {

        super(parent, "Вікно входу", true);

        // components
        label1 = new JLabel("Логін");
        label2 = new JLabel("Пароль");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        okButton = new JButton("ОК");
        cancelButton = new JButton("Відміна");

        // position settings
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(5, 5, 5, 5);

        // add components
        gc.gridx = 0;
        gc.gridy = 0;
        add(label1, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        add(textField1, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(label2, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        add(textField2, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        add(okButton, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        add(cancelButton, gc);

        // window settings
        setSize(300, 200);
        setLocationRelativeTo(parent);
    }
}

