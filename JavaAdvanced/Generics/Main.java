package JavaAdvanced.Generics;

import Arrays.ArrayList.OurArrayList;
import JavaAdvanced.ObjectClass.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();

        OurSecondArrayList<Employee> s = new OurSecondArrayList();
        s.p(new Employee());
        s.add(new Employee("pranitha",3,87777L));
        s.add(new Employee("sameer",7,87777L));
        s.add(new Employee("shekhar",6,87777L));
        s.add(new Employee("pranitha2",4,87777L));
        System.out.println(s);



    }
}
