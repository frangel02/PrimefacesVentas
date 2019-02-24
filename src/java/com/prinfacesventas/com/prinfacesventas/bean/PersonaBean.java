package com.prinfacesventas.com.prinfacesventas.bean;

import com.prinfacesventas.dao.PersonaDao;
import com.prinfacesventas.model.Persona;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * PersonaBean
 * Date: 2/23/2019
 * Time: 10:41 PM
 * Created by frodriguez on
 */

@ManagedBean
@RequestScoped
public class PersonaBean {

    private Persona persona = new Persona();

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void registrar() throws Exception {
        PersonaDao personaDao;

        try{
            personaDao = new PersonaDao();
            personaDao.registrar(persona);
        }catch (Exception e){
            throw e;
        }
    }
}
