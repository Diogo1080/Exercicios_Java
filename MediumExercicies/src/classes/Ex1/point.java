package classes.Ex1;

public class point {
    private final double x;
    private final double y;
    public point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return this.x;
    }
    public double getDistanceTo0(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }
    public double distanceTo(point X){
        return Math.sqrt((Math.pow(this.x-X.x,2))+(Math.pow(this.y-X.y,2)));
    }
}
