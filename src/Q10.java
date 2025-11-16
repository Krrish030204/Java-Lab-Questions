import java.awt.*;

class Q10 {
    public static void main(String[] args) {
        Frame f = new Frame("Layouts");
        f.setSize(300,200);
        f.setLayout(new BorderLayout());
        f.add(new Button("North"), BorderLayout.NORTH);
        f.add(new Button("South"), BorderLayout.SOUTH);
        f.add(new Button("East"), BorderLayout.EAST);
        f.add(new Button("West"), BorderLayout.WEST);

        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        p.add(new Button("A"));
        p.add(new Button("B"));
        f.add(p, BorderLayout.CENTER);

        f.setVisible(true);
    }
}
