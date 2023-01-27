import java.sql.*;
public class connector {

   
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // install driver command

           // Connection con = DriverManager.getConnection("address","db","password");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456"); // connection established
            System.out.println(" connect");

            String str = "select * from help_relation";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(str);   // stored data
            System.out.println(rs);

            while(rs.next()){
                int id = rs.getInt("help_topic_id");
               // String name = rs.getString("id");
                System.out.println(id);
            }


            
        } catch (Exception e) {
            System.out.println(e);
        }
      
    }
    
}
