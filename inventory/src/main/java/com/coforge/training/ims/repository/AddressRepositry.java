package com.coforge.training.ims.repository;

import com.coforge.training.ims.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepositry extends JpaRepository<Address,Long> {

}
