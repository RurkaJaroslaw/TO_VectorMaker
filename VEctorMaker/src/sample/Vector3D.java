package sample;

public class Vector3D {
    protected double z;
    protected Vector2D vec;


    public Vector3D() {
        vec = new Vector2D();
        this.z = 0;
    }

    public Vector3D(int x, int y, int z) {
        vec = new Vector2D(x, y);
        this.z = z;
    }

    public Vector3D(Vector2D vec2D, double z)
    {
        vec = vec2D;
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public double getZ() {
        return z;
    }


    public double abs(){
        Vector2D vector2D = vec;
        return Math.sqrt( vector2D.getX()*vector2D.getX() + vector2D.getY()*vector2D.getY() + z*z );
    }


    @Override
    public String toString(){
        return "(" + vec.getX() + ", " + vec.getY() + ", " + z + ")";
    }

}
