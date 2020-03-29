package models;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;


@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "userName")
	private String userName;
	@Column
	private String email;
	@Column
	private String password;
	@Transient
	private String confirmedPassword;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "user_couse" , joinColumns = {@JoinColumn(name="userName")},inverseJoinColumns={@JoinColumn(name="num")})
	ArrayList courses = new ArrayList();
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmedPassword() {
		return confirmedPassword;
	}
	public void setConfirmedPassword(String confirmedPassword) {
		this.confirmedPassword = confirmedPassword;
	}
	public ArrayList getCourses() {
		return courses;
	}
	public void setCourses(ArrayList courses) {
		this.courses = courses;
	}
	 
}
