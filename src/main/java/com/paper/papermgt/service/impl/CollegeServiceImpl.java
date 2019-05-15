package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.CollegeMapper;
import com.paper.papermgt.model.CollegeModel;
import com.paper.papermgt.service.CollegeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 * @ClassName: CollegeServiceImpl
 * @author
 * @date
 * @version
 */
@Service
@Transactional
public class CollegeServiceImpl extends BaseServiceImpl<CollegeModel> implements CollegeService {
	private final static Logger logger= LoggerFactory.getLogger(CollegeServiceImpl.class);
	@Autowired
    private CollegeMapper mapper;
	@Override
	public CollegeMapper getMapper() {
		return mapper;
	}

}
