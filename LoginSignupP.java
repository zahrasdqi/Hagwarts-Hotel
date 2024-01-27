import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginSignupP extends JFrame implements ActionListener {
        JButton log,sign,back;
        LoginSignupP(){

            JPanel panel = new JPanel();
            panel.setBounds(0,0,964,750);
            panel.setLayout(null);
            panel.setBackground(Color.PINK);
            add(panel);

            JLabel hotel = new JLabel("PASSENGER PAGE");
            hotel.setBounds(340,24,445,35);
            hotel.setFont(new Font("Tahoma", Font.BOLD, 31));
            hotel.setForeground(Color.WHITE);
            panel.add(hotel);

            log = new JButton("LOG IN");
            log.setBounds(137,345,140,30);
            log.setFont(new Font("Tahoma", Font.BOLD,15));
            log.setBackground(Color.WHITE);
            log.setForeground(Color.BLACK);
            log.addActionListener(this);
            panel.add(log);

            sign= new JButton("SIGN UP");
            sign.setBounds(414,345,140,30);
            sign.setFont(new Font("Tahoma", Font.BOLD,15));
            sign.setBackground(Color.WHITE);
            sign.setForeground(Color.BLACK);
            sign.addActionListener(this);
            panel.add(sign);

            back= new JButton("BACK");
            back.setBounds(691,345,140,30);
            back.setFont(new Font("Tahoma", Font.BOLD,15));
            back.setBackground(Color.WHITE);
            back.setForeground(Color.BLACK);
            back.addActionListener(this);
            panel.add(back);

            setUndecorated(true);
            setLocation(300,80);
            setLayout(null);
            setSize(964,750);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == log) {
                new LoginP();
                setVisible(false);
            }
            if (e.getSource() == sign) {
                new SignupP();
                setVisible(false);
            }
            if (e.getSource() == back) {
                new MPE();
                setVisible(false);
            }
        }

        public static void main(String[] args) {
            new LoginSignupP();
        }
    }


