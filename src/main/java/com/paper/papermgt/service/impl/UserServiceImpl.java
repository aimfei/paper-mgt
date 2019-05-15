package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.UserMapper;
import com.paper.papermgt.model.UserModel;
import com.paper.papermgt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 * @ClassName: UserServiceImpl
 * @author
 * @date
 * @version
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserModel> implements UserService {
	private final static Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
    private UserMapper mapper;
	@Override
	public UserMapper getMapper() {
		return mapper;
	}

}
