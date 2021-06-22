package com.example.Languages.Model;


	import java.util.Date;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.PrePersist;
	import javax.persistence.PreUpdate;
	import javax.persistence.Table;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;

	import org.springframework.format.annotation.DateTimeFormat;
	@Entity
	@Table(name="Languages")
	public class Language {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@NotNull
	    @Size(min = 2, max = 20)
	    private String title;
	    @NotNull
	    @Size(min = 2, max = 20)
	    private String Creator;
	    @NotNull
	    @Size(min = 0, max = 4000000)
	    private String Virsion;
	    
	    // This will not allow the createdAt column to be updated after creation
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	   
	    
	    //Constructor 
	    public Language() {}
	    public Language(String title,String creator,String virsion) {
			this.title = title;
			this.Creator = creator;
			this.Virsion = virsion;
		}
	    
	    //Setters & Getters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCreator() {
			return Creator;
		}
		public void setCreator(String creator) {
			Creator = creator;
		}
		public String getVirsion() {
			return Virsion;
		}
		public void setVirsion(String virsion) {
			Virsion = virsion;
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

		
	    // other getters and setters removed for brevity
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	}


