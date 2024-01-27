import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 public class LoginSignupE extends JFrame implements ActionListener {
        JButton log,back;
        LoginSignupE(){

            JPanel panel = new JPanel();
            panel.setBounds(0,0,964,750);
            panel.setLayout(null);
            panel.setBackground(Color.PINK);
            add(panel);

            JLabel hotel = new JLabel("EMPLOYEE PAGE");
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
            if (e.getSource() == back) {
                new MPE();
                setVisible(false);
            }
        }

        public static void main(String[] args) {
            new LoginSignupE();
        }
    }




