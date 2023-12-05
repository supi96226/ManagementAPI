package com.developer_api_master.developer_management.controller;

import java.util.Optional;
import com.developer_api_master.developer_management.model.ManagementModel;
import com.developer_api_master.developer_management.service_implementation.ManagementImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin("*")
public class ManagementController {

    @Autowired
    private ManagementImplementation managementImplementation;

    @PostMapping(value = "registerDeveloper")
    public ManagementModel saveCatalog(@RequestBody ManagementModel managementModel){
        System.out.println("Developer registered successfully");
        managementImplementation.registerDeveloper((managementModel));
        return managementModel;
    }

    @GetMapping(value = "getRegisterData")
    public List<ManagementModel> getRegisterData(){
        return  managementImplementation.getRegisteredData();
    }

    @GetMapping(value = "getRegisterDataById/{id}")
    public ManagementModel getRegisterDataById(@PathVariable ("id") Long id){
        Optional<ManagementModel> dataRow = managementImplementation.getRegisteredDataById(id);
        if(dataRow.isPresent()){
            return dataRow.get();
        }
        return null;
    }

    @PutMapping("updateData")
    public ManagementModel updateData(@RequestBody ManagementModel managementModel){
        return managementImplementation.updateData(managementModel);
    }

    @DeleteMapping("decommissionDeveloper")
    public String decommissionDeveloper(@RequestParam long id){
        managementImplementation.decommissionDeveloper(id);
        return "Developer deleted!";
    }

}

