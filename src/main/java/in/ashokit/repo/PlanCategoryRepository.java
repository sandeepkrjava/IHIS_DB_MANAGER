package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.PlanCategoryMaster;

public interface PlanCategoryRepository extends JpaRepository<PlanCategoryMaster, Integer> {
	
	

}
