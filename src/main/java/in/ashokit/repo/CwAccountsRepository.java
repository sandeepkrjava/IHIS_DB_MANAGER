package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.CwAccounts;

public interface CwAccountsRepository extends JpaRepository<CwAccounts, Integer> {
	
	public String findByEmail(String email);

}
