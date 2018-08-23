package com.jpql.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQuery(query = "Select e from Employee11 e where e.eid = :id", name = "find employee by id")

public class Employee11 {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO) 	
   
   private int eid;
   private String ename;
   private double salary;
   private String deg;
   
   public Employee11(int eid, String ename, double salary, String deg) {
      super( );
      this.eid = eid;
      this.ename = ename;
      this.salary = salary;
      this.deg = deg;
   }
   
   public Employee11( ) {
      super();
   }

   public int getEid( ) {
      return eid;
   }
   
   public void setEid(int eid) {
      this.eid = eid;
   }

   public String getEname( ) {
      return ename;
   }
   
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
   
   @Override
   public String toString() {
      return "Employee11 [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
   }
}