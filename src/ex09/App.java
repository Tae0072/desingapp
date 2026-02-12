package ex09;

import ex09.lib.DB;
import ex09.lib.Driver;

/**
 * 팩토리 패턴 예제
 */

public class App {
    public static void main(String[] args) {

            DBFactory factory = DBFactory.getInstance();
            DB db = factory.createDB(Driver.MARIA);   // 팩토리에게 요청!
            db.execute("select");
        }
    }

