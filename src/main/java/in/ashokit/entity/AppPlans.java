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
@Table(name = "APP_PLANS")
@Data
public class AppPlans {

	@Id
	@Column(name = "PLAN_ID")
	private Integer planID;

	@Column(name = "PLAN_NAME")
	private String planName;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name ="END_DATE")
	private Date endDate;

	
	@Column(name="CATEGORY_ID")
	private Date categoryID;
	
	@Column(name="ACTIVE_SW")
	private String activeSw;
	
	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private Date createdDate;

	@Column(name = "UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private Date updatedDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;

}
