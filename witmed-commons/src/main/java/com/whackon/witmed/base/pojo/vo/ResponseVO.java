package com.whackon.witmed.base.pojo.vo;

import com.whackon.witmed.base.pojo.enums.ResponseCode;

import java.io.Serializable;

/**
 * <b></b>
 *
 * @author HP
 * @date 2021/12/29
 * @since $
 */
public class ResponseVO implements Serializable {
	private String code;                        // 系统响应编码
	private String message;                     // 系统响应信息
	private Object data;                        // 系统响应数据

	public ResponseVO(ResponseCode responseCode, String message, Object data) {
		this.code = responseCode.getCode();
		this.message = message;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
