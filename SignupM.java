import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SignupM extends JFrame implements ActionListener {
    JTextField textField1, Personalcode, Email;
    JPasswordField passwordField1;
    JButton b1, b2;

    SignupM() {

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 964, 750);
        panel.setLayout(null);
        panel.setBackground(Color.PINK);
        add(panel);

        JLabel label1 = new JLabel("NAME");
        label1.setBounds(40, 20, 150, 30);
        label1.setFont(new Font("Tahoma", Font.BOLD, 16));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        textField1 = new JTextField();
        textField1.setBounds(200, 20, 150, 30);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField1.setBackground(Color.WHITE);
        panel.add(textField1);

        JLabel personalcode = new JLabel("PERSONAL CODE");
        personalcode.setBounds(40, 120, 200, 30);
        personalcode.setFont(new Font("Tahoma", Font.BOLD, 16));
        personalcode.setForeground(Color.WHITE);
        panel.add(personalcode);

        Personalcode = new JTextField();
        Personalcode.setBounds(200, 120, 150, 30);
        Personalcode.setForeground(Color.BLACK);
        Personalcode.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Personalcode.setBackground(Color.WHITE);
        panel.add(Personalcode);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(40, 170, 150, 30);
        email.setFont(new Font("Tahoma", Font.BOLD, 16));
        email.setForeground(Color.WHITE);
        panel.add(email);

        Email = new JTextField();
        Email.setBounds(200, 170, 300, 30);
        Email.setForeground(Color.BLACK);
        Email.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Email.setBackground(Color.WHITE);
        panel.add(Email);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(40, 70, 100, 30);
        label2.setFont(new Font("Tahoma", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(200, 70, 150, 30);
        passwordField1.setForeground(Color.BLACK);
        passwordField1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        passwordField1.setBackground(Color.WHITE);
        panel.add(passwordField1);

        b1 = new JButton("Sign Up");
        b1.setBounds(40, 250, 120, 30);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 250, 120, 30);
        b2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        panel.add(b2);


        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        setLocation(300, 80);
        setSize(964, 750);
        setVisible(true);
        //setUndecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            String name=textField1.getText();
            String personalcode=Personalcode.getText();
            String email=Email.getText();
            String password=passwordField1.getText();

            String Minfo="passenger name :"+name+",personal code :"+personalcode+",email :"+email+",password :"+password;
            try {
                FileWriter fileWriter=new FileWriter("Manager.txt",true);
                fileWriter.write(Minfo);
                fileWriter.close();
                new Manager();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }



          /* PassengerInfo passengerInfo=new PassengerInfo(name,personalcode,email,password);
           passengerservises passengerservises=new passengerservises(conDatabase.getConnection());
           passengerservises.Add(passengerInfo);*/
    }




    public static void main(String[] args) {
        new SignupM();
    }

}
