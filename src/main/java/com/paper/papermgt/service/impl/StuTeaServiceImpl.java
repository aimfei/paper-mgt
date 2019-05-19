package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.StuTeaMapper;
import com.paper.papermgt.model.StuTeaModel;
import com.paper.papermgt.service.StuTeaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**  
 * 描述   
 * @ClassName: StuTeaServiceImpl   
 * @author 
 * @date
 * @version  
 */
@Service
@Transactional
public class StuTeaServiceImpl extends BaseServiceImpl<StuTeaModel> implements StuTeaService {
	private final static Logger logger= LoggerFactory.getLogger(StuTeaServiceImpl.class);
	
	@Autowired
    private StuTeaMapper mapper;

	@Override
	public StuTeaMapper getMapper() {
		return mapper;
	}



}
