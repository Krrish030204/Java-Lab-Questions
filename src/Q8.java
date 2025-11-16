import java.awt.*;
import java.awt.event.*;

public class Q8 {
    public static void main(String[] args) {
        Frame f = new Frame("Sum of Two Numbers");

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        Label result = new Label("Result: ");
        Button b = new Button("Add");

        f.setLayout(new FlowLayout());
        f.add(new Label("Number 1:"));
        f.add(t1);
        f.add(new Label("Number 2:"));
        f.add(t2);
        f.add(b);
        f.add(result);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b2 = Integer.parseInt(t2.getText());
                int sum = a + b2;
                result.setText("Result: " + sum);
            }
        });

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
