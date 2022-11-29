import kr.ac.kookmin.cs.*;

/**
 * PPoint 객체를 생성하여 출력합니다.
 * @author Chan
 * @version 0.0
 */
class PPointTest {
    /**
     * PPoint x에 10, y에 20을 생성자로 주고 이를 출력합니다.
     * @param args 기본 입력값
     */
    public static void main(String args[]) {
        PPoint aObj = new PPoint(10, 20);
        System.out.println("aObj(x, y) = " + aObj.getX() + ", "+ aObj.getY());
    }
}
