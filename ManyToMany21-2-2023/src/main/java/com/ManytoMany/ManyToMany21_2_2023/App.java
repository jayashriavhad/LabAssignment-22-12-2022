package com.ManytoMany.ManyToMany21_2_2023;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	//create Configuration object
    	Configuration cfg=new Configuration();
    	 //Configuration the(hibernate.cfg.xml) file
    	cfg.configure("hibernate.cfg.xml");
    	 //build the Session Factory
        SessionFactory factory=cfg.buildSessionFactory();
       
      //create the Employee class object
        Employee e1=new Employee();
       e1.setEmp_id(111);
       e1.setEmp_name("Hrutuja");
        
       Employee e2=new Employee();
       e2.setEmp_id(112);
       e2.setEmp_name("pooja");
        
       Employee e3=new Employee();
       e3.setEmp_id(113);
       e3.setEmp_name("pranjal");
        
     //create the Project class object
        Project p1=new Project();
	    p1.setPro_id(201);
	    p1.setPro_name("Project 1");
        
	    Project p2=new Project();
	    p2.setPro_id(202);
	    p2.setPro_name("Project 2");
        
	    Project p3=new Project();
	    p3.setPro_id(203);
	    p3.setPro_name("Project 3");
        
	  //creating the list of Employee to associated with multiple project
        List<Employee> list1=new ArrayList<Employee>();
        //creating the list of project to associated with multiple Employee
        List<Project> list2=new ArrayList<Project>();
        
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        //setting the project with the Employee
        e1.setProject(list2);
        e2.setProject(list2);
        list2.add(p1);
        list2.add(p2);
        list2.add(p3);
        //setting the Employee with the project
        p1.setEmployee(list1);
        p2.setEmployee(list1);
        
      //open the session by using factory 
        Session session=factory.openSession();
        
        //begin the transaction
        
        Transaction tx=session.beginTransaction();
        //saving the entity object in session
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(p1);
        session.save(p2);
        session.save(p3);
        //commiting the transaction
        tx.commit();
        //closing the session and factory transaction
        session.close();
        factory.close();
        
        
    }
}
