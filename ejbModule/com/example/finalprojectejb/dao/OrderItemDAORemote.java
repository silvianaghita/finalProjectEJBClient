package com.example.finalprojectejb.dao;

import javax.ejb.Remote;

import com.example.finalprojectejb.dto.OrderItemDTO;

@Remote
public interface OrderItemDAORemote extends GenericDAO<OrderItemDTO>{

}
