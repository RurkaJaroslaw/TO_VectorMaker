package sample;

public class DecVector3D extends Vector3D {
    public DecVector3D(int x, int y, int z){
        vec = new Vector2D(x,y);
        this.z =z;
    }

    public double scalar(Vector3D vector3d) {
        return vec.getX()*vector3d.vec.getX() + vec.getY()*vector3d.vec.getY() + z*vector3d.getZ() ;
    }


    public Vector3D vectorMultip(Vector3D vector3d) {
        Vector3D v3d = new Vector3D();
        v3d.vec.setX( ( this.vec.getY() * vector3d.getZ() - this.z * vector3d.vec.getY() ) );
        v3d.vec.setY( ( this.getZ() * vector3d.vec.getX() - this.vec.getX() * vector3d.getZ() ) );
        v3d.setZ( ( this.vec.getX() * vector3d.vec.getY() - this.vec.getY() * vector3d.vec.getX() ) );
        return v3d;
    }

}
