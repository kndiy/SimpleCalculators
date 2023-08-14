import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    JButton buttonNum1;
    JButton buttonNum2;
    JButton buttonNum3;
    JButton buttonNum4;
    JButton buttonNum5;
    JButton buttonNum6;
    JButton buttonNum7;
    JButton buttonNum8;
    JButton buttonNum9;
    JButton buttonDivide;
    JButton buttonMultiplier;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonEqual;
    JButton buttonDot;
    JLabel display;
    StringBuilder builder = new StringBuilder();
    double firstNum;
    double secondNum;
    double currentResult;
    char calAction;
    JButton buttonAC;

    public MyPanel() {
        buttonNum1 = new JButton("1");
        buttonNum1.setBackground(Color.gray);
        buttonNum1.addActionListener(this);
        buttonNum1.addActionListener(e -> {
                builder.append(buttonNum1.getText().charAt(0));

            });

        buttonNum2 = new JButton("2");
        buttonNum2.setBackground(Color.gray);
        buttonNum2.addActionListener(this);
        buttonNum2.addActionListener(e -> {
                builder.append(buttonNum2.getText().charAt(0));
            });

        buttonNum3 = new JButton("3");
        buttonNum3.setBackground(Color.gray);
        buttonNum3.addActionListener(this);
        buttonNum3.addActionListener(e -> {
            builder.append(buttonNum3.getText().charAt(0));
        });

        buttonNum4 = new JButton("4");
        buttonNum4.setBackground(Color.gray);
        buttonNum4.addActionListener(this);
        buttonNum4.addActionListener(e -> {
            builder.append(buttonNum4.getText().charAt(0));
        });

        buttonNum5 = new JButton("5");
        buttonNum5.setBackground(Color.gray);
        buttonNum5.addActionListener(this);
        buttonNum5.addActionListener(e -> {
            builder.append(buttonNum5.getText().charAt(0));
        });

        buttonNum6 = new JButton("6");
        buttonNum6.setBackground(Color.gray);
        buttonNum6.addActionListener(this);
        buttonNum6.addActionListener(e -> {
            builder.append(buttonNum6.getText().charAt(0));
        });

        buttonNum7 = new JButton("7");
        buttonNum7.setBackground(Color.gray);
        buttonNum7.addActionListener(this);
        buttonNum7.addActionListener(e -> {
            builder.append(buttonNum7.getText().charAt(0));
        });

        buttonNum8 = new JButton("8");
        buttonNum8.setBackground(Color.gray);
        buttonNum8.addActionListener(this);
        buttonNum8.addActionListener(e -> {
            builder.append(buttonNum8.getText().charAt(0));
        });

        buttonNum9 = new JButton("9");
        buttonNum9.setBackground(Color.gray);
        buttonNum9.addActionListener(this);
        buttonNum9.addActionListener(e -> {
            builder.append(buttonNum9.getText().charAt(0));
        });

        buttonDot = new JButton(".");
        buttonDot.setBackground(Color.gray);
        buttonDot.addActionListener(this);
        buttonDot.addActionListener(e -> {
            builder.append(buttonDot.getText().charAt(0));
        });

        buttonDivide = new JButton("/");
        buttonDivide.setBackground(Color.gray);
        buttonDivide.addActionListener(e -> {
            firstNum = Double.parseDouble(builder.toString());
            builder.setLength(0);
            calAction = buttonDivide.getText().charAt(0);
                });

        buttonMultiplier = new JButton("*");
        buttonMultiplier.setBackground(Color.gray);
        buttonMultiplier.addActionListener(e -> {
            firstNum = Double.parseDouble(builder.toString());
            builder.setLength(0);
            calAction = buttonMultiplier.getText().charAt(0);
        });

        buttonEqual = new JButton("=");
        buttonEqual.setBackground(Color.gray);
        buttonEqual.addActionListener(e -> {
            if (builder.length() != 0) secondNum = Double.parseDouble(builder.toString());
            builder.setLength(0);
            switch (calAction) {
                case '/' : currentResult = firstNum / secondNum;
                    display.setText(String.format("%,.6f", currentResult));
                    firstNum = currentResult;
                    break;
                case '*' : currentResult = firstNum * secondNum;;
                    display.setText(String.format("%,.6f", currentResult));
                    firstNum = currentResult;
                    break;
                case '+' : ;
                    currentResult = firstNum + secondNum;
                    display.setText(String.format("%,.6f", currentResult));
                    firstNum = currentResult;
                    break;
                case '-' : currentResult = firstNum - secondNum;;
                    display.setText(String.format("%,.6f", currentResult));
                    firstNum = currentResult;
                    break;
            }
        });
        buttonPlus = new JButton("+");
        buttonPlus.setBackground(Color.gray);
        buttonPlus.addActionListener(e -> {
            firstNum = Double.parseDouble(builder.toString());
            builder.setLength(0);
            calAction = buttonPlus.getText().charAt(0);
        });

        buttonMinus = new JButton("-");
        buttonMinus.setBackground(Color.gray);
        buttonMinus.addActionListener(e -> {
            firstNum = Double.parseDouble(builder.toString());
            builder.setLength(0);
            calAction = buttonMinus.getText().charAt(0);
        });

        buttonAC = new JButton("AC");
        buttonAC.setBackground(Color.gray);
        buttonAC.addActionListener(e -> {
            firstNum = 0;
            secondNum = 0;
            builder.setLength(0);
            display.setText("");
        });

        setBounds(0,0,340,370);
        setBackground(Color.cyan);
    }
    public JPanel setButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(20,100,300,250);

        GridLayout gridLayout = new GridLayout(0,4);
        gridLayout.setVgap(10);
        gridLayout.setHgap(10);

        buttonPanel.setLayout(gridLayout);

        buttonPanel.add(buttonNum1);    buttonPanel.add(buttonNum2);        buttonPanel.add(buttonNum3);    buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonNum4);    buttonPanel.add(buttonNum5);        buttonPanel.add(buttonNum6);    buttonPanel.add(buttonMinus);
        buttonPanel.add(buttonNum7);    buttonPanel.add(buttonNum8);        buttonPanel.add(buttonNum9);    buttonPanel.add(buttonEqual);
        buttonPanel.add(buttonDivide);  buttonPanel.add(buttonMultiplier);  buttonPanel.add(buttonDot);     buttonPanel.add(buttonAC);

        return buttonPanel;
    }

    public JPanel setDisplayPanel() {
        JPanel displayPanel = new JPanel();
        displayPanel.setBounds(20,20,300,70);
        displayPanel.setBackground(Color.white);

        display = new JLabel();

        FlowLayout flowLayout = new FlowLayout();
        displayPanel.setLayout(flowLayout);

        displayPanel.add(display);

        return displayPanel;
    }

    public void actionPerformed(ActionEvent ev) {
        display.setText(String.format("%,.6f", Double.parseDouble(builder.toString())));
    }
}
