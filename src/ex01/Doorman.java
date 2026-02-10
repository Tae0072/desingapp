package ex01;

public class Doorman {

    // 책임
    //    public void 쫓아내(Tiger a){//doorman 은 Tiger타입을 받고 있기에 mouse를 넣을 수가 없다.Tiger, mouse를 추상화 하면 가능.
    //        System.out.println(a.getName() + "쫓아내");
    //    }
    public void 쫓아내(Animal a){
        System.out.println(a.getName() + "쫓아내");
    }
}
