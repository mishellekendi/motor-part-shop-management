public class BodyPart extends part{
    private String material;
    public BodyPart(String partID, String name, double price, String material){
        super(partID, name, price);
        this.material = material;
    }
    @Override
    public String getdetails(){
        return "Body Part: " + getName() +
               ", Price: " + getprice() +
               ",Material: " + material;
    }
 }

}
