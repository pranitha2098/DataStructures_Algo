package JavaAdvanced.ObjectClass;

import java.util.Objects;

public class Employee  {
    String name;
    int id;

    Long ContactNo;

    public Employee() {
    }

    public Employee(String name, int id, Long contactNo) {
        this.name = name;
        this.id = id;
        ContactNo = contactNo;
        System.out.println(this);
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", ContactNo=" + ContactNo +
                '}';
    }


//    public boolean equals(Object obj) {
//        if(this == obj)
//            return true;
//
//       if( !(obj instanceof Employee) )
//          return false;
//
//           Employee other = (Employee) obj;
//           if (this.ContactNo.equals(other.ContactNo) && this.name.equals(other.name) && this.id == other.id)
//               return true;
//
//         return false;
//    }
//
//    public  int hashCode(){
//        return Math.abs(Objects.hashCode(ContactNo+id+name))  ;
//    };


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(ContactNo, employee.ContactNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, ContactNo);
    }
}





