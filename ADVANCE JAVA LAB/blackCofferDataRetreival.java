import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class blackCofferDataRetreival {
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blackcoffer", "root",
                    "Lokesh@9028");
            PreparedStatement ps = con.prepareStatement("Select *from assignmentdata");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Start year:" + rs.getString(1) + "\t");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
    }
}
