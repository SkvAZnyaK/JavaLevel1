package Lesson7;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
        setLayout(new FlowLayout());
        add(new JLabel("Какой-то текст"));
        add(new JButton("Кнопуля"));
    }
}
