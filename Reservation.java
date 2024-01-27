import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.Date;

    public class Reservation extends JFrame implements ActionListener {
        JComboBox comboBox;
        JTextField personalCodeTextP,personalCodeTextE,StayingTime,Cost;
        Choice roomnumber;
        JLabel date;
        JButton add,back;
        Reservation(){

            JPanel panel = new JPanel();
            panel.setBounds(0,0,964,750);
            panel.setLayout(null);
            panel.setBackground(Color.PINK);
            add(panel);

            JLabel labelName = new JLabel("RESERVATION");
            labelName.setBounds(118,11,260,30);
            labelName.setFont(new Font("Tahoma", Font.BOLD,16));
            labelName.setForeground(Color.WHITE);
            panel.add(labelName);

            JLabel labelID1 = new JLabel("Passenger ID Code");
            labelID1.setBounds(35,76,200,30);
            labelID1.setForeground(Color.WHITE);
            labelID1.setFont(new Font("Tahoma", Font.BOLD,16));
            panel.add(labelID1);

            personalCodeTextP = new JTextField();
            personalCodeTextP.setBounds(200,76,150,30);
            personalCodeTextP.setBackground(Color.WHITE);
            personalCodeTextP.setFont(new Font("Tahoma", Font.PLAIN,16));
            personalCodeTextP.setForeground(Color.BLACK);
            panel.add(personalCodeTextP);

            JLabel stay = new JLabel("Staying time");
            stay.setBounds(35,126,200,30);
            stay.setForeground(Color.WHITE);
            stay.setFont(new Font("Tahoma", Font.BOLD, 16));
            panel.add(stay);

            StayingTime = new JTextField();
            StayingTime.setBounds(200,126,150,30);
            StayingTime.setBackground(Color.WHITE);
            StayingTime.setFont(new Font("Tahoma", Font.PLAIN,16));
            StayingTime.setForeground(Color.BLACK);
            panel.add(StayingTime);

            JLabel labelRoom = new JLabel("Room Number");
            labelRoom.setBounds(35,176,150,30);
            labelRoom.setForeground(Color.WHITE);
            labelRoom.setFont(new Font("Tahoma", Font.BOLD, 16));
            panel.add(labelRoom);

           /* roomnumber = new Choice();
            try{

                ConDatabase c = new ConDatabase();
                ResultSet resultSet = c.statement.executeQuery("select * from room");
                while (resultSet.next()){
                    roomnumber.add(resultSet.getString("roomnumber"));
                }

            }catch (Exception e){
                e.printStackTrace();
            }
            roomnumber.setBounds(200,176,150,30);
            roomnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
            roomnumber.setForeground(Color.BLACK);
            roomnumber.setBackground(Color.MAGENTA);
            panel.add(roomnumber);*/

            JLabel date0 = new JLabel("Date");
            date0.setBounds(35,226,200,30);
            date0.setForeground(Color.WHITE);
            date0.setFont(new Font("Tahoma", Font.BOLD, 16));
            panel.add(date0);

            Date date1 = new Date();
            date = new JLabel(""+date1);
            date.setBounds(200,226,200,30);
            date.setForeground(Color.BLACK);
            date.setBackground(Color.WHITE);
            date.setFont(new Font("Tahoma", Font.PLAIN, 16));
            panel.add(date);

            JLabel labelCost = new JLabel("Cost");
            labelCost.setBounds(35,276,150,30);
            labelCost.setFont(new Font("Tahoma", Font.BOLD,16));
            labelCost.setForeground(Color.WHITE);
            panel.add(labelCost);

            Cost= new JTextField();
            Cost.setBounds(200,276,150,30);
            Cost.setForeground(Color.BLACK);
            Cost.setBackground(Color.WHITE);
            Cost.setFont(new Font("Tahoma", Font.PLAIN, 16));
            panel.add(Cost);

            JLabel labelID2 = new JLabel("Employee ID Code");
            labelID2.setBounds(35,326,200,30);
            labelID2.setForeground(Color.WHITE);
            labelID2.setFont(new Font("Tahoma", Font.BOLD, 16));
            panel.add(labelID2);

            personalCodeTextP = new JTextField();
            personalCodeTextP.setBounds(200,326,150,30);
            personalCodeTextP.setBackground(Color.WHITE);
            personalCodeTextP.setFont(new Font("Tahoma", Font.PLAIN,16));
            personalCodeTextP.setForeground(Color.BLACK);
            panel.add(personalCodeTextP);

            add = new JButton("ADD");
            add.setBounds(35,420,120,30);
            add.setForeground(Color.BLACK);
            add.setBackground(Color.WHITE);
            add.addActionListener(this);
            panel.add(add);

            back = new JButton("BACK");
            back.setBounds(230,420,120,30);
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            back.addActionListener(this);
            panel.add(back);

            setLayout(null);
            setLocation(300,80);
            setSize(964,750);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add) {
                ConDatabase c = new ConDatabase();

                String personalcodep = personalCodeTextP.getText();
                String personalcodee = personalCodeTextE.getText();
                String stayingtime = StayingTime.getText();
                String cost = Cost.getText();
                String roomnum = roomnumber.getSelectedItem();
                String datte = date.getText();

                String reservation="personal code of passenger:"+personalcodep+",personal code of employee :"+personalcodee+
                        ",staying time :"+stayingtime+",cost :"+cost+",room number :"+roomnum+",date :"+datte+" * ";

                try {
                    FileWriter fileWriter=new FileWriter("Reservation.txt",true);
                    FileWriter fileWriter1=new FileWriter(roomnum,true);
                    fileWriter.write(reservation);
                    fileWriter1.write(reservation);
                    fileWriter.close();
                    fileWriter1.close();
                    new Manager();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

              /*  try {

                    String q ="insert into customer values ('"+personalcodep+"', '"+personalcodee+"','"+stayingtime+"','"+cost+"', '"+roomnum+"', '"+datte+"')";
                    String q1 = "update room set availability = reserved room = "+datte;
                    c.statement.executeUpdate(q);
                    c.statement.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null, "added Successfully");
                    setVisible(false);

                }catch (Exception E) {
                    E.printStackTrace();
                }
            }else {
                new LoginSignup();
            }*/



        }

        public static void main(String[] args) {
            new Reservation();
        }}


