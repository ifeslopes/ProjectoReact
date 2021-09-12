package com.projectreact.projectvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectreact.projectvendas.dto.SaleDTO;
import com.projectreact.projectvendas.dto.SaleSucessDTO;
import com.projectreact.projectvendas.dto.SaleSumDTO;
import com.projectreact.projectvendas.entities.Sale;
import com.projectreact.projectvendas.repositores.SaleRepository;
import com.projectreact.projectvendas.repositores.SellerRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO>findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller(){
		return repository.amountGroupBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSucessDTO> sucessGroupBySeller(){
		return repository.sucessGroupBySeller();
	}

}
