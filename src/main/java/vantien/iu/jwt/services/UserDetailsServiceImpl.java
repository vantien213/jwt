package vantien.iu.jwt.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import vantien.iu.jwt.entities.User;
import vantien.iu.jwt.repositories.UserRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() ->new UsernameNotFoundException("User Not Found with username:"+ username));
        return UserDetailsImpl.build(user);
    }
}
