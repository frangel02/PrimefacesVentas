package com.prinfacesventas.dao;

import com.prinfacesventas.model.Persona;

import java.sql.PreparedStatement;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * PersonaDao
 * Date: 2/23/2019
 * Time: 10:26 PM
 * Created by frodriguez on
 */
public class PersonaDao extends Dao  {

    public void registrar(Persona persona) throws Exception {
        try {
            this.connect();
            PreparedStatement statement = this.getConnection().prepareStatement("INSERT INTO Persona (nombre, sexo) VALUES (?,?)");
            statement.setString(1,persona.getNombre());
            statement.setString(2,persona.getSexo());
            statement.executeUpdate();
            System.out.println("Registro Insertado");
        }catch (Exception e){
            throw e;
        }finally {
            this.close();
            System.out.println("Conexion cerrada con exito");
        }
    }
}
