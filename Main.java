import javax.swing.*;
import java.awt.*;

void main() {
    JFrame window = new JFrame();
    KeyPad keyPad = new KeyPad(window);
    keyPad.display();
    JTextField textField = new JTextField();
    textField.setEditable(false);
    window.add(textField,BorderLayout.NORTH);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.add(keyPad.panel, BorderLayout.CENTER);
    window.pack();
    window.setLocationRelativeTo(null);



//    JTextField display = new JTextField();
//    display.setEditable(false);
//    panel.add(display, BorderLayout.NORTH);

    window.setVisible(true);
}
