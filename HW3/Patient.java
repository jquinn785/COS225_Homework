public class Patient {
    public int idNumber;
    public double caffeineLevel;

    public Patient(int idNumber, double caffeineLevel){
        this.idNumber = idNumber;
        this.caffeineLevel = caffeineLevel;
    }

    public int getIdNumber(){
        return this.idNumber;
    }

    public double getCaffeineLevel(){
        return this.caffeineLevel;
    }

    public void setCaffeineLevel(double caffeineLevel){
        this.caffeineLevel = caffeineLevel;
    }
}