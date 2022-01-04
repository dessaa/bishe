package com.whackon.witmed.system.dictionary.pojo.entity;

import cn.hutool.db.DaoTemplate;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 数据元值域代码实体信息</b>
 *
 * @author HP
 * @date 2022/1/4
 * @since $
 */
@Data
public class DataCode extends BaseEntity {
	int id;
	String parent;
	String code;
	String name;
	String status;
	String createdBy;
	Date cteatedTime;
	String modifiedBy;
	Date modifiedTime;

	public DataCode(int id, String parent, String code, String name, String status, String createdBy, Date cteatedTime, String modifiedBy, Date modifiedTime) {
		this.id = id;
		this.parent = parent;
		this.code = code;
		this.name = name;
		this.status = status;
		this.createdBy = createdBy;
		this.cteatedTime = cteatedTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getCteatedTime() {
		return cteatedTime;
	}

	public void setCteatedTime(Date cteatedTime) {
		this.cteatedTime = cteatedTime;
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
