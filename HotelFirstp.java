import javax.swing.*;

public class HotelFirstp extends JFrame {
    HotelFirstp(){

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Mehran\\Downloads\\design-1706020134264.jpg");
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,964,750);
        add(label);

        setLayout(null);
        setLocation(300,80);
        setSize(964,750);
        setVisible(true);

        try {
            Thread.sleep(5000);
            setVisible(false);
            new MPE();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new HotelFirstp();
    }
}

