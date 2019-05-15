package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.TopicMapper;
import com.paper.papermgt.model.TopicModel;
import com.paper.papermgt.service.TopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 * @ClassName: TopicServiceImpl
 * @author
 * @date
 * @version
 */
@Service
@Transactional
public class TopicServiceImpl extends BaseServiceImpl<TopicModel> implements TopicService {
	private final static Logger logger= LoggerFactory.getLogger(TopicServiceImpl.class);

	@Autowired
    private TopicMapper mapper;

	@Override
	public TopicMapper getMapper() {
		return mapper;
	}

}
