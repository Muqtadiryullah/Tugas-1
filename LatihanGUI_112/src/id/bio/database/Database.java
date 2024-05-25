package id.bio.database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private static Connection connection = null;
    public static Connection getConnection() throws Exception{
        if(connection == null){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbakademik","root","");
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    return connection;
}
    public static boolean isConnect(){
        try{
            if(getConnection() == null){
                return false;
            }
        }catch(Exception e){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        return true;
    }
}
