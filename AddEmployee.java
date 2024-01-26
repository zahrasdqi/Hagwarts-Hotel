import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameText,personalCodeTextE,PhoneText,ageText,salaryText,emailText;//bankBalance?
    JRadioButton radioButtonM, radioButtonF;
    JPasswordField passwordField;
    JComboBox comboBox;
    JButton add,back;
    AddEmployee(){
        JPanel panel = new JPanel();
        panel.setBounds(0,0,964,750);
        panel.setLayout(null);
        panel.setBackground(Color.PINK);
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setForeground(Color.WHITE);
        panel.add(name);

        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(Color.WHITE);
        nameText.setFont(new Font("Tahoma", Font.BOLD,14));
        nameText.setForeground(Color.BLACK);
        panel.add(nameText);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("serif", Font.BOLD, 17));
        Age.setForeground(Color.WHITE);
        panel.add(Age);

        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(Color.WHITE);
        ageText.setFont(new Font("Tahoma", Font.BOLD,14));
        ageText.setForeground(Color.BLACK);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif", Font.BOLD, 17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(Color.MAGENTA);
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonM.setForeground(Color.BLACK);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(Color.MAGENTA);
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonF.setForeground(Color.BLACK);
        panel.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("serif", Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Receptionist", "Housekeeping", "Kitchen","Room Service", "Manager", "Accountant","Chef"});
        comboBox.setBackground(Color.MAGENTA);
        comboBox.setBounds(200,170,150,30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox.setForeground(Color.black);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif", Font.BOLD, 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);

        salaryText = new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(Color.WHITE);
        salaryText.setFont(new Font("Tahoma", Font.BOLD,14));
        salaryText.setForeground(Color.BLACK);
        panel.add(salaryText);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif", Font.BOLD, 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);

        PhoneText = new JTextField();
        PhoneText.setBounds(200,270,150,27);
        PhoneText.setBackground(Color.WHITE);
        PhoneText.setFont(new Font("Tahoma", Font.BOLD,14));
        PhoneText.setForeground(Color.BLACK);
        panel.add(PhoneText);

        JLabel personalCode = new JLabel("IDENTIFY CODE");
        personalCode.setBounds(60,320,150,27);
        personalCode.setFont(new Font("serif", Font.BOLD, 17));
        personalCode.setForeground(Color.WHITE);
        panel.add(personalCode);

        personalCodeTextE = new JTextField();
        personalCodeTextE.setBounds(200,320,150,27);
        personalCodeTextE.setBackground(Color.WHITE);
        personalCodeTextE.setFont(new Font("Tahoma", Font.BOLD,14));
        personalCodeTextE.setForeground(Color.BLACK);
        panel.add(personalCodeTextE);

        JLabel password = new JLabel("PASSWORD");
        password.setBounds(60,370,150,27);
        password.setFont(new Font("serif", Font.BOLD, 17));
        password.setForeground(Color.WHITE);
        password.add(password);

        passwordField = new JPasswordField();
        passwordField.setBounds(200,370,150,27);
        passwordField.setBackground(Color.WHITE);
        passwordField.setFont(new Font("Tahoma", Font.PLAIN,14));
        passwordField.setForeground(Color.BLACK);
        panel.add(passwordField);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,420,150,27);
        email.setFont(new Font("serif", Font.BOLD, 17));
        email.setForeground(Color.WHITE);
        panel.add(email);

        emailText = new JTextField();
        emailText.setBounds(200,420,250,27);
        emailText.setBackground(Color.WHITE);
        emailText.setFont(new Font("Tahoma", Font.BOLD,14));
        emailText.setForeground(Color.BLACK);
        panel.add(emailText);

        JLabel AED = new JLabel("ADD EMPLOYEE");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(80,480,100,30);
        add.setBackground(Color.WHITE);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,480,100,30);
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
        if (e.getSource() == add) {
            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = PhoneText.getText();
            String email = emailText.getText();
            String password = Arrays.toString(passwordField.getPassword());
            String personalCode = personalCodeTextE.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if (radioButtonM.isSelected()) {
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = " Female";
            }

            String Einfo="passenger name :"+name+" age :"+age+" salary :"+salary+" phone :"+phone+" email :"
                    +email+" password :"+password+" personalcode :"+personalCode+" job :"+job+" gender :"+gender;
            try {
                    FileWriter fileWriter=new FileWriter("Employee.txt",true);
                    FileWriter fileWriter1=new FileWriter(personalCode,true);
                    fileWriter.write(Einfo);
                    fileWriter1.write(Einfo);
                    fileWriter.close();
                    fileWriter1.close();;
                    new Manager();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

           /* try{
                ConDatabase c= new ConDatabase();
                String q = "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"','"+phone+"', '"+email+"','"+password+"', '"+personalCode+"')";

                JOptionPane.showMessageDialog(null,"Employee Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }


        }*/
            else {
                setVisible(false);
            }
        }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
