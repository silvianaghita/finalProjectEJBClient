package com.example.finalprojectejb.dao;

import javax.ejb.Remote;

import com.example.finalprojectejb.dto.StockSupplierDTO;

@Remote
public interface StockSupplierDAORemote extends GenericDAO<StockSupplierDTO>{

}
