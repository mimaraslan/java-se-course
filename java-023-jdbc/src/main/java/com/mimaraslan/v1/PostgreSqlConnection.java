package com.mimaraslan.v1;

import java.sql.*;

public class PostgreSqlConnection {


    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sqlAllCustomers = "SELECT * FROM customers";

        try {

            Class.forName("org.postgresql.Driver");

            /*
              connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/postgres",
                    "postgres",
                    "123456789");
            */
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres?currentSchema=companydb",
                    "postgres",
                    "123456789");

            statement = connection.createStatement();

            resultSet = statement.executeQuery(sqlAllCustomers);


            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                        resultSet.getString("first_name") + " " +
                        resultSet.getString("last_name"));
            }


        } catch (SQLException e){
            System.out.println("Hata: " +e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {

            if (resultSet != null  ||  statement != null   || connection != null ) {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }


    }

}