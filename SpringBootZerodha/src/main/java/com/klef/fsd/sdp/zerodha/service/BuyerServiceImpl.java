package com.klef.fsd.sdp.zerodha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsd.sdp.zerodha.model.Buyer;
import com.klef.fsd.sdp.zerodha.repository.BuyerRepository;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerRepository repository;

    @Override
    public String registration(Buyer b) {
        repository.save(b);
        return "Successfully registered";
    }

    @Override
    public Buyer login(String name, String password) {
        return repository.findByUsernameAndPassword(name, password);
    }
}
