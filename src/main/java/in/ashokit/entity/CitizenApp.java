package in.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_APP")
@Data
public class CitizenApp {


	@Id 
	@Column(name="CASE_NUM")
	private Integer caseNum;

	@Column(name = "FULL_NAME")
	private String fullName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE_NO")
	private Integer mobileNo;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "SSN")
	private Integer ssn;

	@Column(name = "STATE_NAME")
	private String stateName;

	@Column(name = "ACTIVE_SW")
	private String activeSw;

	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private Date createdDate;

	@Column(name = "UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private Date updatedDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;
}
