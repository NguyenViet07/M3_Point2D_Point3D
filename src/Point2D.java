public class Point2D {
    public float x = 0;
    public float y = 0;

    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] temp = new float[2];
        temp[0] = this.x;
        temp[1] =  this.y;
        return temp;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Poin 2d: x = " +this.x + " , y = " + this.y;
    }
}
