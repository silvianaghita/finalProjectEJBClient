package com.example.finalprojectejb.dao;

import javax.ejb.Remote;

import com.example.finalprojectejb.dto.SupplierDTO;

@Remote
public interface SupplierDAORemote extends GenericDAO<SupplierDTO>{

}
