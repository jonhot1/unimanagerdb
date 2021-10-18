package pt.iade.unimanagerdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="students")
public class Unit { 
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column(name="stu_id")    private int id; 
    @Column(name="stu_name")  private String name; 
    @Column(name="stu_cour_id") private int credits; 
    public Unit() {} 
    public int getId() { return id; } 
    public String getname() { return name; } 
    public int getcourid() {return credits;}

    
}