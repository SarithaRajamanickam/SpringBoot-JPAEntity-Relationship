package com.example.demo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Department {

   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO)

   private Integer id;
   private String name;

 @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true,mappedBy="department")
  //  @JoinColumn(name = "Department_id")
   private List<Employee> employee;
public Department() {
		super();
		
	}
   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName( ){
      return name;
   }

   public void setName( String deptName ){
      this.name = deptName;
   }
    public List<Employee> getEmployee() {
      return employee;
   }

   public void setEmployee(List<Employee> employee) {
      this.employee = employee;
   }
}