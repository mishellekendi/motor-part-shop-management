public class EnginePart extends Part{
    private int warrantyPeriod;
    public EnginePart(String partID, String name, double price, int warrantyPeriod){
        super(partID , name ,price);
    this.warrantyPeriod = warrantyPeriod;    }

    @Override
    public String getdetails(){
        return "Engine Part: " + getName() +", Price: " + getprice() +", Warranty: " + warrantyPeriod + "months";
    }
    
}
  