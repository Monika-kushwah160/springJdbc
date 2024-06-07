package com.springJDBC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.dao.StudentDao;
import com.springJDBC.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program start" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springJDBC/Config.xml");

        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = new Student();
        student.setId(12);
        student.setName("monika");
        student.setCity("bhopal");
        
        int result=studentDao.insert(student);
        System.out.println("data inserted...");
        System.out.println(result);
    }
}
