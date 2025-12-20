package com.klef.fsd.sdp.zerodha.service;

import com.klef.fsd.sdp.zerodha.model.Buyer;

public interface BuyerService {
    String registration(Buyer b);
    Buyer login(String username, String password);
}
