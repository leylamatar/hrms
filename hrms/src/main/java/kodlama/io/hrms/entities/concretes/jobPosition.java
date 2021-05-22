package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table(name="jobPosition")
public class jobPosition {
	@Id
    @GeneratedValue
	@Column(name="jobPosition_id")
   private int id;
	
	@Column(name="job_title")
   private String jobTitle;
   
   public jobPosition() {
	   
   }
 
   public jobPosition(int id, String jobTitle) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
}
   
   public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getJobTitle() {
	return jobTitle;
}

public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}





}
