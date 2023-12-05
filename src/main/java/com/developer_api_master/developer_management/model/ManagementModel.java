package com.developer_api_master.developer_management.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "developer_management_table",catalog = "management_db")
public class ManagementModel {

    @Id
    private long developerId;
    private String status;
    private Date registeredDate = new Date();
    public ManagementModel(){
        super();
    }

    public ManagementModel(long developerId,
                           String status, Date registeredDate) {
        this.developerId = developerId;
        this.status = status;
        this.registeredDate = registeredDate;
    }


    public long getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(long developerId) {
        this.developerId = developerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
}
