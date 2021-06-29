package com.example.authontication.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Message {
	@Id
	@GeneratedValue
	private Long id;
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm::ss")
	private Date createdAt;

	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm::ss")
	private Date updatedAt;
	@Size(min = 8 , max =255,message="Comments must be between 8-255 character")
	private String text;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="event_id")
	private Event event;
	
	public Message() {
		
	}

public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

public Message(Long id, Date createdAt, Date updatedAt, String text) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.text = text;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

@PrePersist
public void onCreate() {this.createdAt = new Date();}

@PreUpdate
public void onUpdate() {this.updatedAt = new Date();}


}
