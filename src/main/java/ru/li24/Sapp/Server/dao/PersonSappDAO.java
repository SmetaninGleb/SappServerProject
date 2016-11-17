package ru.li24.Sapp.Server.dao;


import ru.li24.Sapp.Server.entity.GroupSapp;
import ru.li24.Sapp.Server.entity.PersonSapp;

import java.util.ArrayList;

public interface PersonSappDAO {
    public void addPerson(PersonSapp person);
    public void updatePerson(PersonSapp person);
    public PersonSapp getPersonById(Integer id);
    public ArrayList<PersonSapp> getPersonsByGroup(GroupSapp group);
    public void deletePerson(PersonSapp person);

}
