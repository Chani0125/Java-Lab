

/**
 * x, y좌표를 저장합니다.
 */
public class PPoint {
    int xA;
    int yA;
    /**
     * x, y좌표를 받습니다.
     * @param x 정수형 x좌표
     * @param y 정수형 y좌표
     */
    public PPoint(int x, int y) {
        xA = x;
        yA = y;
    };
    /**
     * x좌표 필드값을 반환합니다
     * @return x좌표 필드값
     */
    public int getX() {
        return xA;
    }
    /**
     * y좌표 필드값을 반환합니다
     * @return y좌표 필드값
     */
    public int getY() {
        return yA;
    }
}
