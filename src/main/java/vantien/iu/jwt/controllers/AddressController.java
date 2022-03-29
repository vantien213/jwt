package vantien.iu.jwt.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vantien.iu.jwt.entities.Address;
import vantien.iu.jwt.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	private static Logger logger = Logger.getLogger(AddressController.class);

    @Autowired
    private AddressService addressService;

    private List<Address> address = new ArrayList<Address>();


    @GetMapping()
    public List<Address> getAll() {
        logger.info("===Information address===");
        return (List<Address>) addressService.findAll();
    }
    @PostMapping()
    public String create(@RequestBody Address address) {
        try {
            addressService.save(address);
            return "Add successful";
        } catch (Exception e) {
            return "Error";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id) {

        Address address = addressService.findOne(id);

        addressService.delete(address);
        return "delete successful";

    }
    @PutMapping("/{id}")
    public String updateAddress(@PathVariable(value = "id") Long id,@Valid @RequestBody Address addressDetails) {
        try {
            Address address = addressService.findOne(id);
            address.setName(addressDetails.getName());


            addressService.save(address);
            return "Update successfuly";
        }catch (Exception e) {
            return "Error";
        }
    }
}
