import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manager extends JFrame implements ActionListener {

    JButton add_Employee,see_AllEmployees,add_Room,delete_employee,update_Room,update_Employee,
            see_reservations,logout,back,see_managerinfo;

    Manager() {

        JPanel panel = new JPanel();
        panel.setBounds(0,0,964,750);
        panel.setLayout(null);
        panel.setBackground(Color.PINK);
        add(panel);

        JLabel pr = new JLabel("MANAGER PAGE");
        pr.setBounds(450,24,445,35);
        pr.setFont(new Font("Tahoma", Font.BOLD, 31));
        pr.setForeground(Color.WHITE);
        panel.add(pr);

        add_Employee = new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(40, 20, 200, 30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Employee.addActionListener(this);
        panel.add(add_Employee);

        add_Room = new JButton("ADD ROOM");
        add_Room.setBounds(40, 70, 200, 30);
        add_Room.setBackground(Color.WHITE);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Room.addActionListener(this);
        panel.add(add_Room);

        see_AllEmployees=new JButton("SEE ALL EMPLOYEES");
        see_AllEmployees.setBounds(40,120,200,30);
        see_AllEmployees.setBackground(Color.WHITE);
        see_AllEmployees.setForeground(Color.BLACK);
        see_AllEmployees.setFont(new Font("Tahoma", Font.BOLD, 15));
        see_AllEmployees.addActionListener(this);
        panel.add(see_AllEmployees);

        delete_employee=new JButton("DELETE EMPLOYEE");
        delete_employee.setBounds(40,170,200,30);
        delete_employee.setBackground(Color.WHITE);
        delete_employee.setForeground(Color.BLACK);
        delete_employee.setFont(new Font("Tahoma", Font.BOLD, 15));
        delete_employee.addActionListener(this);
        panel.add(delete_employee);

        see_reservations=new JButton("SEE RESERVATIONS");
        see_reservations.setBounds(40,170,200,30);
        see_reservations.setBackground(Color.WHITE);
        see_reservations.setForeground(Color.BLACK);
        see_reservations.setFont(new Font("Tahoma", Font.BOLD, 15));
        see_reservations.addActionListener(this);
        panel.add(see_AllEmployees);

        logout = new JButton("LOGOUT");
        logout.setBounds(40, 220, 200, 30);
        logout.setBackground(Color.WHITE);
        logout.setForeground(Color.BLACK);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);
        panel.add(logout);

        back = new JButton("Back");
        back.setBounds(40, 270, 200, 30);
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

        if (e.getSource() == add_Employee) {
            new AddEmployee();
        } else if (e.getSource() == add_Room) {
            new AddRoom();
        } else if (e.getSource() == see_AllEmployees) {
            new AddEmployee();//see all employees
        } else if (e.getSource() == delete_employee) {
            new AddRoom();//
        } else if (e.getSource() == logout) {
            System.exit(102);//delete manager
        } else if (e.getSource() == back) {
            new MPE();
        }
        else if (e.getSource()==see_reservations){
            // see file reservations
        }
    }

    public static void main(String[] args) {
        new Manager();
    }
}