package com.whackon.witmed.system.hospital.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 医院实体信息</b>
 *
 * @author HP
 * @date 2022/1/4
 * @since $
 */
@Data
public class Hospital extends BaseEntity {
	int id;
	String name;
	String authority;
	String orgCode;
	String charge;
	String addressCatCode;
	String provence;
	String city;
	String county;
	String town;
	String village;
	String doorNo;
	String zipCode;
	String divisionCode;
	String telephoneCat;
	String telephone;
	String email;
	String status;
	String createdBy;
	Date createdTime;
	String modifiedBy;
	Date modifiedTime;

	public Hospital(int id, String name, String authority, String orgCode, String charge, String addressCatCode, String provence, String city, String county, String town, String village, String doorNo, String zipCode, String divisionCode, String telephoneCat, String telephone, String email, String status, String createdBy, Date createdTime, String modifiedBy, Date modifiedTime) {
		this.id = id;
		this.name = name;
		this.authority = authority;
		this.orgCode = orgCode;
		this.charge = charge;
		this.addressCatCode = addressCatCode;
		this.provence = provence;
		this.city = city;
		this.county = county;
		this.town = town;
		this.village = village;
		this.doorNo = doorNo;
		this.zipCode = zipCode;
		this.divisionCode = divisionCode;
		this.telephoneCat = telephoneCat;
		this.telephone = telephone;
		this.email = email;
		this.status = status;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getAddressCatCode() {
		return addressCatCode;
	}

	public void setAddressCatCode(String addressCatCode) {
		this.addressCatCode = addressCatCode;
	}

	public String getProvence() {
		return provence;
	}

	public void setProvence(String provence) {
		this.provence = provence;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getTelephoneCat() {
		return telephoneCat;
	}

	public void setTelephoneCat(String telephoneCat) {
		this.telephoneCat = telephoneCat;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
