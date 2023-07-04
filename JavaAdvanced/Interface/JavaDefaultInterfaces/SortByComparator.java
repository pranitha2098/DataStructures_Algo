package JavaAdvanced.Interface.JavaDefaultInterfaces;

import java.util.Comparator;

public class SortByComparator implements Comparator<StudentComparable> {

    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
        return o1.id-o2.id;
    }
}
