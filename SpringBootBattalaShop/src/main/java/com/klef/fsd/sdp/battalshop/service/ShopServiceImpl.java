package com.klef.fsd.sdp.battalshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsd.sdp.battalshop.model.Shop;
import com.klef.fsd.sdp.battalshop.repository.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopRepository repository;

	@Override
	public Shop viewshop(int sid) {
		return repository.findById(sid).get();
	}

	@Override
	public String updateShop(Shop s) {
	Optional<Shop> object=repository.findById(s.getId());
	if(object.isPresent()) {
		Shop s1=object.get();
		s1.setPrice(s.getPrice());
		s1.setProductname(s.getProductname());
		s1.setSellername(s.getSellername());
		s1.setShopname(s.getShopname());
		repository.save(s1);
		return "updated successfully";
	}else {
		return "shop ID not found";
	}
	}

	@Override
	public String addShop(Shop s) {
		 repository.save(s);
		 return "added successfully";
	}

	@Override
	public String deleteShop(int sid) {
		repository.deleteById(sid);
		return "deleted successfully";
	}

}
