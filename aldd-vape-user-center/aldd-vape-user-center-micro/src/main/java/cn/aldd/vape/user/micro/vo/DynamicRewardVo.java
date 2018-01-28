package cn.aldd.vape.user.micro.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.aldd.vape.common.Page;
import io.swagger.annotations.ApiModelProperty;

public class DynamicRewardVo extends Page {

	private static final long serialVersionUID = 1L;
	
	
	@ApiModelProperty(value = "主键id")
	private String id;
	
	
	@ApiModelProperty(value = "动态id")
	private String dynamicId;
	
	
	@ApiModelProperty(value = "打赏数量")
	private String rewardNum;
	
	
	@ApiModelProperty(value = "创建人")
	private String createUserId;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@ApiModelProperty(value = "创建时间")
	private java.util.Date createTime;
	

// setter and getter
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getDynamicId(){
		return dynamicId;
	}
	
	public void setDynamicId(String dynamicId){
		this.dynamicId = dynamicId;
	}
	public String getRewardNum(){
		return rewardNum;
	}
	
	public void setRewardNum(String rewardNum){
		this.rewardNum = rewardNum;
	}
	public String getCreateUserId(){
		return createUserId;
	}
	
	public void setCreateUserId(String createUserId){
		this.createUserId = createUserId;
	}
	public java.util.Date getCreateTime(){
		return createTime;
	}
	
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	
}