import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MPE extends JFrame implements ActionListener {

    JRadioButton radioButtonE,radioButtonM,radioButtonP;
    JButton b1, b2;

    public MPE() {

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 964, 750);
        panel.setLayout(null);
        panel.setBackground(Color.PINK);
        add(panel);

        radioButtonM = new JRadioButton("MANAGER");
        radioButtonM.setBounds(40, 20, 130, 30);
        radioButtonM.setBackground(Color.MAGENTA);
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD, 16));
        radioButtonM.setForeground(Color.BLACK);
        panel.add(radioButtonM);

        radioButtonE = new JRadioButton("EMPLOYEE");
        radioButtonE.setBounds(40, 70, 130, 30);
        radioButtonE.setBackground(Color.MAGENTA);
        radioButtonE.setFont(new Font("Tahoma", Font.BOLD, 16));
        radioButtonE.setForeground(Color.BLACK);
        panel.add(radioButtonE);

        radioButtonP = new JRadioButton("PASSENGER");
        radioButtonP.setBounds(40, 120, 130, 30);
        radioButtonP.setBackground(Color.MAGENTA);
        radioButtonP.setFont(new Font("Tahoma", Font.BOLD, 16));
        radioButtonP.setForeground(Color.BLACK);
        panel.add(radioButtonP);

        ButtonGroup buttonGroupas = new ButtonGroup();
        buttonGroupas.add(radioButtonM);
        buttonGroupas.add(radioButtonE);
        buttonGroupas.add(radioButtonP);

        b1 = new JButton("OK");
        b1.setBounds(40, 170, 120, 30);
        b1.setFont(new Font("Tahoma", Font.BOLD, 16));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(40, 170, 120, 30);
        b2.setFont(new Font("Tahoma", Font.BOLD, 16));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        panel.add(b2);

        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        setLocation(300, 80);
        setSize(964, 750);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b1) {
            if (radioButtonM.isSelected()) {
                new LoginSignupM();
            }
            if (radioButtonP.isSelected()) {
                new LoginSignupP();
            }
            if (radioButtonE.isSelected()) {
                new LoginSignupE();
            }
        }
        else{
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new MPE();
    }
}
