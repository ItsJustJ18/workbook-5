public class Vehicle extends Asset {
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


    @Override
    public double getVehicleValue() {
        int yearOfTheVehicle;
        double carValue = getOriginalCost();
        String dateGotten = dateAcquired;

        switch (year) {
            case 1:
                yearOfTheVehicle <= 3
                break;
            case 2:
                yearOfTheVehicle = 4 && yearOfTheVehicle >= 6;
                break;
            case 3:
                yearOfTheVehicle = 7;
                break;
            case 4:
                yearOfTheVehicle > 10;
                return yearOfTheVehicle - 1000;
                break;
            default:
                System.out.println(" Could not find value for your vehicle. ");
        }
        return yearOfTheVehicle - ( * getVehicleValue());
    }

}


