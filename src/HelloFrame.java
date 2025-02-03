import javax.swing.*;
import java.util.Random;

public class HelloFrame extends JFrame {
    private JTextField vyp;
    private JButton generujButton;
    private JButton kopirujButton;
    private JTextField gen;
    private JLabel cislo;
    private JLabel vypis;
    private JPanel panel;

    public HelloFrame(){
        initComponents();

    }

    private void initComponents(){
        setContentPane(panel);
        setTitle("generování čísel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        generujButton.addActionListener(e -> generovaniCisel());
        kopirujButton.addActionListener(e -> vypis());
        setSize(800,600);
       vyp.setEditable(false);


    }

    private void generovaniCisel(){
        Random rd = new Random();
        int nahodneCislo = rd.nextInt(100 - 1);
        gen.setText(String.valueOf(nahodneCislo));



    }

    private void vypis(){
        String existujiciVypis = vyp.getText();
        if(gen.getText().length() != 0){
            vyp.setText(existujiciVypis + gen.getText() + "\n");
        }


    }
}
