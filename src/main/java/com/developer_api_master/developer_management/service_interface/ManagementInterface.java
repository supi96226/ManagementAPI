package com.developer_api_master.developer_management.service_interface;


import java.util.Optional;
import com.developer_api_master.developer_management.model.ManagementModel;
import java.util.List;

public interface ManagementInterface {

    public ManagementModel registerDeveloper(ManagementModel managementModel);

    public ManagementModel updateData(ManagementModel managementModel);

    public List<ManagementModel> getRegisteredData();

    public Optional<ManagementModel> getRegisteredDataById(long id);

    public void decommissionDeveloper(long id);
}