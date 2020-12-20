package mindfulProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mindfulProject.model.User;




public class LoginDao {
	
	String sql = "select id from Users where email = ? and password = ?";
	
	public boolean check(String Username, String Password) {

		try {
			User user = User.getInstance();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =  DBConnectionUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, Username);
			st.setString(2, Password);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				user.setUserID(rs.getInt("id"));
				user.setEmail(Username);

				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	

}
