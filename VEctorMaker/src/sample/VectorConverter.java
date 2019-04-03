package sample;

public class VectorConverter implements Algebra {

    private Vector2D vector;

    public VectorConverter(Vector2D v2D) {
        vector = v2D;
    }

    public VectorConverter(double length, double angle) {
        vector = new Vector2D(length * Math.sin(Math.toRadians(angle)), length * Math.cos(Math.toRadians(angle)));
    }

    public Vector2D getVector() {
        return vector;
    }

    public double getAngle() {
        return Math.toDegrees(Math.acos( this.vector.getY() / this.vector.abs() ));
    }

    @Override
    public double abs() {
        return Math.sqrt(vector.x*vector.x + vector.y*vector.y);
    }

}
