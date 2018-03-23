package com.example.finalprojectejb.dao;

import javax.ejb.Remote;

import com.example.finalprojectejb.dto.WineDTO;

@Remote
public interface WineDAORemote extends GenericDAO<WineDTO>{

}
