package com.developer_api_master.developer_management.repository;


import com.developer_api_master.developer_management.model.ManagementModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementRepository extends CrudRepository<ManagementModel,Long> {
}