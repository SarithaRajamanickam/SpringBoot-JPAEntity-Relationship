package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;

@Entity
public class Employee{

   @Id
   @GeneratedValue( strategy= GenerationType.AUTO ) 	
   
   private Integer eid;
   private String ename;
   private double salary;
   private String deg;
   
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "Department_id")
   private Department department;


   public Employee( ) {
      super();
   }

   public Integer getEid( ) {
      return eid;
   }
   
   public void setEid(Integer eid)  {
      this.eid = eid;
   }

   public String getEname( ) {
      return ename; }
   
   public void setEname(String ename) {
      this.ename = ename;
   }

   public double getSalary( ) {
      return salary;
   }
   
   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getDeg( ) {
      return deg;
   }
   
   public void setDeg(String deg) {
      this.deg = deg;
   }

   public Department getDepartment() {
      return department;
   }

   public void setDepartment(Department department) {
      this.department = department;
   }
}