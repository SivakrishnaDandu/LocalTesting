import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author siva
 *
 */
public class ExceptionHandling {

	public static void main(String[] args) throws IOException {
		/*
		
		
		String str = new String("siva  vvx   gddvvvvxzxz vcxzvxXcbv "
				+ "zvzx"
				+ "cvxv"
				+ "xzvxzvxz"
				+ "xzvxz ");
		System.out.println(str);
		String start = "siva";
		String aa=null;
		
		HashMap<String, String> ne = new HashMap<String, String>();
		
	       String array1[]= str.split("\\n");
	       for (String temp: array1){
	    	   aa=temp.substring(temp.indexOf(start)+ start.length()).trim();
	    	   System.out.println(temp.indexOf(start));
	    	   System.out.println(start.length());
	          System.out.println(aa);
	          
	       }
		*/
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://172.168.1.82:3306/panaces","root","panace123");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from groups");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){
				System.out.println(e);
				} 
	
	}
	
}
