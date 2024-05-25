package com.mimaraslan.v2;


import java.sql.*;

// SQL   INSERT  - SELECT -  UPDATE  -  DELETE
// JAVA  CREATE  - READ   -  UPDATE  -  DELETE
public class MyCrud {

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    static final String DB_NAME = "postgresql";
    static final String DB_USERNAME = "postgres";
    static final String DB_PASSWORD = "123456789";
    static final String DB_IP = "127.0.0.1";
    static final String DB_PORT= "5432";


    private boolean openConnection(){

      try {

      //    Class.forName("org.postgresql.Driver");
       //   Class.forName ("com.mysql.cj.jdbc.Driver");

          /*
          connection = DriverManager.getConnection(
                  "jdbc:postgresql://localhost:5432/postgres?currentSchema=companydb",
                  "postgres",
                  "123456789");
          */
/*
          connection = DriverManager.getConnection(
                  "jdbc:"+DB_NAME+"://"+DB_IP+":"+DB_PORT+"/"+DB_USERNAME+"?currentSchema=companydb",
                  DB_USERNAME,
                  DB_PASSWORD);
*/



          connection = DriverManager.getConnection(
                  "jdbc:mysql://localhost:3306/companydb",
                  "root",
                  "123456789");


          return true;

      } catch (SQLException e){
          System.out.println("Hata: " +e);
          return false;
      }

    }

    private boolean closeConnection(){

              try {
/*                  if (resultSet != null) {
                      resultSet.close();
                  }

                  if (preparedStatement != null) {
                      preparedStatement.close();
                  }
*/
               /*   if (!connection.isClosed()) {
                      connection.close();
                  }
                  */
                  return true;
              } catch (Exception e) {
                  System.out.println("Hata: " +e);
                  return false;
              }

    }



    // READ (SELECT)
    public ResultSet findFromTableRecordAll(String sql) throws SQLException {

      if (openConnection()) {
          System.out.println("Bağlantı açıldı.");
          preparedStatement = connection.prepareStatement(sql);
          resultSet = preparedStatement.executeQuery();

          if (closeConnection()){
              System.out.println("Bağlantı kapatıldı.");
          }

          return resultSet;

      } else {
          System.out.println("Bağlantı kapalı.");
          return null;
      }

    }




    // UPDATE
    public void updateFromTableRecord(String sql) throws SQLException {

        if (openConnection()) {
            System.out.println("Bağlantı açıldı.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()){
                System.out.println("Bağlantı kapatıldı.");
            }

        } else {
            System.out.println("Bağlantı kapalı.");
        }

    }



    // DELETE
    public void deleteFromTableRecord(String sql) throws SQLException {

        if (openConnection()) {
            System.out.println("Bağlantı açıldı.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()){
                System.out.println("Bağlantı kapatıldı.");
            }

        } else {
            System.out.println("Bağlantı kapalı.");
        }

    }




    // INSERT
    public void insertFromTableRecord(String sql) throws SQLException {

        if (openConnection()) {
            System.out.println("Bağlantı açıldı.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if (closeConnection()){
                System.out.println("Bağlantı kapatıldı.");
            }

        } else {
            System.out.println("Bağlantı kapalı.");
        }

    }


}
