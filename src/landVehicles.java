public class landVehicles extends locomotive{
    private String usage;
    private int numberOfWheels;
    private int amountOfFuel;

    public landVehicles(String manufacturer, String capacity, String usage, int numberOfWheels, int amountOfFuel) {
        super(manufacturer, capacity);
        this.usage = usage;
        this.numberOfWheels = numberOfWheels;
        this.amountOfFuel = amountOfFuel;
    }

    public landVehicles() {
        super();
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public void printLandVehicleDetail(){
        System.out.println("Type: "+landVehicles.class.getName()+" Manufacturer:" +getManufacturer() +"");

    }


    public landVehicles(String manufacturer, String capacity, int numberOfWheels) {
        super(manufacturer, capacity);
        this.numberOfWheels = numberOfWheels;
    }

    public void landVehicleDetail() {
        
    }

    public landVehicles(int amountOfFuel) {
        this();
        this.amountOfFuel = amountOfFuel;
    }
}

