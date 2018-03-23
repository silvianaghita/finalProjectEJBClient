package com.example.finalprojectejb.dao;

import javax.ejb.Remote;

import com.example.finalprojectejb.dto.StockClientB2BDTO;

@Remote
public interface StockClientB2BDAORemote extends GenericDAO<StockClientB2BDTO> {

}
