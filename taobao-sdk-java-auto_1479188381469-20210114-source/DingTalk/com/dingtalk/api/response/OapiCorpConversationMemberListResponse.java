package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.corp.conversation.member.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCorpConversationMemberListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2365854461598163255L;

	/** 
	 * 服务出参
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 成员信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberModel extends TaobaoObject {
		private static final long serialVersionUID = 3796444149836492124L;
		/**
		 * 员工ID
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberListModel extends TaobaoObject {
		private static final long serialVersionUID = 3344668461369479551L;
		/**
		 * 成员信息
		 */
		@ApiListField("member_list")
		@ApiField("open_member_model")
		private List<OpenMemberModel> memberList;
	
		public List<OpenMemberModel> getMemberList() {
			return this.memberList;
		}
		public void setMemberList(List<OpenMemberModel> memberList) {
			this.memberList = memberList;
		}
	}
	
	/**
	 * 服务出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2589655593629135154L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 系统错误
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 成员列表
		 */
		@ApiField("result")
		private OpenMemberListModel result;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public OpenMemberListModel getResult() {
			return this.result;
		}
		public void setResult(OpenMemberListModel result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
