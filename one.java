class one 
{
    protected int value;
    public void display()
    {
     System.out.println("I am member of class one.");
    }
}

class two extends one 
{
    int value; 
    public void display()
    {
        System.out.println("Value="+value);
        System.out.println("I am member of class Two.");
    }
    public void othermethod()
    {
        System.out.println("I am going to use variable value and invoke method display().");
        value = 25; 
        display();
    }
}
