package com.OnetoMany.OneToManymapping;

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
        cfg.configure("hibernate.cfg.xml");
      //Configuration the(hibernate.cfg.xml) file
      //build the Session Factory
        SessionFactory factory =cfg.buildSessionFactory();
        
      //create the Department class object
        Department d=new Department();
        d.setDept_id(111);
        d.setDept_name("Assistant manager");
        
        //create the Employee class object
        Employee e=new Employee();
        e.setEmp_id(201);
        e.setEmp_name("Jayashri");
        e.setDepartment(d);//setting the Employee for Employee object
        
      //create the Employee class object
        Employee e1=new Employee();
        e1.setEmp_id(202);
        e1.setEmp_name("pranjal");
        e1.setDepartment(d);//setting the Employee for Employee object

      //create the Employee class object
        Employee e2=new Employee();
        e2.setEmp_id(203);
        e2.setEmp_name("Pritika");
        e2.setDepartment(d);//setting the Employee for Employee object

      //create the Employee class object
        Employee e3=new Employee();
        e3.setEmp_id(204);
        e3.setEmp_name("pooja");
        e3.setDepartment(d);//setting the Employee for Employee object
        
      //creating the list of Employee to associated with 1 department
        List<Employee> list=new ArrayList<Employee>();
        list.add(e);
        list.add(e1);
        list.add(e2);
        list.add(e3);
      //setting the Employee with the Department
        d.setEmployee(list);
        
      //open the session by using factory 
        Session session=factory.openSession();
        
        //begin the transaction
        Transaction tx=session.beginTransaction();
      //saving the entity object in session
        session.save(d);
        session.save(e);
        session.save(e1);
        session.save(e2);
        session.save(e3);
        //commiting the transaction
        tx.commit();
      //closing the session and factory transaction
        session.close();
        factory.close();

    }
}
