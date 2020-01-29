package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 1500, message = "Description cannot exceed 1500 characters")
//    @NotBlank(message = "Description is required, must be up to 300 characters. Try Again")
    private String description;

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    @Override
//    public String toString() {
//        return location;
//    }

}
