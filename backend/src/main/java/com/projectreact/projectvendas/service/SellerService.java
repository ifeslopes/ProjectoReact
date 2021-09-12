package com.projectreact.projectvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectreact.projectvendas.dto.SellerDTO;
import com.projectreact.projectvendas.entities.Seller;
import com.projectreact.projectvendas.repositores.SellerRepository;

@Service
public class SellerService {
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO>findAll(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}


}
