import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class AddRoom extends JFrame implements ActionListener {
        JTextField roomnum,price;
        JComboBox av,t5,t6;
        JButton b1,b2;
        AddRoom(){

            JPanel panel = new JPanel();
            panel.setBounds(0,0,964,750);
            panel.setBackground(Color.PINK);
            panel.setLayout(null);
            add(panel);

            JLabel l1 = new JLabel("Add Rooms");
            l1.setBounds(194,10,160,22);
            l1.setFont(new Font("Tahoma", Font.BOLD,22));
            l1.setForeground(Color.WHITE);
            panel.add(l1);

            JLabel l2 = new JLabel("Room Number");
            l2.setBounds(64,70,152,22);
            l2.setFont(new Font("Tahoma", Font.BOLD, 14));
            l2.setForeground(Color.WHITE);
            panel.add(l2);

            roomnum =new JTextField();
            roomnum.setBounds(200,70,156,20);
            roomnum.setFont(new Font("Tahoma", Font.PLAIN, 14));
            roomnum.setForeground(Color.BLACK);
            roomnum.setBackground(Color.WHITE);
            panel.add(roomnum);

            JLabel l3 = new JLabel("Availability");
            l3.setBounds(64,110,152,22);
            l3.setFont(new Font("Tahoma", Font.BOLD, 14));
            l3.setForeground(Color.WHITE);
            panel.add(l3);

           /* av =new JComboBox(new String[] {"Available", "Not Available"});
            av.setBounds(200,110,156,20);
            av.setFont(new Font("Tahoma", Font.PLAIN, 14));
            av.setForeground(Color.BLACK);
            av.setBackground(Color.MAGENTA);
            panel.add(av);

            JLabel l4 = new JLabel("Price");
            l4.setBounds(64,150,152,22);
            l4.setFont(new Font("Tahoma", Font.BOLD, 14));
            l4.setForeground(Color.WHITE);
            panel.add(l4);

            a = new JComboBox();
            .setBounds(200,150,156,20);
            .setFont(new Font("Tahoma", Font.PLAIN, 14));
            t4.setForeground(Color.BLACK);
            t4.setBackground(Color.WHITE);
            panel.add(t4);*/


            JLabel l5 = new JLabel("Cleaning Status");
            l5.setBounds(64,190,152,22);
            l5.setFont(new Font("Tahoma", Font.BOLD, 14));
            l5.setForeground(Color.WHITE);
            panel.add(l5);

            t5 =new JComboBox(new String[]{"Cleaned","Dirty"});
            t5.setBounds(200,190,156,20);
            t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
            t5.setForeground(Color.BLACK);
            t5.setBackground(Color.MAGENTA);
            panel.add(t5);

            JLabel l6 = new JLabel("NUMBER OF BED");
            l6.setBounds(64,230,152,22);
            l6.setFont(new Font("Tahoma", Font.BOLD, 14));
            l6.setForeground(Color.WHITE);
            panel.add(l6);

            t6 =new JComboBox(new String[]{"Single Bed","Double Beds","Three Beds","Four Beds","Five Beds","Six Beds"});
            t6.setBounds(200,230,156,20);
            t6.setFont(new Font("Tahoma", Font.PLAIN, 14));
            t6.setForeground(Color.BLACK);
            t6.setBackground(Color.MAGENTA);
            panel.add(t6);

            b1 = new JButton("Add");
            b1.setBounds(64,321,111,33);
            b1.setBackground(Color.WHITE);
            b1.setForeground(Color.BLACK);
            b1.addActionListener(this);
            panel.add(b1);

            b2 = new JButton("Back");
            b2.setBounds(198,321,111,33);
            b2.setBackground(Color.WHITE);
            b2.setForeground(Color.BLACK);
            b2.addActionListener(this);
            panel.add(b2);

            setUndecorated(true);
            setLocation(300,80);
            setLayout(null);
            setSize(964,750);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b1) {
                try {
                    String room = roomnum.getText();
                    //  String ava = (String) t3.getSelectedItem();
                    String status = (String) t5.getSelectedItem();
                    //  String price = t4.getText();
                    String type = (String) t6.getSelectedItem();

                    try {
                        FileWriter fileWriter = new FileWriter("Eoom.txt", true);
                        //   FileWriter fileWriter1=new FileWriter(roomnum,true);
                        //    fileWriter.write(Einfo);
                        //    fileWriter1.write(Einfo);
                        fileWriter.close();
                        new Manager();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }


                JOptionPane.showMessageDialog(null,"Room Successfully Added");
                    setVisible(false);


                setVisible(false);
            }
                }



        public static void main(String[] args) {
            new AddRoom();
        }
    }

