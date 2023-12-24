import javax.swing.*;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(String title) {
        super(title);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JButton addButton(String title, int x, int y, int width, int height, ActionListener listener) {
        JButton button = new JButton(title);
        button.setBounds(x, y, width, height);
        button.addActionListener(listener);
        add(button);
        return button;
    }

    public JTextField addInput(String title, int x, int y, int width, int height) {
        JTextField input = new JTextField(title);
        input.setBounds(x, y, width, height);
        add(input);
        return input;
    }
}