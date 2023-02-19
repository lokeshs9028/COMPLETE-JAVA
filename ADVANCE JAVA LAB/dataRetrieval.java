import java.lang.invoke.TypeDescriptor;
import java.sql.*;

import java.sql.*;
public class dataRetrieval {
    public static void main(String args[]){
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/menagrie", "root", "Lokesh@9028");
            PreparedStatement ps=con.prepareStatement("Select *from pet" );
            ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    System.out.print("name:"+rs.getString(1)+"\t");
                    System.out.print("owner: "+rs.getString(2)+"\t");
                    System.out.print("species: "+rs.getString(3)+"\t");
                    System.out.print("sex: "+rs.getString(4)+"\t");
                    System.out.print("Date of Birth: "+rs.getDate(5)+"\t");
                    System.out.print("Data of Death: "+rs.getDate(6)+"\t");
                    System.out.println("\n");
                }
            con.close();
        }
        catch(Exception e){
            System.out.println("Error:"+e.toString());
        }
    }
}
