package models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num")
	private int num;
	@Column
	private String name;
	@Column
	private short duration;
	@ManyToMany(mappedBy="courses")
	private ArrayList users = new ArrayList();
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getDuration() {
		return duration;
	}
	public void setDuration(short duration) {
		this.duration = duration;
	}
	public ArrayList getUsers() {
		return users;
	}
	public void setUsers(ArrayList users) {
		this.users = users;
	}
	
}
