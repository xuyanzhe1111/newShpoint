package com.example.demo.mapper;

import com.example.demo.entity.ProjectData;
import com.example.demo.entity.ProjectDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectDataMapper {
    int countByExample(ProjectDataExample example);

    int deleteByExample(ProjectDataExample example);

    int deleteByPrimaryKey(Integer projectdataid);

    int insert(ProjectData record);

    int insertSelective(ProjectData record);

    List<ProjectData> selectByExample(ProjectDataExample example);

    ProjectData selectByPrimaryKey(Integer projectdataid);

    int updateByExampleSelective(@Param("record") ProjectData record, @Param("example") ProjectDataExample example);

    int updateByExample(@Param("record") ProjectData record, @Param("example") ProjectDataExample example);

    int updateByPrimaryKeySelective(ProjectData record);

    int updateByPrimaryKey(ProjectData record);
}