package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.DeptMapper;
import com.paper.papermgt.model.DeptModel;
import com.paper.papermgt.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 * @ClassName: DeptServiceImpl
 * @author
 * @date
 * @version
 */
@Service
@Transactional
public class DeptServiceImpl extends BaseServiceImpl<DeptModel> implements DeptService {
	private final static Logger logger= LoggerFactory.getLogger(DeptServiceImpl.class);

	@Autowired
    private DeptMapper mapper;
	@Override
	public DeptMapper getMapper() {
		return mapper;
	}

}
