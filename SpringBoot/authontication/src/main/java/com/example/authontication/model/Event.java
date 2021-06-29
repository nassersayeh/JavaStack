package com.example.authontication.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Event {
@Id
@GeneratedValue
private Long id;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

@Size(min=1,max=255,message="Name muste be between 1-255 character")
private String name;
@DateTimeFormat(pattern="yyy-mm-dd")
private Date date;
@Size(min=1,max=255,message="City muste be between 1-255 character")
private String city;
public List<Message> getMessages() {
	return messages;
}

public void setMessages(List<Message> messages) {
	this.messages = messages;
}

@Size(min=1,max=255,message="State muste be between 1-255 character")
private String state;

@ManyToMany(fetch=FetchType.LAZY)
@JoinTable(
		name="users_events",
		joinColumns=@JoinColumn(name="event_id"),
		inverseJoinColumns=@JoinColumn(name="user_id")
)
private List <User> users;


@OneToMany(mappedBy="event",fetch=FetchType.LAZY)
private List<Message> messages;

public List<User> getUsers() {
	return users;
}

public void setUsers(List<User> users) {
	this.users = users;
}

public Event(Date createdAt, Date updatedAt , Date date , String city, String state , String name) {
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
	this.date=date;
	this.city = city;
	this.state = state;
	this.name=name;
}
public Event() {
	
}
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Date getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

public Date getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}

@DateTimeFormat(pattern="MM:dd:yyyy HH:mm::ss")
private Date createdAt;

@DateTimeFormat(pattern="MM:dd:yyyy HH:mm::ss")
private Date updatedAt;

@PrePersist
public void onCreate() {this.createdAt = new Date();}

@PreUpdate
public void onUpdate() {this.updatedAt = new Date();}




}
