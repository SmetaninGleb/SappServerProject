package ru.li24.Sapp.Server.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Groups")
public class GroupSapp {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Integer id;

    @Column(name = "GroupName")
    private String groupName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Group_Parent", joinColumns = @JoinColumn(name = "IdParent"), inverseJoinColumns = @JoinColumn(name = "IdChildren"))
    private ArrayList<Integer> ParentsGroupId;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Group_Parent", joinColumns = @JoinColumn(name = "IdChildren"), inverseJoinColumns = @JoinColumn(name = "IdParent"))
    private ArrayList<Integer> ChildrenGroupId;

    public Integer getId(){
        return id;
    }

    public String getGroupName(){
        return groupName;
    }

    public ArrayList<Integer> getParentsGroupIdList(){
        return ParentsGroupId;
    }

    public ArrayList<Integer> getChildrenGroupIdList() {
        return ChildrenGroupId;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setChildrenGroupId(ArrayList<Integer> childrenGroupId) {
        ChildrenGroupId = childrenGroupId;
    }

    public void setParentsGroupId(ArrayList<Integer> parentsGroupId) {
        ParentsGroupId = parentsGroupId;
    }
}
