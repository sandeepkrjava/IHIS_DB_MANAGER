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
@Table(name = "CW_ACCOUNTS")
@Data
public class CwAccounts {

	@Id
	@Column(name = "ACC_ID")
	private Integer accId;

	@Column(name = "FULLNAME")
	private String fullName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PWD")
	private String pwd;

	@Column(name = "MOBILE_NO")
	private Integer mobileNo;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "SSN")
	private Integer ssn;

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
