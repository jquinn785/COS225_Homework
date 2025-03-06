public class ParkingTester {
    public static void main(String[] args) {
        ParkingLot parkingLot1 = new ParkingLot(8, 2);
        System.out.println(parkingLot1);
        
        Car blueInfiniti = new Car("Infiniti", "Blue", true);
        int parkingSpotNum = parkingLot1.parkCar(blueInfiniti);
        System.out.println(parkingLot1);

        Car blackCadiliac = new Car("Cadiliac", "Black", false);
        parkingLot1.parkCar(blackCadiliac);
        System.out.println(parkingLot1);

        parkingLot1.removeCar(parkingSpotNum);
        System.out.println(parkingLot1);

    }
}
