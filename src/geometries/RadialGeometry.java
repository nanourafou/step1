package geometries;

import primitives.Point3D;
import primitives.Vector;

public abstract class RadialGeometry extends Geometry {

    Vector _radius; //Vector, Point3D, double ??

    // ***************** Constructors ********************** //
    public RadialGeometry(RadialGeometry x){
        super(x);
        _radius = new Vector(x._radius);
    }

    public RadialGeometry(Vector radius){
        super(); //need this ???
        _radius = new Vector(radius);
    }


    // ***************** Getters/Setters ********************** //

    /**
     * @return the radius of the radial object
     */
    public Vector getRadius(){
        return _radius;
    }

    // ***************** Administration  ******************** //
    @Override
    public boolean equals(Object obj) {
        return _radius.equals(obj);
    }
}
