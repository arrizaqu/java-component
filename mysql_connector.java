import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {
	
	private Connection connection = null;
	
	public Connection getConnection(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
			System.out.println("database connection oke..!!");
		} catch(SQLException eSql){
			eSql.printStackTrace();
			System.out.println("connection failed");
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			System.out.println("executed..!!");
		}
		
		return this.connection;
	}
	
	public static void main(String args[]){
		MysqlConnect mysql = new MysqlConnect();
		Connection con = mysql.getConnection();
		//System.out.println("testing areas");
		
	}
}
