public class ParkingLot {
    public ParkingSpot spots[];

    public ParkingLot(int numParkingSpots, int numHandicapSpots){
        spots = new ParkingSpot[numParkingSpots];
        for (int i = 0; i < numHandicapSpots; i++){
            spots[i] = new ParkingSpot(true);
        }
        for (int i = numHandicapSpots; i < numParkingSpots; i++){
            spots[i] = new ParkingSpot(false);
        }
    }

    public int parkCar(Car car){
        for (int i = 0; i < spots.length; i++){
            if (car.getHandicap() == spots[i].getHandicap() && spots[i].getParkedCar() == null){
                spots[i].setParkedCar(car);
                return i;
            }
        }
        return -1;
    }

    public Car removeCar(int parkingSpotNum){
        Car tmpCar = spots[parkingSpotNum].getParkedCar();
        spots[parkingSpotNum].setParkedCar(null);
        return tmpCar;
    }

    @Override
    public String toString(){
        String outStr = "";
        int numStandard = 0;
        int numHandicap = 0;
        for (int i = 0; i < spots.length; i++){
            if (spots[i].getParkedCar() == null && spots[i].getHandicap() == true){
                numHandicap += 1;
            }
            else if (spots[i].getParkedCar() == null) {
                numStandard += 1;
            }
        }
        return outStr + numHandicap + " " + numStandard;
    }
}

