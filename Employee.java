import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Employee extends JFrame implements ActionListener {
        JButton res,info;
        Employee(){

            JPanel panel = new JPanel();
            panel.setBounds(0,0,964,750);
            panel.setLayout(null);
            panel.setBackground(Color.PINK);
            add(panel);

            JLabel hotel = new JLabel("PERSONAL EMPLOYEE PAGE");
            hotel.setBounds(250,24,445,35);
            hotel.setFont(new Font("Tahoma", Font.BOLD, 31));
            hotel.setForeground(Color.WHITE);
            panel.add(hotel);

            res = new JButton("RESERVATION");
            res.setBounds(192,345,180,30);
            res.setFont(new Font("Tahoma", Font.BOLD,15));
            res.setBackground(Color.WHITE);
            res.setForeground(Color.BLACK);
            res.addActionListener(this);
            panel.add(res);

            info= new JButton("YOUR INFO");
            info.setBounds(632,345,180,30);
            info.setFont(new Font("Tahoma", Font.BOLD,15));
            info.setBackground(Color.WHITE);
            info.setForeground(Color.BLACK);
            info.addActionListener(this);
            panel.add(info);

            setUndecorated(true);
            setLocation(300,80);
            setLayout(null);
            setSize(964,750);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==res){
               // new Reservation();
                setVisible(false);
            }else {
                //  EmployeeInfo();
                setVisible(false);
            }
        }

        public static void main(String[] args) {
            new Employee();
        }
    }



