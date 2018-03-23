package com.example.finalprojectejb.dao;

import javax.ejb.Remote;

import com.example.finalprojectejb.dto.ClientOrderDTO;

@Remote
public interface ClientOrderDAORemote extends GenericDAO<ClientOrderDTO>{

}
