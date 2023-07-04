package JavaAdvanced.Interface.JavaDefaultInterfaces;

public class PointClonable implements Cloneable{
    int x;
    int y;

    public PointClonable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointClonable() {
    }

    protected  Object clone() throws CloneNotSupportedException{
        return super.clone();
    }



}
