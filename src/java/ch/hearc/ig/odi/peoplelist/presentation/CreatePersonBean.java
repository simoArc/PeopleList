/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation;

import ch.hearc.ig.odi.peoplelist.service.Services;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Simone Bissolotti
 */
@Named(value = "createPersonBean")
@RequestScoped
public class CreatePersonBean {

    @Inject
    Services services;

    /**
     * Creates a new instance of CreatePersonBean
     */
    public CreatePersonBean() {
    }

    private Long id;
    private String gender;
    private String firstName;
    private String lastName;
    private boolean married;
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String createPerson() throws Exception {

        if (services.savePerson(gender, firstName, lastName, married, birthDate) == 0L) {
            return "error.xhtml";
        }
        return null;
    }

}
