import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TestProgram extends JFrame implements ActionListener {

    private ArrayList<Integer> scores;
    private int currentQuestion;
    private JLabel questionLabel;
    private ButtonGroup answerGroup;
    private JRadioButton answer1;
    private JRadioButton answer2;
    private JRadioButton answer3;
    private JButton nextButton;
    private JLabel resultLabel;

    private static final String[][] QUESTIONS = {
            {"Хто був Київським князем 1263—1271?", "Ярослав Ярославич", "Кий", "Олександр Невський"},
            {"Хто був Київським князем 1271—1301?", "Станіслав Іванович", "Лев Данилович", "Іван Борисович"},
            {"Хто був Київським князем 1321—1324?", "Ольгимонт Гольшанський", "Семен Олелькович", "Міндовг Гольшанський"}
    };

    public TestProgram() {
        super("Test Program");

        scores = new ArrayList<Integer>();
        currentQuestion = 0;

        questionLabel = new JLabel(QUESTIONS[currentQuestion][0]);
        answer1 = new JRadioButton(QUESTIONS[currentQuestion][1]);
        answer2 = new JRadioButton(QUESTIONS[currentQuestion][2]);
        answer3 = new JRadioButton(QUESTIONS[currentQuestion][3]);
        answerGroup = new ButtonGroup();
        answerGroup.add(answer1);
        answerGroup.add(answer2);
        answerGroup.add(answer3);
        nextButton = new JButton("Далі");
        nextButton.addActionListener(this);
        resultLabel = new JLabel("");

        JPanel questionPanel = new JPanel(new GridLayout(4, 1));
        questionPanel.add(questionLabel);
        questionPanel.add(answer1);
        questionPanel.add(answer2);
        questionPanel.add(answer3);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(nextButton);
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultLabel);

        setLayout(new BorderLayout());
        add(questionPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(resultPanel, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (answer1.isSelected() && currentQuestion == 0
                || answer2.isSelected() && currentQuestion == 1
                || answer3.isSelected() && currentQuestion == 2) {
            scores.add(5);
        } else {
            scores.add(2);
        }

        currentQuestion++;

        if (currentQuestion == QUESTIONS.length) {
            resultLabel.setText("Бали: " + calculateAverageScore());
            nextButton.setEnabled(false);
        } else {
            questionLabel.setText(QUESTIONS[currentQuestion][0]);
            answer1.setText(QUESTIONS[currentQuestion][1]);
            answer2.setText(QUESTIONS[currentQuestion][2]);
            answer3.setText(QUESTIONS[currentQuestion][3]);
            answerGroup.clearSelection();
        }
    }

    private double calculateAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    public static void main(String[] args) {
        new TestProgram();
    }
}

