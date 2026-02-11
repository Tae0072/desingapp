package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.SmsNotifier;

/**
 *     {
 *      "sends" : [basic, email],
 *       "msg": "반가워!!"
 *     }
 */

// 정의 : 기존에 있는 클래스(속옷)에 기능을 확장하려면 계속 추가하는 패턴
public class App {
    public static void main(String[] args) {
        //1. (sms, sms, email)
        EmailNotifier e1 = new EmailNotifier(new SmsNotifier(new SmsNotifier()));
        //2. (기본, sms, email)
        new EmailNotifier(new SmsNotifier(new BasicNotifier())).send();
        //3. (sms)
        SmsNotifier s1 = new SmsNotifier();

        //e1.send();
        //e2.send();
        //s1.send();

        BasicNotifier b1 = new BasicNotifier();
        //b1.send();

    }
}
