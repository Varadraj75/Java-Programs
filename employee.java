class employee
{
    private String name; 
    private float fMonthlypay; 
    public void setMonthlyPay(float fMonthlypay)
    {
        this.fMonthlypay = fMonthlypay;
    }
    public float getMonthlypay()
    {
        return fMonthlypay;
    }
    public void setName(String name)
    {
        this.name = name.toString();
    }
    public String getName()
    {
        return name;
    }
    public float getYearlyPay()
    {
        return fMonthlypay*12.0f;
    }
}
class Programmer extends employee
{
    private String project; 
    public void setProject(String project)
    {
        this.project = project.toString();
    }
    public String getProject()
    {
        return project;
    }
}
class SalesPerson extends employee
{
    private float fBonus; 
    public void setBonus(float fBonus)
    {
        this.fBonus = fBonus;
    }
    public float getBonus()
    {
        return fBonus;
    }
    public float getYearlyPay()
    {
        return getMonthlypay()*12.0f+fBonus;
    }
}
