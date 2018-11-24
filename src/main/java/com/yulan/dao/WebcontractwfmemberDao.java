package com.yulan.dao;

import com.yulan.pojo.Webcontractwfmember;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebcontractwfmemberDao {
    //按年获取所有权限-人员
    List<Webcontractwfmember> getAllwebcontractwfmemberbyyear(@Param("year") String year, @Param("start")Integer start, @Param("number") Integer number);
    //统计
    int count(@Param("year") String year);
}
