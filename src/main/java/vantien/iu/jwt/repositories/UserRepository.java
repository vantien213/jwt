package vantien.iu.jwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vantien.iu.jwt.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	/**
     * Find user by user name
     * @param username
     * @return User
     */
    Optional<User> findByUsername(String username);
    /**
     * Check exists an user bu user name
     * @param username
     * @return Boolean
     */
    Boolean existsByUsername(String username);
    /**
     * Check exists an user email
     * @param email
     * @return Boolean
     */
    Boolean existsByEmail(String email);
}
