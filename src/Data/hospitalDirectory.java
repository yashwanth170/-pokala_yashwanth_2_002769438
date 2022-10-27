/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import Model.hospital;
import Model.doctor;
/**
 *
 * @author verma
 */
public class hospitalDirectory {
    private ArrayList<hospital> hosp;
    public hospitalDirectory()
    {
        hosp=new ArrayList<>();
    }
    
    public void addHospital(hospital hos)
    {
        hosp.add(hos);
    }
    
    public void removeHospital(hospital hos)
    {
        hosp.remove(hos);
    }

    public ArrayList<hospital> getHosp() {
        return hosp;
    }

    public void setHosp(ArrayList<hospital> hosp) {
        this.hosp = hosp;
    }
    
    public hospital searchHospital(int txtId) {

        for (hospital h : hosp) {
            doctor d=h.getDoc();
            System.out.println("person "+d.getId());
            if (d.getId() == txtId ) {
                System.out.println("Hospital"+h.getHosp_name());
                return h;
            }
        }
        return null;
    }
    
    public void deleteHospital(int id) {
        System.out.println("id "+id);
        
       for (hospital h : hosp) {
            
            if (h.getDoc().getId() == id ) {
                hosp.remove(h);
                return;
            }
        }
    }
}
