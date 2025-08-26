class student extends person
{
    static int enrolmentNumber;
    student(String name, String address, int enrolmentNumber)
    {
        super(name,address);
        this.enrolmentNumber = enrolmentNumber;
    }
    public static void main(String args[])
    {
        System.out.println("1st class:-");
        person obj = new person("varad","Balangir");
        System.out.println(name);
        System.out.println(address);
        System.out.println("\n2st class");
        student obj1 = new student("varad","Balangir",21);
        System.out.println(name);
        System.out.println(address);
        System.out.println(enrolmentNumber);
    }
}