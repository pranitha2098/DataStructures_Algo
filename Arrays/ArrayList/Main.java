package Arrays.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//OurArrayList ob=new OurArrayList();
//ArrayList a = new ArrayList();
//a.add(2);
//        a.add(2);
//        int[] g={1,2,3,4};
//
//        System.out.println(g);
//        System.out.println(ob.size());
//
//        ob.add(5);
//        ob.add(5);
//        ob.add(5);
//        ob.add(5);
//
//
//
////        System.out.println(ob.size());
////            System.out.println(ob.contains(0));
//////                ob.removeLast();
////        System.out.println(ob);
////        ob.removeFirstAppearance(3);
////     int[] an=ob.toArray();
////        System.out.println(an[0]);
OurArrayList ob1=new OurArrayList();
OurArrayList ob2=new OurArrayList();
ob1.add(5);
ob1.add(4);
        ob1.add(7);
        ob1.add(8);
        ob2.add(5);
        ob1.add(5);
        ob2.add(8);
        ob2.add(6);
        ob2.add(5);

        int[] an=ob1.toArray();
//        ob1.addALl(ob2);
//        ob2.addALl(ob1);
        System.out.println(java.util.Arrays.toString(
                ob2.commonElements(ob1)));


    }
}
