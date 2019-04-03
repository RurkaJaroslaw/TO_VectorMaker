package sample;

public class Main {
    public static void main(String[] args){

        Vector2D v2 = new Vector2D(10, 15);
        System.out.println(v2.abs());
        Vector3D v3 = new Vector3D(v2, 20);
        System.out.println(v3);
        System.out.println(v3.abs());
        System.out.println("////////////////////////////////////////");

        VectorConverter vc = new VectorConverter(v2);
        System.out.println(vc.getAngle());
        System.out.println(vc.abs());
        System.out.println("////////////////////////////////////////");

        VectorConverter vf = new VectorConverter(36, 150);
        System.out.println(vf.getVector());
        System.out.println(vf.abs());
        System.out.println(vf.getAngle());
        System.out.println("////////////////////////////////////////");

        Vector3D v3_1 = new Vector3D(10, 5, 0);
        DecVector3D v3_2 = new DecVector3D(10, 55, 0);
        System.out.println(v3_2 + " il.scalar. " + v3_1 + " = " + v3_2.scalar(v3));
        System.out.println(v3_2 + " il.vektor. " + v3_1 + " = " + v3_2.vectorMultip(v3));


    }
}
