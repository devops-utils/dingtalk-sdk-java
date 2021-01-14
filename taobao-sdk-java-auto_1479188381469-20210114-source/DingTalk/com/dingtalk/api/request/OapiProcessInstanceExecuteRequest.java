package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiProcessinstanceExecuteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.execute request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.09
 */
public class OapiProcessinstanceExecuteRequest extends BaseTaobaoRequest<OapiProcessinstanceExecuteResponse> {
	
	

	/** 
	* 操作人id，通过dingtalk.smartwork.bpms.processinstance.get这个接口可以获取
	 */
	private String actionerUserid;

	/** 
	* 审批实例id
	 */
	private String processInstanceId;

	/** 
	* 操作评论，可为空
	 */
	private String remark;

	/** 
	* 审批操作，同意-agree，拒绝-refuse
	 */
	private String result;

	/** 
	* 任务节点id，dingtalk.smartwork.bpms.processinstance.get接口可获取
	 */
	private Long taskId;

	public void setActionerUserid(String actionerUserid) {
		this.actionerUserid = actionerUserid;
	}

	public String getActionerUserid() {
		return this.actionerUserid;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return this.result;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.processinstance.execute";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("actioner_userid", this.actionerUserid);
		txtParams.put("process_instance_id", this.processInstanceId);
		txtParams.put("remark", this.remark);
		txtParams.put("result", this.result);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessinstanceExecuteResponse> getResponseClass() {
		return OapiProcessinstanceExecuteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionerUserid, "actionerUserid");
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
		RequestCheckUtils.checkMaxLength(remark, 2000, "remark");
		RequestCheckUtils.checkNotEmpty(result, "result");
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}g spaceId) {
			this.spaceId = spaceId;
		}
	}
	
	/**
	 * 文件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 2755562296764852462L;
		/**
		 * 附件
		 */
		@ApiListField("attachments")
		@ApiField("attachment")
		private List<Attachment> attachments;
		/**
		 * 图片
		 */
		@ApiListField("photos")
		@ApiField("string")
		private List<String> photos;
	
		public List<Attachment> getAttachments() {
			return this.attachments;
		}
		public void setAttachments(List<Attachment> attachments) {
			this.attachments = attachments;
		}
		public List<String> getPhotos() {
			return this.photos;
		}
		public void setPhotos(List<String> photos) {
			this.photos = photos;
		}
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ExecuteTaskRequest extends TaobaoObject {
		private static final long serialVersionUID = 7766328993381997827L;
		/**
		 * 操作人id，通过dingtalk.smartwork.bpms.processinstance.get这个接口可以获取
		 */
		@ApiField("actioner_userid")
		private String actionerUserid;
		/**
		 * 文件
		 */
		@ApiField("file")
		private File file;
		/**
		 * 审批实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 操作评论，可为空
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 审批操作，同意-agree，拒绝-refuse
		 */
		@ApiField("result")
		private String result;
		/**
		 * 任务节点id，dingtalk.smartwork.bpms.processinstance.get接口可获取
		 */
		@ApiField("task_id")
		private Long taskId;
	
		public String getActionerUserid() {
			return this.actionerUserid;
		}
		public void setActionerUserid(String actionerUserid) {
			this.actionerUserid = actionerUserid;
		}
		public File getFile() {
			return this.file;
		}
		public void setFile(File file) {
			this.file = file;
		}
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public Long getTaskId() {
			return this.taskId;
		}
		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}
	}
	

}