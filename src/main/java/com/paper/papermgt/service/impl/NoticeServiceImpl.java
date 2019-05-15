package com.paper.papermgt.service.impl;

import com.common.framework.base.BaseServiceImpl;
import com.paper.papermgt.mapper.NoticeMapper;
import com.paper.papermgt.model.NoticeModel;
import com.paper.papermgt.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 * @ClassName: NoticeServiceImpl
 * @author
 * @date
 * @version
 */
@Service
@Transactional
public class NoticeServiceImpl extends BaseServiceImpl<NoticeModel> implements NoticeService {
	private final static Logger logger= LoggerFactory.getLogger(NoticeServiceImpl.class);

	@Autowired
    private NoticeMapper mapper;
	@Override
	public NoticeMapper getMapper() {
		return mapper;
	}

}
