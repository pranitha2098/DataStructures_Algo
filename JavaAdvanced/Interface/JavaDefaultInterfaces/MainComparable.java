package JavaAdvanced.Interface.JavaDefaultInterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainComparable {
    public static void main(String[] args) {
        StudentComparable s1 = new StudentComparable("Pranitha",1,2);
        StudentComparable  s2 = new StudentComparable("sameer",2,1);
        StudentComparable s3 = new StudentComparable("Geetika",3,5);
        StudentComparable s4 = new StudentComparable("Eshwari",4,6);
SortByComparator c = new SortByComparator();

        ArrayList s = new ArrayList();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        System.out.println(s);

        Collections.sort(s,c);
        System.out.println(s);


        ArrayList a = new ArrayList();
        a.add(1);
        a.add(88);
        a.add(6);
        a.add(0);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);






    }
}
