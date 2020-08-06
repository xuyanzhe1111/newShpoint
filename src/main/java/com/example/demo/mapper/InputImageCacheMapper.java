package com.example.demo.mapper;


import com.example.demo.entity.InputCacheExample;
import com.example.demo.entity.InputImageCache;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InputImageCacheMapper {
    int countByExample(InputCacheExample example);

    int deleteByExample(InputCacheExample example);

    int deleteByPrimaryKey(Integer inputcacheid);

    int insert(InputImageCache record);

    int insertSelective(InputImageCache record);

    List<InputImageCache> selectByExample(InputCacheExample example);

    InputImageCache selectByPrimaryKey(Integer inputcacheid);

    int updateByExampleSelective(@Param("record") InputImageCache record, @Param("example") InputCacheExample example);

    int updateByExample(@Param("record") InputImageCache record, @Param("example") InputCacheExample example);

    int updateByPrimaryKeySelective(InputImageCache record);

    int updateByPrimaryKey(InputImageCache record);

    List<String> selectAllBatchId();
}