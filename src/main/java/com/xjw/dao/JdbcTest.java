package com.xjw.dao;

import java.sql.*;

public class JdbcTest {
    private static final String URL = "jdbc:mysql://192.168.0.187:3306/z_jg?autoReconnect=true&zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=UTF-8&useOldAliasMetadataBehavior=true";
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String userName = "root";
    private static final String password = "huirong";
    static {
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(URL,userName,password);
        Statement statement = connection.createStatement();
        String sql = "select userId,user_name,passwd from t_user";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String userId = resultSet.getString("userId");
            String user_name = resultSet.getString("user_name");
           String passwd =  resultSet.getString("passwd");
            System.out.println("userId =" + userId+",user_name = "+ user_name +",passwd"+passwd);
        }
    }
}
