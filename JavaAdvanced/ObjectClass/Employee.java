package JavaAdvanced.ObjectClass;

public class Employee  {
    String name;
    int id;

    Long ContactNo;

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


    public boolean equals(Object obj) {
        if(this == obj)
            return true;

       if( !(obj instanceof Employee) )
          return false;

           Employee other = (Employee) obj;
           if (this.ContactNo.equals(other.ContactNo) && this.name.equals(other.name) && this.id == other.id)
               return true;

         return false;
    }











}





