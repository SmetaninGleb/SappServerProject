package ru.li24.Sapp.Server.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Persons")
public class PersonSapp {

    @Id
    @Column(name = "Id")
    @GeneratedValue
    private Integer id;

    @Column(name = "Firstname")
    private String firstname;

    @Column(name = "Lastname")
    private String lastname;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Person_Group", joinColumns = @JoinColumn(name = "Id_Person"), inverseJoinColumns = @JoinColumn(name = "Id_Group"))
    private ArrayList<GroupSapp> groups;

    public Integer getId(){
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public ArrayList<GroupSapp> getGroups() {
        return groups;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGroups(ArrayList<GroupSapp> groups) {
        this.groups = groups;
    }

}
