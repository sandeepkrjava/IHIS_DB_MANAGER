package in.ashokit.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CO_TRIGGERS")
@Data
public class CoTriggers {

	@Id
	@Column(name = "TRG_ID")
	private Integer trgId;

	@Column(name = "CASE_NUM")
	private Integer caseNum;

	
	@Column(name = "TRG_STATUS")
	private String trgStatus;

	
	@Column(name="NOTICE")
	private Blob notice;

}
