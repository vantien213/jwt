package vantien.iu.jwt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vantien.iu.jwt.entities.Address;
import vantien.iu.jwt.repositories.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
    private AddressRepository addressRepository;
    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }
//    @Override
//    public User search(String q) {
//        return userRepository.findByUsername(q);
//    }
    @Override
    public Address findOne(long id) {
        return addressRepository.getById(id);
    }
    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void delete(Address address) {
        addressRepository.delete(address);
    }
}
