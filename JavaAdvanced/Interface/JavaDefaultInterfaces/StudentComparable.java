package JavaAdvanced.Interface.JavaDefaultInterfaces;


public class StudentComparable implements Comparable<StudentComparable>{
    String name;
    int id;
    int rank;

    public StudentComparable(String name, int id, int rank) {
        this.name = name;
        this.id = id;
        this.rank= rank;
    }

    @Override
    public int compareTo(StudentComparable o) {
     return this.rank - o.rank;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id=" + id +
                ", rank=" + rank
               ;
    }
}
