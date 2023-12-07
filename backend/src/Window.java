import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        setSize(500,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(500, 100));
        getContentPane().add(textLabel, BorderLayout.CENTER);
        setTitle("Test Frame");
        setVisible(true);
    }
}
