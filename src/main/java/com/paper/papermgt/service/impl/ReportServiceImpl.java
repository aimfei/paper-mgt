package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.ReportMapper;
import com.paper.papermgt.model.ReportModel;
import com.paper.papermgt.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 * @ClassName: ReportServiceImpl
 * @author
 * @date
 * @version
 */
@Service
@Transactional
public class ReportServiceImpl extends BaseServiceImpl<ReportModel> implements ReportService {
	private final static Logger logger= LoggerFactory.getLogger(ReportServiceImpl.class);

	@Autowired
    private ReportMapper mapper;
	@Override
	public ReportMapper getMapper() {
		return mapper;
	}

}
