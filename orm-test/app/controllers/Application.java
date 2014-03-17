package controllers;

import java.util.ArrayList;
import java.util.List;

import com.avaje.ebean.Ebean;

import models.Student;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	public static Result createSomeStudents(){
		Student student = new Student(2, "Salvador", "Doe", "star");
		
		Ebean.save(student);
		
		return ok("Students created");
	}

    public static Result index() {
    	/////// new ...
    	
    	
    	List<Student> students = Ebean.find(Student.class).findList();
    	
        return ok(index.render(students));
    }
    
    public static Result showStudent(int id){
    	Student student = Ebean.find(Student.class, id);
    	
		return ok(showStudent.render(student));
    }

}
