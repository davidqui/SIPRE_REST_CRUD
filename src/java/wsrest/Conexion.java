package wsrest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

private static Connection cnn;

private static String url="jdbc:oracle:thin:@172.23.58.146:1521:orcl";
private static String driver="oracle.jdbc.OracleDriver";
private static String user="VARGAS";
private static String pass="oracle";

    public Conexion() {
    }

public static Connection openCon() throws Exception{
    
    if(cnn==null){
        Class.forName(driver);
        cnn=DriverManager.getConnection(url,user,pass);
        System.out.println("coneccion ok");
    }
    return cnn;
}

public static void closeCon() throws SQLException{
    
    if(cnn!=null){
        cnn.close();
    }
    cnn=null;
}

}
