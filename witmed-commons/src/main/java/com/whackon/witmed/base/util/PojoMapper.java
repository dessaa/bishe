package com.whackon.witmed.base.util;

import org.mapstruct.factory.Mappers;
import sun.font.CompositeFont;
import org.mapstruct.Mapper;
/**
 * <b></b>
 *
 * @author HP
 * @date 2022/1/4
 * @since $
 */
@Mapper(componentModel = "spring")
public interface PojoMapper {
	PojoMapper INSTANCE = Mappers.getMapper(PojoMapper.class);



}
