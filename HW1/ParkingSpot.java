public class ParkingSpot {
    public Car parkedCar;
    public Boolean handicap;

    public ParkingSpot(Boolean handicap) {
        this.handicap = handicap;
    }

    public Boolean getHandicap(){
        return this.handicap;
    }

    public Car getParkedCar(){
        return this.parkedCar;
    }

    public void setParkedCar(Car parkedCar){
        this.parkedCar = parkedCar;
    }
}
