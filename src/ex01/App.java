package ex01;

// SOLID : 객체지향원칙 (D, O)
// DIP : 추상적인 것에 의존하라.
// OCP : 새로운 코드에는 OPEN, 기존 코드에는 CLOSE.
public class App {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Doorman doorman = new Doorman();
        Mouse mouse = new Mouse();
        Snake snake = new Snake();

        doorman.쫓아내(tiger);
        doorman.쫓아내(mouse);
        doorman.쫓아내(snake);
    }
}
