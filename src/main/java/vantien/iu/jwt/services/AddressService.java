package vantien.iu.jwt.services;

import org.springframework.stereotype.Service;
import vantien.iu.jwt.entities.Address;

@Service
public interface AddressService {
	Iterable<Address> findAll();
    //User search(String q);
    Address findOne(long id);
    void save(Address emp);
    void delete(Address emp);
}
