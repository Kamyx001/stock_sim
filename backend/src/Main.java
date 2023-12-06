import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(500, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.setTitle("Test Frame");
        frame.setVisible(true);
    }

}