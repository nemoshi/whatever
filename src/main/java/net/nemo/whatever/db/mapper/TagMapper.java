package net.nemo.whatever.db.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by tonyshi on 2016/12/13.
 */
public interface TagMapper {
    List<String> findLinkTags(@Param("user_id") Integer userId);
}
