package geometries;

import primitives.Models;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

/**
 * The class describing a Cylinder in space.
 */
public class Cylinder  extends RadialGeometry{

    Point3D _originPoint;
    Ray _directionRay;
    double _height;

    // ***************** Constructors ********************** //
    /**
     * Constructor for a Cylinder.
     * @param directionRay Ray to define the direction and inclinaison.
     * @param origin Original position for the cylinder.
     * @param height The height of the cylinder.
     */
    public Cylinder(Ray directionRay, Point3D radius, Point3D origin, double height){
        super(radius);
        this._directionRay = new Ray(directionRay);
        this._height = height;
        this._originPoint = new Point3D(origin);
    }


    /**
     * Copy Constructor
     */
    public Cylinder(Cylinder cyl){
        super(cyl);
        this._originPoint = new Point3D(cyl._originPoint);
        this._height = cyl._height;
        this._directionRay = new Ray(cyl._directionRay);
    }

    // ***************** Administration  ******************** //
    @Override
    public String toString() {
        return "Cylinder : \n "+ super.toString() +" \n Ray: "+_directionRay+"\n "+_originPoint+"\n "+"Height: "+_height;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cylinder))
            return false;
        Cylinder toCompare = (Cylinder)obj;
        return _originPoint.equals(toCompare._originPoint)&&_directionRay.equals(toCompare._directionRay)&&(_height==toCompare._height)&&super.equals(toCompare);
    }

    // ***************** Getters/Setters ********************** //

    /**
     * @return The original position for the cylinder.
     */
    public Point3D getOriginPoint() {
        return _originPoint;
    }

    /**
     * @return The height of the cylinder.
     */
    public double getHeight() {
        return _height;
    }

    /**
     * @return The the direction and inclinaison of the cylinder.
     */
    public Ray getDirectionRay() {
        return _directionRay;
    }

    // ***************** Operations ******************** //

    @Override
    public Vector getNormal(Point3D p) {
        return null;
    }
}
