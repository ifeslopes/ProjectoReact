package com.projectreact.projectvendas.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectreact.projectvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
