package com.paper.papermgt.mapper;

import com.common.framework.base.BaseMapper;
import com.paper.papermgt.model.TopicModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Topic Mapper
 * @author Administrator
 *
 */
public interface TopicMapper extends BaseMapper {


    List<TopicModel> getList(@Param("teaids") List<String> teaids);
}
