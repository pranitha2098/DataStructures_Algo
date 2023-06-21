package JavaAdvanced.Interface.JavaDefaultInterfaces;

public class MainComparable {
    public static void main(String[] args) {
        StudentComparable s1 = new StudentComparable("Pranitha",1,2);
        StudentComparable  s2 = new StudentComparable("sameer",2,1);
        StudentComparable s3 = new StudentComparable("Geetika",3,5);
        StudentComparable s4 = new StudentComparable("Eshwari",4,6);


        if(s1.compareTo(s2)==0)
            System.out.println("equal");
        if(s1.compareTo(s2) >0)
            System.out.println("s1 is better");
        if(s1.compareTo(s2) <0)
            System.out.println("s2 is better");



    }
}
