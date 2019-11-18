package zadanieKovsh;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

public class ConnectSqlLite {
    private static Connection conn;
    private static Statement statmt;
    private static ResultSet resSet;

    public static void ConectSql() throws ClassNotFoundException, SQLException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:zadanie3.s3db");
    }
    public static void CreateTab() throws SQLException {
        statmt = conn.createStatement();
        statmt.execute("CREATE TABLE if not exists 'typeOfDocs' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'document' TEXT);");
        System.out.println("Tab create");
    }
    public static void WriteDB(Collection<String> stringCollection) throws SQLException {
        for (String str : stringCollection) {
            statmt.executeUpdate("INSERT INTO 'typeOfDocs' ('document') VALUES ('" + str + "'); ");
        }
        System.out.println("Tab filled");
    }
    public static void ReadDB() throws SQLException {
        resSet = statmt.executeQuery("SELECT * FROM typeOfDocs");
        System.out.println("Виды документов: ");
        while(resSet.next()) {
            System.out.println("ВИД_ДОК : " + resSet.getString("document"));
        }
    }
    public static void CloseDB() throws SQLException {
        conn.close();
        statmt.close();
        resSet.close();
        System.out.println("Connections closed");
    }
}