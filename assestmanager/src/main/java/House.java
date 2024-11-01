public class House extends Asset{
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House(String description, String dataAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double valuePerSquareFoot = 0;

        switch (condition) {
            case 1:
                valuePerSquareFoot = 180;
                break;
            case 2:
                valuePerSquareFoot = 130;
                break;
            case 3:
                valuePerSquareFoot = 90;
                break;
            case 4:
                valuePerSquareFoot = 80;
                break;
            default:
                System.out.println(" Invalid value per square foot. ");
        }
        return (valuePerSquareFoot * squareFoot) + (.25 * lotSize);
    }

}


