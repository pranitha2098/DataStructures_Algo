package JavaAdvanced.Interface.JavaDefaultInterfaces;

import Arrays.ArrayList.OurArrayList;

import java.util.ArrayList;

public class MainIterator {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(3);
        a.add(3);
        a.add(3);
        a.add(3);
        a.add(3);


        for(var i : a)
            System.out.println(i);


        OurArrayList a2 = new OurArrayList();
        a2.add(2);
        a2.add(2);
        a2.add(2);
        a2.add(2);

        for (var i :a2)
            System.out.println(i);



    }
}
