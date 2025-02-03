import javax.swing.*;
import java.util.Random;

public class HelloFrame extends JFrame {
    private JTextField textField1;
    private JButton generujButton;
    private JButton kopirujButton;
    private JTextField textField2;
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
       textField1.setEditable(false);


    }

    private void generovaniCisel(){
        Random rd = new Random();
        int nahodneCislo = rd.nextInt(100 - 1);
        textField2.setText(String.valueOf(nahodneCislo));



    }

    private void vypis(){
        String existujiciVypis = textField1.getText();
        if(textField2.getText().length() != 0){
            textField1.setText(existujiciVypis + textField2.getText() + "\n");
        }


    }
}
