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
@Table(name = "ELIG_DTLS")
@Data
public class EligDtls {

	@Id
	@Column(name = "ELIG_ID")
	private Integer eligId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "PLAN_NAME")
	private String planName;

	@Column(name = "PLAN_STATUS")
	private String planStatus;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "BENEFIT_AMT")
	private String benefitAmt;

	@Column(name = "DENAIL_REASON")
	private String denialReason;

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
