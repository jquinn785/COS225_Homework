public class Car {
    public String make;
    public String color;
    public Boolean handicap;

    public Car(String make, String color, Boolean handicap) {
        this.make = make;
        this.color = color;
        this.handicap = handicap;
    }

    public Boolean getHandicap(){
        return this.handicap;
    }
}
