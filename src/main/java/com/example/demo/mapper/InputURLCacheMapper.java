package com.example.demo.mapper;

import com.example.demo.entity.InputCacheExample;
import com.example.demo.entity.InputURLCache;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InputURLCacheMapper {
    int countByExample(InputCacheExample example);

    int deleteByExample(InputCacheExample example);

    int deleteByPrimaryKey(Integer inputcacheid);

    int insert(InputURLCache record);

    int insertSelective(InputURLCache record);

    List<InputURLCache> selectByExample(InputCacheExample example);

    InputURLCache selectByPrimaryKey(Integer inputcacheid);

    int updateByExampleSelective(@Param("record") InputURLCache record, @Param("example") InputCacheExample example);

    int updateByExample(@Param("record") InputURLCache record, @Param("example") InputCacheExample example);

    int updateByPrimaryKeySelective(InputURLCache record);

    int updateByPrimaryKey(InputURLCache record);

    List<String> selectAllBatchId();
}