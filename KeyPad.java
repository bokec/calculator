import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;

public class KeyPad {
    int buttonSize = 75;

    int rowsNr = 5;
    int colsNr = 4;

    int keyPadWidth = buttonSize * colsNr;
    int keyPadHeight = buttonSize * rowsNr;

    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMult;
    JButton buttonDiv;
    JButton buttonPercent;
    JButton buttonEquals;
    JButton buttonComma;
    JButton buttonNegate;

    JButton buttonBack;
    JButton buttonClear;

    JPanel panel;

    public KeyPad(JFrame frame)
    {
        panel = new JPanel();

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMult = new JButton("*");
        buttonDiv = new JButton("/");
        buttonPercent = new JButton("%");
        buttonEquals = new JButton("=");
        buttonComma = new JButton(",");
        buttonNegate = new JButton("+/-");
        buttonBack = new JButton("<-");
        buttonClear = new JButton("AC");
    }
//    //public void onClickButton1(){
//        button1.addActionListener(listener);
//    }
    public void display()
    {
        panel.setLayout(new GridLayout(5,4,10,10));

        panel.add(buttonBack);
        panel.add(buttonClear);
        panel.add(buttonPercent);
        panel.add(buttonDiv);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonMult);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMinus);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonPlus);
        panel.add(buttonNegate);
        panel.add(button0);
        panel.add(buttonComma);
        panel.add(buttonEquals);
    }
}
