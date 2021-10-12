package Lesson7;

import javax.swing.*;
import java.awt.*;

public class Window1 extends JFrame {

    public Window1() {
        setTitle("Window1");
        setBounds(10, 10, 800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Panel eastPanel = new Panel();
        Panel westPanel = new Panel();
        Panel northPanel = new Panel();
        Panel southPanel = new Panel();
        Panel centerPanel = new Panel();
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);
        setVisible(true);
    }

}
