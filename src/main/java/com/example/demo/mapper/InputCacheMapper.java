package com.example.demo.mapper;

import com.example.demo.entity.InputCache;
import com.example.demo.entity.InputCacheExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InputCacheMapper {
    int countByExample(InputCacheExample example);

    int deleteByExample(InputCacheExample example);

    int deleteByPrimaryKey(Integer inputcacheid);

    int insert(InputCache record);

    int insertSelective(InputCache record);

    List<InputCache> selectByExample(InputCacheExample example);

    InputCache selectByPrimaryKey(Integer inputcacheid);

    int updateByExampleSelective(@Param("record") InputCache record, @Param("example") InputCacheExample example);

    int updateByExample(@Param("record") InputCache record, @Param("example") InputCacheExample example);

    int updateByPrimaryKeySelective(InputCache record);

    int updateByPrimaryKey(InputCache record);

    List<String> selectAllBatchId();
}