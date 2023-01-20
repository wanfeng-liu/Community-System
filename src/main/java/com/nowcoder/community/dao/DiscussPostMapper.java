package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //起始行的行号，最多多少数据
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param 用于给参数取别名
    // 如果这个方法只有一个参数，并且在<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
