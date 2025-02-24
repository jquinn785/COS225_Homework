public class PatientTester {
    public void main(){
        PatientManager patientManager = new PatientManager();
        System.out.println(patientManager);

        patientManager.addPatient(new Patient(1, 200));
        patientManager.addPatient(new Patient(2, 400));
        patientManager.addPatient(new Patient(3, 600));
        patientManager.addPatient(new Patient(4, 800));
        System.out.println(patientManager);

        patientManager.caffeineAbsorption();
        patientManager.caffeineAbsorption();

        System.out.println(patientManager);


        
        patientManager.removePatient(patientManager.findHighestPatient());

        System.out.println(patientManager);

    }
}
