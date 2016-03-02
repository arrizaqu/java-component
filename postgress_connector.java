//# Example Postgress Driver

Class.forName("org.postgresql.Driver");
Connection connection = null;
connection = DriverManager.getConnection(
   "jdbc:postgresql://hostname:port/dbname","username", "password");
connection.close();


/*
file jdbc driver for pogressql : 
http://jdbc.postgresql.org/download.html
*/