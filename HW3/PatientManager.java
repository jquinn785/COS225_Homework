import java.util.ArrayList;

public class PatientManager {
    public ArrayList<Patient> patients = new ArrayList<Patient>();

    public PatientManager(){}

    public int addPatient(Patient patient){
        patients.add(patient);
        return patients.indexOf(patient);
    }

    public Patient removePatient(int index){
        return patients.remove(index);
    }

    public int findHighestPatient(){
        Patient highestPatient = patients.get(0);
        for(int i = 0; i < patients.size(); i++){
            if (patients.get(i).getCaffeineLevel() > highestPatient.getCaffeineLevel()){
                highestPatient = patients.get(i);
            }
        }
        return patients.indexOf(highestPatient);
    }

    public void caffeineAbsorption(){
        for (int i = patients.size() - 1; i >= 0; i--){

            if (patients.get(i).getCaffeineLevel() > 160){
                patients.get(i).setCaffeineLevel(patients.get(i).getCaffeineLevel() - 160);
            }
            else {
                patients.remove(i);
            }
        }
    }

    @Override
    public String toString(){
        String outStr = "";

        if(patients.size() == 0){
            return "Empty";
        }
        for(int i = 0; i < patients.size(); i++){
            outStr += patients.get(i).getIdNumber() + " " + patients.get(i).getCaffeineLevel() + "\n";
        }
        return outStr;
    }
}
