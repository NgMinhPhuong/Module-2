package PointAndMoveablePoint;

public class Point {
    private float x;
    private float y;
    Point(){

    }
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float [] getXY(){
        float [] a = {x, y};
        return a;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
