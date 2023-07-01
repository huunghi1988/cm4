package coding.be4project.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import coding.be4project.db.util.DBUtil;
import coding.be4project.entity.Category;

public class CategoryService {

	public List<Category> getAllCategories() throws SQLException {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Category category = null;
		List<Category> list = new ArrayList<Category>();
		try {
			conn = DBUtil.makeConnection();

			ps = conn.prepareStatement("Select * from `Categories`");
			rs = ps.executeQuery();

			while (rs.next()) {
				int category_id = rs.getInt("category_id");
				String category_name = rs.getString("category_name");
				category = new Category(category_id, category_name);
				list.add(category);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;
	}
}
