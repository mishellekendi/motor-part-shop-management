public abstract class Part{
    private String partID;
    private String name;
    private double price;

    public Part(String partID, String name, double price){
        this.partID = partID;
        this.name = name;
        this.price = price;
    }

    public String getPartID(){
        return partID;
    }
    public String getName(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
    this.price = price;
    }
    public abstract String getdetails();
}