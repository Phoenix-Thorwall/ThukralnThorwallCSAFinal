import javax.swing.*;
import java.awt.*;

//source: https://stackoverflow.com/questions/18777893/jframe-background-image

class BackgroundImageJFrame extends JFrame {
    JButton b1;
    JLabel l1;

    public BackgroundImageJFrame() {
        setTitle("Background Color for JFrame");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("src/image5.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        l1=new JLabel("Here is a button");
        b1=new JButton("I am a button");
        background.add(l1);
        background.add(b1);
        setVisible(true);
    }

} 