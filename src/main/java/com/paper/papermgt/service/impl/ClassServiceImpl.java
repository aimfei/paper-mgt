package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.ClassMapper;
import com.paper.papermgt.model.ClassModel;
import com.paper.papermgt.service.ClassService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 * @ClassName: ClassServiceImpl
 * @author
 * @date
 * @version
 */
@Service
@Transactional
public class ClassServiceImpl extends BaseServiceImpl<ClassModel> implements ClassService {
	private final static Logger logger= LoggerFactory.getLogger(ClassServiceImpl.class);

	@Autowired
    private ClassMapper mapper;
	@Override
	public ClassMapper getMapper() {
		return mapper;
	}

}
