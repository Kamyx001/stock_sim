import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Window window = new Window("window");
            window.addButton("Click me!", 200, 200, 100, 50, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        });

    }
}