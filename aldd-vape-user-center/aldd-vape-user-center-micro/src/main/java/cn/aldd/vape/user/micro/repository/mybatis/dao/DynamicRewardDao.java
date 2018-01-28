package cn.aldd.vape.user.micro.repository.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.aldd.vape.user.micro.vo.DynamicRewardVo;

@Mapper
public interface DynamicRewardDao {

	DynamicRewardVo findDynamicRewardById(@Param("id") String id);

	List<DynamicRewardVo> findDynamicRewardList(@Param("entity") DynamicRewardVo dynamicRewardVo);

}
