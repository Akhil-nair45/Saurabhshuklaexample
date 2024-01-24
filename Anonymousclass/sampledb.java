import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class sampledb0{

    private int teamid;
    private String teamname;
    private String shortname;
    private String owner;
   public sampledb0(int teamid, String teamname, String shortname, String owner) {
      this.teamid = teamid;
      this.teamname = teamname;
      this.shortname = shortname;
      this.owner = owner;
   }
   public int getTeamid() {
      return teamid;
   }
   public void setTeamid(int teamid) {
      this.teamid = teamid;
   }
   public void setTeamname(String teamname) {
      this.teamname = teamname;
   }
   public void setShortname(String shortname) {
      this.shortname = shortname;
   }
   public void setOwner(String owner) {
      this.owner = owner;
   }
   public String getTeamname() {
      return teamname;
   }
   public String getShortname() {
      return shortname;
   }
   public String getOwner() {
      return owner;
   }

        
    }


    class sampledb2
{
    //CRUD
    public boolean insertTeam(sampledb0 t1) throws Exception{

        //Logic for DB connection
        //Step-1: 
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306 ", "root", "root");
        PreparedStatement ps = (PreparedStatement) c.prepareStatement("insert into team values(?,?,?,?)");

        ps.setInt(1, t1.getTeamid());
        ps.setString(2, t1.getTeamname());
        ps.setString(3, t1.getShortname());
        ps.setString(4, t1.getOwner());

        return ps.execute();
       //return false;
    }
    public List<team> getAllTeams()throws Exception{
      List<team> li = new ArrayList<team>();
      //DB logic
      return li;
    }

    public boolean updateteam()throws Exception{
      return false;
    }
    public boolean deleteteam()throws Exception{
      return false;
    }
}










public class sampledb{
   public static void main(String[] args)throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your choice");
      System.out.println("1. Insert team");
      System.out.println("2. View All teams");
      System.out.println("3. update team information");
      System.out.println("4. delete team");

      int n =sc.nextInt();
      switch(n)
      {
         case 1:
         System.out.println("Enter team Id");
         int tno = sc.nextInt();
         System.out.println("Enter Team Name");
         int tname = sc.nextInt();
         System.out.println("Enter short name");
         String sname = sc.next();
         System.out.println("Owner name");
         String owner = sc.next();

         //Logic to connect DB
         sampledb0 t1 = new sampledb0(tname, sname, sname, owner);
         sampledb2 t2= new sampledb2();
         t2.insertTeam(t1);
         break;

         case 2:
         System.out.println("Teams Are: ");
         sampledb2 td1 = new sampledb2();
         List<team> li = td1.getAllTeams();
         for(team t3: li)
      
   }
}
}