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
@Table(name = "CITIZEN_GRADUATION_DTLS")
@Data
public class CitizenGraduationDtls {

	@Id
	@Column(name = "GRADUATION_DTLS")
	private Integer graduationId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "HIGH_DEGREE")
	private String highDegree;

	@Column(name = "GRAD_YEAR_ID")
	private Integer gradYearId;

	@Column(name = "UNIVERSITY")
	private String university;

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
