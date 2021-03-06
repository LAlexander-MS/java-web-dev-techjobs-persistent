package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


        @Size(min = 3, max = 300, message = "Provide Job Location")
        @NotBlank(message = "Location is required, must be up to 300 characters. Try Again")
        private String location;

        @OneToMany
        @JoinColumn
        private List<Job> jobs = new ArrayList<>();



        public Employer(String location) {
            this.location = location;
        }

        public Employer() {}

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

}
