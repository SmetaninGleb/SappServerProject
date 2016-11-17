package ru.li24.Sapp.Server.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.li24.Sapp.Server.entity.GroupSapp;
import ru.li24.Sapp.Server.entity.PersonSapp;

import java.util.ArrayList;

@Repository
public class PersonSappDAOImpl implements PersonSappDAO {

    @Autowired
    SessionFactory sessionFactory;

    public void addPerson(PersonSapp person) {
        sessionFactory.getCurrentSession().save(person);
    }

    public void updatePerson(PersonSapp person) {
        sessionFactory.getCurrentSession().update(person);
    }

    public PersonSapp getPersonById(Integer id) {
        return sessionFactory.getCurrentSession().load(PersonSapp.class, id);
    }

    public ArrayList<PersonSapp> getPersonsByGroup(GroupSapp group) {
        return null;
    }

    public void deletePerson(PersonSapp person) {
        sessionFactory.getCurrentSession().delete(person);
    }
}
