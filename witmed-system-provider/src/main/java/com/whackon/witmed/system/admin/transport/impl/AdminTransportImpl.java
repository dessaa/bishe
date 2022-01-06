package com.whackon.witmed.system.admin.transport.impl;

import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.service.AdminService;
import com.whackon.witmed.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b></b>
 *
 * @author HP
 * @date 2022/1/6
 * @since $
 */
public class AdminTransportImpl implements AdminTransport {
	@Autowired
	private AdminService adminService;

	/**
	 * <b>根据手机号码查询用户信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/cellphone")
	@Override
	public AdminVO getAdminVOByCellphone(@RequestParam String cellphone) throws Exception {
		return adminService.getAdminVOByCellphone(cellphone);
	}
}
