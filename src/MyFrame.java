import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    Container c;
    JPanel buttonPanel = new JPanel();
    JPanel displayPanel = new JPanel();
    public MyFrame() {
        c = getContentPane();
        setTitle("My First Simple Calculator");
        setLocation(150,150);
        setPreferredSize(new Dimension(355,450));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        MyPanel panel = new MyPanel();
        buttonPanel = panel.setButtonPanel();
        displayPanel = panel.setDisplayPanel();

        c.add(displayPanel);
        c.add(buttonPanel);
        c.add(panel);

        pack();
    }
}
