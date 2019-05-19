package com.paper.papermgt.service;


import com.common.framework.base.BaseService;
import com.paper.papermgt.model.TopicModel;

import java.util.List;

/**
 * 描述
 * @ClassName: TopicService
 * @author
 * @date
 * @version  v 1.0
 */
public interface TopicService extends BaseService<TopicModel> {

     List<TopicModel> getList(List<String> teaids);
}
