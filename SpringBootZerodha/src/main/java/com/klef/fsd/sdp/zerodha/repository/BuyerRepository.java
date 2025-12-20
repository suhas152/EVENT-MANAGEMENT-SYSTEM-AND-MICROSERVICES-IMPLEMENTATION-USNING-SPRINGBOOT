package com.klef.fsd.sdp.zerodha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.fsd.sdp.zerodha.model.Buyer;


public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
  Buyer findByUsernameAndPassword(String name,String password);

}
