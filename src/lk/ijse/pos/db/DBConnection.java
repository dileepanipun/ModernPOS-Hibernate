package lk.ijse.pos.db;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

    private static DBConnection dbConnection;

    private Connection connection;

    public DBConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        File file = new File("application.properties");
        FileReader fileReader = new FileReader(file);

        Properties properties = new Properties();
        properties.load(fileReader);

        String ip = properties.getProperty("ip");
        String port = properties.getProperty("port");
        String db = properties.getProperty("db");
        String user = properties.getProperty("user");
        String pw = properties.getProperty("pw");

        String jdbcUrl = "jdbc://mysql"+ip+":"+port+"/"+db;

        connection = DriverManager.getConnection(jdbcUrl,user,pw);

    }

    private static DBConnection getInstance() throws Exception {
        if (dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    private Connection getConnection(){
        return connection;
    }
}
