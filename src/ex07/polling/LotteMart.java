package ex07.polling;

public class LotteMart {
    private String value = null;

    // 상태 확인
    public String getValue() {
        return value;
    }

    // 입고 - 유일한 행위
    public void received(){
        value = "상품";
    }
}
