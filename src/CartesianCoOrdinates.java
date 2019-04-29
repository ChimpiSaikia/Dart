public class CartesianCoOrdinates {

    float x;
    float y;

    CartesianCoOrdinates(float x, float y){
        this.x = x;
        this.y = y;
    }

    public int calculatePoints(CartesianCoOrdinates hit){
        if(Circle.INNER.OnOrWithinBoundary(hit)){
            return Circle.INNER.points();
        }
        else if (Circle.MIDDLE.OnOrWithinBoundary(hit)){
            return Circle.MIDDLE.points();
        }
        else if (Circle.OUTER.OnOrWithinBoundary(hit)){
            return Circle.OUTER.points();
        }
        return 0;
    }
}
