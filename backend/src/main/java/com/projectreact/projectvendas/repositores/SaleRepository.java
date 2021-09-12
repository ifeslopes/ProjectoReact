package com.projectreact.projectvendas.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectreact.projectvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
