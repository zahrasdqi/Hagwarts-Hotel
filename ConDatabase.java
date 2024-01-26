import java.sql.*;

public class ConDatabase {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

       /* public ConDatabase(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/hotel","root","");
            }catch (SQLException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }*/


}
