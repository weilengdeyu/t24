package com.openmind.day06;

import java.lang.reflect.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MySqlToList {

	public List mapToBean(List<Map<String, Object>> list,Class clazz)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		List emps = new ArrayList();
		for (Map<String, Object> map : list) {
			Object obj = clazz.newInstance();
			for (String key : map.keySet()) {
				try {
					Method method = null;
					if (map.get(key) instanceof String) {
						method = clazz.getMethod(
								"set" + key.substring(0, 1).toUpperCase()
										+ key.substring(1), String.class);
					}

					if (map.get(key) instanceof Integer) {
						method = clazz.getMethod(
								"set" + key.substring(0, 1).toUpperCase()
										+ key.substring(1), Integer.class);
					}
					method.invoke(obj, map.get(key));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}

			}
			emps.add(obj);
		}
		return emps;
	}



	public List<Map<String, Object>> getListMap(String sql)
			throws ClassNotFoundException, SQLException {
		ResultSet rs = getResultSet(sql);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		while (rs.next()) {
			Map<String, Object> map = new HashMap<String, Object>();
			int count = rs.getMetaData().getColumnCount();
			for (int i = 1; i <= count; i++) {
				String name = rs.getMetaData().getColumnName(i);
				map.put(name.toLowerCase(), rs.getObject(i));
			}
			list.add(map);
		}
		return list;
	}


	public List<Object[]> GetListObject(String sql)
			throws ClassNotFoundException, SQLException {
		List<Object[]> objs = new ArrayList<Object[]>();
		ResultSet rs = getResultSet(sql);
		while (rs.next()) {
			int count = rs.getMetaData().getColumnCount();
			Object[] os = new Object[count];
			for (int i = 1; i <= count; i++) {
				// System.out.print(rs.getObject(i) + "\t");
				os[i - 1] = rs.getObject(i);
				objs.add(os);
			}
			// System.out.println();
		}
		return objs;

	}




	private ResultSet getResultSet(String sql) throws ClassNotFoundException,
			SQLException {
		// 1. 加载驱动
		Class.forName("com.mysql.jdbc.Driver");

		String password = "root";
		String user = "root";
		String url = "jdbc:mysql:///blog";
		// 2. 获取连接
		Connection connection = DriverManager
				.getConnection(url, user, password);
		// 3.
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}
