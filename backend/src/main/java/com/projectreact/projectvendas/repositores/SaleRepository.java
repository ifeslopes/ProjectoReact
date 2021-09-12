package com.projectreact.projectvendas.repositores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectreact.projectvendas.dto.SaleSucessDTO;
import com.projectreact.projectvendas.dto.SaleSumDTO;
import com.projectreact.projectvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
@Query("SELECT new com.projectreact.projectvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
		+ "FROM Sale AS obj GROUP BY obj.seller")
List<SaleSumDTO> amountGroupBySeller(); 

@Query("SELECT new com.projectreact.projectvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
		+ "FROM Sale AS obj GROUP BY obj.seller")
List<SaleSucessDTO> sucessGroupBySeller(); 
	
}

