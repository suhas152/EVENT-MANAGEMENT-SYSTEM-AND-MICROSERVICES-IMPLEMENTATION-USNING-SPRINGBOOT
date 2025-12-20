package com.klef.fsd.sdp.battalshop.service;

import com.klef.fsd.sdp.battalshop.model.Shop;

public interface ShopService {
public Shop viewshop(int sid);
public String updateShop(Shop s);
public String addShop(Shop s);
public String deleteShop(int sid);

}
