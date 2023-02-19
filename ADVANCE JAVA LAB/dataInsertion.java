
import java.sql.*;
public class dataInsertion {
    public static void main(String args[]){
        try{
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/menagrie", "root","Lokesh@9028");
            Statement stat=con.createStatement();
            String sql="insert pet values('Jeeny','Ish','Dog','m','2022-08-08',NULL)";
            PreparedStatement pst=con.prepareStatement(sql);
            int numRowsChanged=pst.executeUpdate();
            System.out.println(numRowsChanged+"rows inserted successfully");
            con.close();
            System.out.println("The inserted row is: ");
        }
        catch(Exception e){
            System.out.println("Error"+e.toString());
        }
    }
}
