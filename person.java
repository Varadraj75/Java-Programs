public class person
{
    static String name; 
    static String address;
    person(String name, String address)
    {
        this.name = name; 
        this.address = address;
    }
    
}

class Employee extends person 
{
    String department;
    Employee(String name, String address, String dept)
    {
        super(name,address);
        this.department = dept;
    }
    
}
class professor extends Employee
{
    String institute; 
    professor(String name, String address, String dept, String institute)
    {
        super(name,address,dept);
        this.institute = institute;
    }
}