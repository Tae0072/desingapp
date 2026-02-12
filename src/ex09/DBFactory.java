package ex09;

import ex09.lib.DB;
import ex09.lib.Driver;
import ex09.lib.MariaDB;
import ex09.lib.OracleDB;

public class DBFactory {

    private static DBFactory instance = new DBFactory();

    private DBFactory(){}

    public static DBFactory getInstance(){
        return instance;
    }

    // 단점: OCP 위배 (새 DB 추가 시 이 코드를 수정해야 함)
    public DB createDB(Driver driver){
        if (driver.getProtocol().equals("maria")){
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb//127.0.0.1:3306");
            return mariaDB;
        } else if (driver.getProtocol().equals("oracle")) {
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");
            return oracleDB;
        }else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
