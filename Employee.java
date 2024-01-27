import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Employee extends JFrame implements ActionListener {
        JButton res,info,resl,back;
        Employee(){

            JPanel panel = new JPanel();
            panel.setBounds(0,0,964,750);
            panel.setLayout(null);
            panel.setBackground(Color.PINK);
            add(panel);

            JLabel e = new JLabel("PERSONAL EMPLOYEE PAGE");
            e.setBounds(450,30,445,35);
            e.setFont(new Font("Tahoma", Font.BOLD, 31));
            e.setForeground(Color.WHITE);
            panel.add(e);

            res = new JButton("RESERVATION");
            res.setBounds(60,30,250,30);
            res.setFont(new Font("Tahoma", Font.BOLD,15));
            res.setBackground(Color.WHITE);
            res.setForeground(Color.BLACK);
            res.addActionListener(this);
            panel.add(res);

            info= new JButton("YOUR INFO");
            info.setBounds(60,80,250,30);
            info.setFont(new Font("Tahoma", Font.BOLD,15));
            info.setBackground(Color.WHITE);
            info.setForeground(Color.BLACK);
            info.addActionListener(this);
            panel.add(info);

            resl= new JButton("RESERVATION LIST");
            resl.setBounds(60,130,250,30);
            resl.setFont(new Font("Tahoma", Font.BOLD,15));
            resl.setBackground(Color.WHITE);
            resl.setForeground(Color.BLACK);
            resl.addActionListener(this);
            panel.add(resl);

            back = new JButton("BACK");
            back.setBounds(60,180,250,30);
            back.setBackground(Color.WHITE);
            back.setForeground(Color.BLACK);
            back.setFont(new Font("Tahoma", Font.BOLD, 15));
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
            if (e.getSource()==res){
               new Reservation();
                setVisible(false);
            }
            if(e.getSource()==info){

               // new Employeeinfo();
            }
            if(e.getSource()==resl){
                File file=new File("Reservation.txt");
                try(BufferedReader bufferedReader=new BufferedReader(file){
                    StringBuilder content=new StringBuilder();
                    String line;
                    while((line=bufferedReader.readLine())!=null){
                        content.append(line).append("\n");


                    }

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }else {
                //  EmployeeInfo();
                setVisible(false);
            }
        }

        public static void main(String[] args) {
            new Employee();
        }
    }



