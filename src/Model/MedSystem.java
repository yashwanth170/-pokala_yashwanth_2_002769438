package Model;

import Data.PatientDirectory;
import Data.PersonDirectory;
import Data.hospitalDirectory;
import javax.swing.JTextField;

public class MedSystem {
    
    private PatientDirectory patientList;
    private PersonDirectory personList;
    private hospitalDirectory hospitalList;
    private City city;
    
    public MedSystem(){
        personList = new PersonDirectory();
        patientList  = new PatientDirectory();
        hospitalList=new hospitalDirectory();
    }
    
    
    
    public void addPerson(Person p){
        personList.addPerson(p);
    }

    public void addPatient(Patient p){
        patientList.addPatients(p);
    }
    
    public void addHosp(hospital hos)
    {
        hospitalList.addHospital(hos);
    }
    
    public void delHosp(hospital hos)
    {
        hospitalList.removeHospital(hos);
    }
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public hospitalDirectory getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(hospitalDirectory hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    
    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }

    public Person searchUser(int txtId) {
        System.out.println("idid:"+txtId);
        return personList.searchUser(txtId);
    }
    
    public hospital searchHospital(int txtId) {
        System.out.println("idid:"+txtId);
        return hospitalList.searchHospital(txtId);
    }

    public void encounterPatient(int id, Encounter enc) {
        patientList.encounterPatient(id, enc);
    }

    public void deletePerson(int id) {
        personList.deletePerson(id);
    }

    public void deletePatient(int id) {
        patientList.deletePatient(id);
    }
    
    public void deleteHospital(int id) {
        hospitalList.deleteHospital(id);
    }
    
      public Patient searcPatient(int txtId) {
        return patientList.searcPatient(txtId);
    }

    public int searchPerson(int txtid)
      {
          return personList.searchPerson(txtid);
      }
    
    public int searchHospId(int txtid)
      {
          return hospitalList.searchHospId(txtid);
      }
   

}
