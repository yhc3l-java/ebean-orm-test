package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	public Integer id;
	public String name;
	public String surname;
	public String icon;
	
	public Student(Integer id, String name, String surname, String icon){
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.icon = icon;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
}