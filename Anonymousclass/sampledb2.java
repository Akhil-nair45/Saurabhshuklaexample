import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class sampledb2
{
    //CRUD
    public boolean insertTeam(team t1) throws Exception{

        //Logic for DB connection
        //Step-1: 
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306 ", "root", "root");
        PreparedStatement ps = c.prepareStatement("insert into team values(?,?,?,?)");

        ps.setInt(1, t1.getTeamid());
        ps.setString(2, t1.getTeamname());
        ps.setString(3, t1.getShortname());
        ps.setString(4, t1.getOwner());

        return ps.execute();
       //return false;
    }
}