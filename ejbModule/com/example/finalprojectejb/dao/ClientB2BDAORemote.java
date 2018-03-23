package com.example.finalprojectejb.dao;

import javax.ejb.Remote;

import com.example.finalprojectejb.dto.ClientB2BDTO;

@Remote
public interface ClientB2BDAORemote extends GenericDAO<ClientB2BDTO> {

}
