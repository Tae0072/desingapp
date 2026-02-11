package ex07.push;

import ex07.push.pub.LotteMart;
import ex07.push.pub.Mart;
import ex07.push.sub.Cus1;
import ex07.push.sub.Cus2;
import ex07.push.sub.Customer;

/**
 * push 방식 (옵저버 패턴)
 * 1. 구현 방식이 정해져 있음.
 * 2. 자바 lib: Reactive Java (자바 9), Stomp(그 외)
 * 3. 스프링 : Stomp (WebSocket 라이브러리)
 */
public class App {
    public static void main(String[] args) {
        //1. 객체 생성
        Mart lottemart = new LotteMart();
        Customer cus1 = new Cus1();
        System.out.println("고객 1 구독됨");
        Customer cus2 = new Cus2();
        System.out.println("고객 2 구독됨");

        //2. 구독
        lottemart.add(cus1);
        lottemart.add(cus2);

        //3. 구독취소
        lottemart.remove(cus1);
        System.out.println("고객 1 구독 취소");


        //4. 출판
        System.out.println("롯데마트 입고 시작");
        lottemart.received();
    }
}
