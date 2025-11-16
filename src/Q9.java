import java.awt.*;
import java.awt.event.*;

class Q9 {
    public static void main(String[] args) {
        Frame f = new Frame();
        Button b = new Button("Change");
        f.add(b);
        f.setSize(300,200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        b.addActionListener(e -> f.setBackground(Color.yellow));
    }
}
