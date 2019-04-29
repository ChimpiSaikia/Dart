public class Main {

    public static void main(String args[]){

        CartesianCoOrdinates pointsOnOuterCirle  = new CartesianCoOrdinates(9.15f, -0.6f);
        CartesianCoOrdinates pointsOnMiddleCircle  = new CartesianCoOrdinates(4,2.8f);
        CartesianCoOrdinates pointsOnInnerCircle  = new CartesianCoOrdinates(-0.2f,-0.9f);
        CartesianCoOrdinates pointsOnOutsideTarget  = new CartesianCoOrdinates(9.15f, 10.5f);

        System.out.println("Points earned in the outer circle is "+ pointsOnOuterCirle.calculatePoints(pointsOnOuterCirle));
        System.out.println("Points earned in the middle circle is "+ pointsOnMiddleCircle.calculatePoints(pointsOnMiddleCircle));
        System.out.println("Points earned in the inner circle is "+ pointsOnInnerCircle.calculatePoints(pointsOnInnerCircle));
        System.out.println("Points earned outside the target is "+ pointsOnOutsideTarget.calculatePoints(pointsOnOutsideTarget));
    }
}
