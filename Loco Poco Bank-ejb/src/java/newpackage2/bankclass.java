/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Statement;
import javax.ejb.Stateful;

/**
 *
 * @author mohd_aquib
 */
@Stateful
public class bankclass {
    PrintWriter out;
    public String ac_info(String a)
    {
      try{
            out=response.getWriter();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","r00t123");
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery("select ac_no,first_name,last_name,c_no,address from ac_info where ac_no='"+a+"'");
            String pr;
                while(rs.next())
                {
                   pr=rs.getString(2);
                   
                }
            }
        catch(Exception e)
        {
            out.println(""+e);
        }
      return pr;
    }
    public String chk_bal(String a)
    {
        try{
            out=response.getWriter();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","r00t123");
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery("select bal from ac_info where ac_no='"+a+"'");
                while(rs.next())
                {
                   return rs.getString(1);
                }
            }
        catch(Exception e)
        {
            out.println(""+e);
        }
        
    }
    public String depo(String a,String b)
    {
        return "under Construction";
    }
}

