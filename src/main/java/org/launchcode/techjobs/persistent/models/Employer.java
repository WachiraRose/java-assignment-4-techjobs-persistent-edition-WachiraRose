package org.launchcode.techjobs.persistent.models;
// add string field for location with validation that ensures it is not empty and its length is reasonable.
// add public accessor method

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotNull
    @Size(min=3, max=255)
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer() {

    }
    public Employer(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }




}
