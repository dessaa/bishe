package com.whackon.witmed.util;

import com.whackon.witmed.system.admin.pojo.entity.Admin;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * <b></b>
 *
 * @author HP
 * @date 2022/1/6
 * @since $
 */
@Mapper(componentModel = "spring")
public interface PojoMapper {
	PojoMapper INSTANCE = Mappers.getMapper(PojoMapper.class);

	/**
	 * <b>将实体对象转换为视图对象</b>
	 *
	 * @param entity
	 * @return
	 */
	AdminVO parseToVO(Admin entity);
}
