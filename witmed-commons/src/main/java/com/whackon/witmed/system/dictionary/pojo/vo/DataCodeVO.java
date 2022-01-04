package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;

import java.util.Date;

/**
 * <b>系统功能 - 数据元值域代码视图信息</b>
 *
 * @author HP
 * @date 2022/1/4
 * @since $
 */
public class DataCodeVO extends BaseVO {
	int id;
	String parent;
	String code;
	String name;
	String status;
	String createdBy;
	Date cteatedTime;
	String modifiedBy;
	Date modifiedTime;

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

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCteatedTime() {
		return cteatedTime;
	}

	public void setCteatedTime(Date cteatedTime) {
		this.cteatedTime = cteatedTime;
	}

	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public Date getModifiedTime() {
		return modifiedTime;
	}

	@Override
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
