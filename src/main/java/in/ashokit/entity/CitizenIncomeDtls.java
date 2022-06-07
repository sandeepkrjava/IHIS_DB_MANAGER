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
@Table(name = "CITIZEN_INCOME_DTLS")
@Data
public class CitizenIncomeDtls {

	@Id
	@Column(name = "INCOME_ID")
	private Integer incomeId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	@Column(name = "SALARY_INCOME")
	private Double salaryIncome;

	@Column(name = "RENT_INCOME")
	private Double rentIncome;

	@Column(name = "PROPERT_INCOME")
	private Double propertyIncome;

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
