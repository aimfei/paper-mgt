package com.paper.papermgt.service.impl;

import org.slf4j.LoggerFactory;

/**  
 * 描述   
 * @ClassName: MessageServiceImpl   
 * @author 
 * @date
 * @version  
 */
@Service
@Transactional
public class MessageServiceImpl extends BaseServiceImpl<MessageModel> implements MessageService {
	private final static Logger logger= LoggerFactory.getLogger(MessageServiceImpl.class);
	
	@Autowired
    private MessageMapper mapper;
		
	public MessageMapper getMapper() {
		return mapper;
	}

}
