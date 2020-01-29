package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

        @Size(min = 10, max = 300, message = "Provide Job Location")
        @NotBlank(message = "Location is required, must be up to 300 characters. Try Again")
        private String location;

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

        @Override
        public String toString() {
            return location;
        }

}
