import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AllEmployees extends JFrame {
 /*   AllEmployees(){
        JPanel panel = new JPanel();
        panel.setBounds(0,0,964,750);
        panel.setBackground(Color.PINK);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,0,964,700);
        table.setForeground(Color.BLACK);
        table.setBackground(Color.WHITE);
        panel.add(table);

        try {
            ConDatabase c = new ConDatabase();
            String q = "select * from Employee where job = 'Manager'";
            ResultSet resultSet = c.statement.executeQuery(q);
           // table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e ){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(350,920,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name = new JLabel("Name");
        name.setBounds(41,11,70,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel Age = new JLabel("Age");
        Age.setBounds(159,11,70,19);
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(273,11,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel job = new JLabel("Job");
        job.setBounds(416,11,70,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(536,11,70,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(salary);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(656,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(phone);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(786,11,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gmail);


        setUndecorated(true);
        setLayout(null);
        setLocation(300,80);
        setSize(964,750);
        setVisible(true);

    }
    public static void main(String[] args) {
        new AllEmployees();
    }*/
}

