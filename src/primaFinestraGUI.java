import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primaFinestraGUI extends JFrame{
    private JPanel primaFinestra;
    private JButton AVANTIButton;

    public primaFinestraGUI(boolean[][] sotto, Connessione c1){
        try {//interfaccia di sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e){

        }
        setContentPane(primaFinestra);
        setTitle("INIZIALE");
        setSize(800, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        AVANTIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI m1 = new menuGUI(sotto, c1);
                setVisible(false);
            }
        });
    }
}
