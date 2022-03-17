package vantien.iu.jwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vantien.iu.jwt.common.ERole;
import vantien.iu.jwt.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	 /**
     * Find role by name
     * @param name
     * @return Role
     */
    Optional<Role> findByName(ERole name);
}
