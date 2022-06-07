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
@Table(name = "CITIZEN_CHILD_DTLS")
@Data
public class CitizenChildDtls {

	@Id
	@Column(name = "CHILD_ID")
	private Integer childId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "CHILD_SSN")
	private Integer childSsn;

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
