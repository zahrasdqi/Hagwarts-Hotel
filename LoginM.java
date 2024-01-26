import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 public class LoginM extends JFrame implements ActionListener {

        JTextField textField1;
        JPasswordField passwordField1;
        JButton b1, b2;
        LoginM() {

            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 964, 750);
            panel.setLayout(null);
            panel.setBackground(Color.PINK);
            add(panel);

            JLabel label1 = new JLabel("EMAIL");
            label1.setBounds(40, 20, 150, 30);
            label1.setFont(new Font("Tahoma", Font.BOLD, 16));
            label1.setForeground(Color.WHITE);
            panel.add(label1);

            JLabel label2 = new JLabel("PASSWORD");
            label2.setBounds(40, 70, 100, 30);
            label2.setFont(new Font("Tahoma", Font.BOLD, 16));
            label2.setForeground(Color.WHITE);
            panel.add(label2);

            textField1 = new JTextField();
            textField1.setBounds(150, 20, 250, 30);
            textField1.setForeground(Color.BLACK);
            textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
            textField1.setBackground(Color.WHITE);
            panel.add(textField1);

            passwordField1 = new JPasswordField();
            passwordField1.setBounds(150, 70, 150, 30);
            passwordField1.setForeground(Color.BLACK);
            passwordField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
            passwordField1.setBackground(Color.WHITE);
            panel.add(passwordField1);

            b1 = new JButton("Login");
            b1.setBounds(40, 170, 120, 30);
            b1.setFont(new Font("serif", Font.BOLD, 15));
            b1.setBackground(Color.WHITE);
            b1.setForeground(Color.BLACK);
            b1.addActionListener(this);
            panel.add(b1);

            b2 = new JButton("Cancel");
            b2.setBounds(180, 170, 120, 30);
            b2.setFont(new Font("serif", Font.BOLD, 15));
            b2.setBackground(Color.WHITE);
            b2.setForeground(Color.BLACK);
            b2.addActionListener(this);
            panel.add(b2);

            getContentPane().setBackground(Color.PINK);
            setLayout(null);
            setLocation(300, 80);
            setSize(964, 750);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String email=textField1.getText();
            String password=passwordField1.getText();

            if (e.getSource() == b1) {
                try{
                    FileReader fileReader=new FileReader("Manager.txt");
                    BufferedReader bufferedReader=new BufferedReader(fileReader);
                    String line;
                    boolean emailfound=false;
                    boolean passwordfound=false;
                    while ((line=bufferedReader.readLine())!=null){
                        if(line.contains(email)){
                            emailfound=true;
                        }
                        if (line.contains(password)){
                            passwordfound=true;
                        }
                    }
                    if(emailfound && passwordfound){
                        new Manager();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"invalid");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


                }
            else{
                new MPE();
            }


    /*public static void savePasswordToFile(String file1,String password) {
        try {
            FileWriter writer = new FileWriter(file1, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(password);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


            }

            /*try {
                ConDatabase c = new ConDatabase();
                String user = textField1.getText();
                String pass = passwordField1.getText();

                String q = "select * from login where username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);if (resultSet.next()){
                    //new Dashboard();
                    setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid");
                }

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            new LoginSignup();
        }
    }*/

    public static void main(String[] args) {
        new LoginM();
    }
}




