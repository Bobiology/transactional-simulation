package com.techhub.springtransactions.service;

import com.techhub.springtransactions.entities.Address;
import com.techhub.springtransactions.entities.User;
import com.techhub.springtransactions.repo.AddressRepository;
import com.techhub.springtransactions.repo.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final AddressRepository addressRepository;

    public UserService(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    @Transactional
    public User addUer(User user){
        User dbUser = userRepository.save(user);

        Address address = user.getAddress();
        addressRepository.save(address);

        return dbUser;
    }
}
