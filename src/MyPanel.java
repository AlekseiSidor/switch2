import javax.swing.*;

public class MyPanel extends JPanel {
        public MyPanel(){
            setLayout(null);
            addLabel();
        }

    private void addLabel() {
            JLabel myLabel = new JLabel("Моя первая надпись!");
            myLabel.setBounds(300,280,200, 50);
            add(myLabel);
    }
}
