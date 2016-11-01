package com.github.tangr1.feigntest.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by tangrui on 8/18/16.
 */
public class Buy implements Serializable {
    @Valid
    @NotEmpty
    private String equipmentType;
    @Valid
    @NotEmpty
    private String province;
    @Valid
    @NotEmpty
    @Size(min = 1)
    private List<String> equipmentBrands;
    private Integer id;
    private String createTime;
    private String price;
    private String status;
    private String resultStatus;
    private String importStatus;
    private String year;
    private String hour;
    private String kilometer;
    private String power;
    private String boom;
    private String fill;
    private String hammerDiameter;
    private String ton;
    private String pumperChassisType;
    private String dumperWorking;
    private String dumperChassisType;
    private String mixerChassisType;
    private String hammerBreakerMode;
    private String bulldozerType;
    private String diggerWalkWay;
    private String rollerDriveMode;
    private String rollerWalkWay;
    private String craneWalkWay;
    private Integer number;
    private String contactName;
    private String contactPhone;
    private String description;
    private String equipmentNo;
    private Integer resultUser;
    private String resultContent;
    private Date resultTime;
    private Integer createUser;

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public List<String> getEquipmentBrands() {
        return equipmentBrands;
    }

    public void setEquipmentBrands(List<String> equipmentBrands) {
        this.equipmentBrands = equipmentBrands;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getKilometer() {
        return kilometer;
    }

    public void setKilometer(String kilometer) {
        this.kilometer = kilometer;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getBoom() {
        return boom;
    }

    public void setBoom(String boom) {
        this.boom = boom;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public String getHammerDiameter() {
        return hammerDiameter;
    }

    public void setHammerDiameter(String hammerDiameter) {
        this.hammerDiameter = hammerDiameter;
    }

    public String getTon() {
        return ton;
    }

    public void setTon(String ton) {
        this.ton = ton;
    }

    public String getPumperChassisType() {
        return pumperChassisType;
    }

    public void setPumperChassisType(String pumperChassisType) {
        this.pumperChassisType = pumperChassisType;
    }

    public String getDumperWorking() {
        return dumperWorking;
    }

    public void setDumperWorking(String dumperWorking) {
        this.dumperWorking = dumperWorking;
    }

    public String getDumperChassisType() {
        return dumperChassisType;
    }

    public void setDumperChassisType(String dumperChassisType) {
        this.dumperChassisType = dumperChassisType;
    }

    public String getMixerChassisType() {
        return mixerChassisType;
    }

    public void setMixerChassisType(String mixerChassisType) {
        this.mixerChassisType = mixerChassisType;
    }

    public String getHammerBreakerMode() {
        return hammerBreakerMode;
    }

    public void setHammerBreakerMode(String hammerBreakerMode) {
        this.hammerBreakerMode = hammerBreakerMode;
    }

    public String getBulldozerType() {
        return bulldozerType;
    }

    public void setBulldozerType(String bulldozerType) {
        this.bulldozerType = bulldozerType;
    }

    public String getDiggerWalkWay() {
        return diggerWalkWay;
    }

    public void setDiggerWalkWay(String diggerWalkWay) {
        this.diggerWalkWay = diggerWalkWay;
    }

    public String getRollerDriveMode() {
        return rollerDriveMode;
    }

    public void setRollerDriveMode(String rollerDriveMode) {
        this.rollerDriveMode = rollerDriveMode;
    }

    public String getRollerWalkWay() {
        return rollerWalkWay;
    }

    public void setRollerWalkWay(String rollerWalkWay) {
        this.rollerWalkWay = rollerWalkWay;
    }

    public String getCraneWalkWay() {
        return craneWalkWay;
    }

    public void setCraneWalkWay(String craneWalkWay) {
        this.craneWalkWay = craneWalkWay;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEquipmentNo() {
        return equipmentNo;
    }

    public void setEquipmentNo(String equipmentNo) {
        this.equipmentNo = equipmentNo;
    }

    public Integer getResultUser() {
        return resultUser;
    }

    public void setResultUser(Integer resultUser) {
        this.resultUser = resultUser;
    }

    public String getResultContent() {
        return resultContent;
    }

    public void setResultContent(String resultContent) {
        this.resultContent = resultContent;
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }
}
