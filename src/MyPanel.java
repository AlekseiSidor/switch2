import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private final int W = 800;
    private final int H = 600;
        public MyPanel(){
            setLayout(null);
            setPreferredSize(new Dimension(W, H));
            addLabels();
            addBattons();

            JComboBox<Integer> a = new JComboBox<>();
            for (int i = 4; i < 100; i+=2){
                a.addItem(i);
            }
        }

    private void addBattons() {
            JButton button = new JButton("knopka");
            button.setBounds(0,0,100,30);

            add(button);
    }

    private void addLabels() {
            JLabel myLabel = new JLabel("Моя первая надпись!");
            myLabel.setBounds(0,0,200, 50);
            add(myLabel);
    }
}
