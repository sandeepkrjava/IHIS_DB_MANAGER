package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.CitizenIncomeDtls;

public interface CitizenIncomeRepository extends JpaRepository<CitizenIncomeDtls, Integer> {

}
