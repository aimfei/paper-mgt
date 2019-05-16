package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.MenuMapper;
import com.paper.papermgt.model.MenuModel;
import com.paper.papermgt.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 * @ClassName: MenuServiceImpl
 * @author
 * @date
 * @version
 */
@Service
@Transactional
public class MenuServiceImpl extends BaseServiceImpl<MenuModel> implements MenuService {
	private final static Logger logger= LoggerFactory.getLogger(MenuServiceImpl.class);

	@Autowired
    private MenuMapper mapper;

	@Override
	public MenuMapper getMapper() {
		return mapper;
	}

}
