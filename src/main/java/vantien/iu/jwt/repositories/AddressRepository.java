package vantien.iu.jwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vantien.iu.jwt.entities.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	/**
     * Find user by user name
     * @return User
     */
    Optional<Address> findByname(String name);
    /**
     * Check exists an user bu user name
     * @param username
     * @return Boolean
     */
}
