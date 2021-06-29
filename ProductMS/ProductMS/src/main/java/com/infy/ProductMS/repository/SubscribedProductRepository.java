package com.infy.ProductMS.repository;


import org.springframework.data.repository.CrudRepository;

import com.infy.ProductMS.entity.SubscribedProduct;
import com.infy.ProductMS.utility.CustomPK;

public interface SubscribedProductRepository extends CrudRepository<SubscribedProduct, CustomPK> {
	
	

}

