/*
	Connection with oracle
*/
 Class.forName("oracle.jdbc.driver.OracleDriver");
 
 connection = DriverManager.getConnection(
	"jdbc:oracle:thin:@localhost:1521:mkyong","username","password");
connection.close();

/*
	oracle jdbc download : 
	http://www.oracle.com/technetwork/database/features/jdbc/index-091264.html
*/