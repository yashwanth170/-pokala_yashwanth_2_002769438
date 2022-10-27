/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author verma
 */
public class hospital {
    private doctor doc;
    private String state;
    private Community community;
    private String hosp_name;
    private String city;
    
    public hospital(doctor doc,String state,String hosp_name,Community community, String city)
    {
        this.doc=doc;
        this.state=state;
        this.community=community;
        this.city=city;
        this.hosp_name=hosp_name;
    }

    public String getHosp_name() {
        return hosp_name;
    }

    public void setHosp_name(String hosp_name) {
        this.hosp_name = hosp_name;
    }
    
    
    public doctor getDoc() {
        return doc;
    }

    public void setDoc(doctor doc) {
        this.doc = doc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
