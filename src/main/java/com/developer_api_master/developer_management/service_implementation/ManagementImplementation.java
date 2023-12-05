package com.developer_api_master.developer_management.service_implementation;


import java.util.Optional;
import com.developer_api_master.developer_management.model.ManagementModel;
import com.developer_api_master.developer_management.repository.ManagementRepository;
import com.developer_api_master.developer_management.service_interface.ManagementInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementImplementation implements ManagementInterface {

    @Autowired
    private ManagementRepository managementRepository;
    @Override
    public ManagementModel registerDeveloper(ManagementModel managementModel) {
        return managementRepository.save(managementModel);
    }

    @Override
    public ManagementModel updateData(ManagementModel managementModel) {
        ManagementModel existingManagementModel = managementRepository.findById(managementModel.getDeveloperId()).orElse(null);
        existingManagementModel.setStatus(managementModel.getStatus());
        existingManagementModel.setRegisteredDate(managementModel.getRegisteredDate());
        return managementRepository.save(existingManagementModel);

    }

    @Override
    public List<ManagementModel> getRegisteredData() {
        return (List<ManagementModel>) managementRepository.findAll();
    }

    @Override
    public Optional<ManagementModel> getRegisteredDataById(long id) {
        return (Optional<ManagementModel>) managementRepository.findById(id);
    }

    @Override
    public void decommissionDeveloper(long id) {
        managementRepository.deleteById(id);

    }
}
