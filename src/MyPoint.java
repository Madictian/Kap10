public class MyPoint {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public  double distance(MyPoint myPoint){

        double distanceX = myPoint.getX() - this.x;
        double distanceY = myPoint.getY() - this.y;
        if (distanceX < 0){
            distanceX = distanceX * -1;
        }
        if (distanceY < 0){
            distanceY = distanceY * -1;
        }
        double distancePoint = distanceX + distanceY;
        return distancePoint;


    }
    public int distance(int x, int y){
        int distance;
        if (x > y){
            distance = x - y;
        }else{
            distance = y - x;
        }
        return distance;
    }

    public static double distance(int x, int y, int x2, int y2){
        double distanceX = x2 - x;
        double distanceY = y2 - y;
        if (distanceX < 0){
            distanceX = distanceX * -1;
        }
        if (distanceY < 0){
            distanceY = distanceY * -1;
        }
        double distancePoint = distanceX + distanceY;
        return distancePoint;

    }

}
