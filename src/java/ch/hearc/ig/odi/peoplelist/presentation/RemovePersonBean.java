/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Simone Bissolotti
 */
@Named(value = "removePersonBean")
@RequestScoped
public class RemovePersonBean {

    @Inject
    Services services;
    private Person personToDelete;

    /**
     * Creates a new instance of RemovePersonBean
     */
    public RemovePersonBean() {
    }

    public void remove() {
        services.remove(personToDelete);
    }

    public Person getPersonToDelete() {
        return personToDelete;
    }

    public void setPersonToDelete(Person personToDelete) {
        this.personToDelete = personToDelete;
    }
    
    

}
