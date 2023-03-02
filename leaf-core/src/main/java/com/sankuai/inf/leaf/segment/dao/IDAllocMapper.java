package com.sankuai.inf.leaf.segment.dao;

import com.sankuai.inf.leaf.segment.model.LeafAlloc;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IDAllocMapper {

    @Select("select biz_tag,max_id,step,update_time,type,start_param,end_param,length from leaf_alloc;")
    @Results(value = {
            @Result(column = "biz_tag", property = "key"),
            @Result(column = "max_id", property = "maxId"),
            @Result(column = "step", property = "step"),
            @Result(column = "update_time", property = "updateTime"),
            @Result(column = "type", property = "type"),
            @Result(column = "start_param", property = "startParam"),
            @Result(column = "end_param", property = "endParam"),
            @Result(column = "length", property = "length")
    })
    List<LeafAlloc> getAllLeafAllocs();

    @Select("SELECT biz_tag, max_id, step,type,start_param,end_param,length FROM leaf_alloc WHERE biz_tag = #{tag}")
    @Results(value = {
            @Result(column = "biz_tag", property = "key"),
            @Result(column = "max_id", property = "maxId"),
            @Result(column = "step", property = "step"),
            @Result(column = "type", property = "updateTime"),
            @Result(column = "start_param", property = "startParam"),
            @Result(column = "end_param", property = "endParam"),
            @Result(column = "length", property = "length")
    })
    LeafAlloc getLeafAlloc(@Param("tag") String tag);

    @Update("UPDATE leaf_alloc SET max_id = max_id + step WHERE biz_tag = #{tag}")
    void updateMaxId(@Param("tag") String tag);

    @Update("UPDATE leaf_alloc SET max_id = max_id + #{step} WHERE biz_tag = #{key}")
    void updateMaxIdByCustomStep(@Param("leafAlloc") LeafAlloc leafAlloc);

    @Select("SELECT biz_tag FROM leaf_alloc")
    List<String> getAllTags();
}
