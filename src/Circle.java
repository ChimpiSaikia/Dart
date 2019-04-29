public enum Circle {

    OUTER(10,1),
    MIDDLE(5,5),
    INNER(1,10);

    private int points;
    private int radius;

    private Circle(int radius, int points){
        this.radius = radius;
        this.points = points;
    }

    public boolean OnOrWithinBoundary(CartesianCoOrdinates coOrdinates)
    {
        float value = (coOrdinates.x * coOrdinates.x) + (coOrdinates.y * coOrdinates.y);
        if (value <= Math.abs(radius * radius)){
            return true;
        }
        return false;

    }
    public int points() {
        return points;
    }




}
