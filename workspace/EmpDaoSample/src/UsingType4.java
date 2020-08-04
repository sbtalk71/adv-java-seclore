import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class UsingType4 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Driver is loaded...");

			con = DriverManager.getConnection("jdbc:oracle:thin:@jpserver:1521:jpserver", "scott", "tiger");
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from empsal1");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int sal = rs.getInt(3);

				System.out.println(id + " " + name + " " + sal);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}
	}
}
