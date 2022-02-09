import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        setTitle("uuuuuu");
        setBounds(200,200,800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        getContentPane().add(panel);
    }

    public void run(){
        setVisible(true);
    }
}
