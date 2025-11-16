import java.awt.*;
import java.awt.event.*;

class Q13 {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label l = new Label("Old");
        Button b = new Button("Change");
        f.add(l); f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(300,200);
        f.setVisible(true);

        b.addActionListener(e -> l.setText("New"));
    }
}
