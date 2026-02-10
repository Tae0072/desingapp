package ex04;

// SOLID : 객체지향원칙 (D, O)
// DIP : 추상적인 것에 의존하라.
// OCP : 새로운 코드에는 OPEN, 기존 코드에는 CLOSE.
public class App {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Doorman doorman = Doorman.instance; // 싱글톤
        Doorman doorman2 = Doorman.instance; // 싱글톤
        Mouse mouse = new Mouse();
        Snake snake = new Snake();

        System.out.println(doorman2.hashCode());
        System.out.println(doorman.hashCode()); // (해시 값이 같음 = new가 2번 된게 아님) = 싱글톤.

        doorman.쫓아내(tiger);

    }
}
