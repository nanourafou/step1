package geometries;

import primitives.Point3D;
import primitives.Vector;

public abstract class Geometry {

    // ***************** Constructors ********************** //
    public Geometry(){}

    public Geometry(Geometry geoObj){}

    // ***************** Operations ******************** //

    /**
     * @param p the point of/in the object
     * @return the normal vector of the object
     */
    public abstract Vector getNormal(Point3D p);

}
