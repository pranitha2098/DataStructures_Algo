package JavaAdvanced.Interface.JavaDefaultInterfaces;

public class MainClonable {
    public static void main(String[] args)  {
        PointClonable p = new PointClonable(2,3);
//        PointClonable p2 = new PointClonable();
//        p2.x= p.x;
//        p2.y=p.y;

        PointClonable p2 = null;
        try {
            p2 = (PointClonable) p.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
p.x=9;

        System.out.println(p);
        System.out.println(p2);









    }
}
