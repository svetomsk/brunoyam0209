package lesson13.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaUIExample {

    public static void main(String[] args) {
        JFrame window = new JFrame("My first UI!");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(new Dimension(450, 570));
        window.setLocationRelativeTo(null);
        window.setLayout(new FlowLayout());
//        window.setUndecorated(true);

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.setPreferredSize(new Dimension(400, 70));
//        inputPanel.setBackground(Color.BLUE);
        initInputPanel(inputPanel);


        JPanel buttonsPanel = new JPanel(new GridLayout(4, 4));
        buttonsPanel.setPreferredSize(new Dimension(400, 400));
//        buttonsPanel.setBackground(Color.BLACK);

        initButtonsPanel(buttonsPanel);

        window.add(inputPanel);
        window.add(buttonsPanel);

        window.setVisible(true);
    }
    private static void initButtonsPanel(JPanel panel) {
        String [][] symbols = {
                {"7", "8", "9", "+"},
                {"4", "5", "6", "-"},
                {"1", "2", "3", "*"},
                {"0", "<<<", "=", "/"}
        };
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                JButton currentButton = new JButton(symbols[i][j]);
                currentButton.addActionListener(actionEvent -> {
                    // TODO: обработать нажатие цифр, операций и удаление символа
                    // TODO: отдельно реализовать вычисление значения выражения
                    String buttonText = actionEvent.getActionCommand();
                    String currentText = inputArea.getText();
                    if (buttonText.equalsIgnoreCase("<<<")) {

                    }else if (buttonText.equalsIgnoreCase("=")) {

                    } else {
                        currentText += buttonText;
                        inputArea.setText(currentText);
                    }
//                    inputArea.setText(actionEvent.getActionCommand());
                });
                panel.add(currentButton);
            }
        }
    }

    private static JTextField inputArea;

    private static void initInputPanel(JPanel panel) {
        inputArea = new JTextField("0");
        inputArea.setPreferredSize(new Dimension(380, 45));
        panel.add(inputArea);

        JLabel errorField = new JLabel();
        errorField.setPreferredSize(new Dimension(150, 25));
        panel.add(errorField);
    }
}
