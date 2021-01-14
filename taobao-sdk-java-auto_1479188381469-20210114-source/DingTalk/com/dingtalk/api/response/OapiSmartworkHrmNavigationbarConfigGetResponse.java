package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.navigationbar.config.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmNavigationbarConfigGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7772532347739342239L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 导航栏VO
	 */
	@ApiField("result")
	private HrmNavigationBarVo result;

	/** 
	 * 调用结果
	 */
	@ApiField("success")
	private Boolean success;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(HrmNavigationBarVo result) {
		this.result = result;
	}
	public HrmNavigationBarVo getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 四级子节点
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HrmNavBarTreePointVo extends TaobaoObject {
		private static final long serialVersionUID = 4591771781717232981L;
		/**
		 * 权限key
		 */
		@ApiField("auth_key")
		private String authKey;
		/**
		 * 权限类型
		 */
		@ApiField("auth_type")
		private String authType;
		/**
		 * 节点code，全局唯一
		 */
		@ApiField("code")
		private String code;
		/**
		 * 节点图标
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 节点名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否无权限
		 */
		@ApiField("no_permission")
		private Boolean noPermission;
		/**
		 * 顺序
		 */
		@ApiField("order")
		private Long order;
		/**
		 * 路径
		 */
		@ApiField("path")
		private String path;
		/**
		 * 前端跳转识别字段
		 */
		@ApiField("sub_app_code")
		private String subAppCode;
		/**
		 * 跳转链接
		 */
		@ApiField("url")
		private String url;
	
		public String getAuthKey() {
			return this.authKey;
		}
		public void setAuthKey(String authKey) {
			this.authKey = authKey;
		}
		public String getAuthType() {
			return this.authType;
		}
		public void setAuthType(String authType) {
			this.authType = authType;
		}
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getNoPermission() {
			return this.noPermission;
		}
		public void setNoPermission(Boolean noPermission) {
			this.noPermission = noPermission;
		}
		public Long getOrder() {
			return this.order;
		}
		public void setOrder(Long order) {
			this.order = order;
		}
		public String getPath() {
			return this.path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getSubAppCode() {
			return this.subAppCode;
		}
		public void setSubAppCode(String subAppCode) {
			this.subAppCode = subAppCode;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	/**
	 * 管理员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpBaseInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 7359358559534731519L;
		/**
		 * 管理员头像
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 管理员名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 管理员员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 导航栏VO
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HrmNavigationBarVo extends TaobaoObject {
		private static final long serialVersionUID = 1534184964345944953L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 导航栏节点VO
		 */
		@ApiListField("menu_list")
		@ApiField("hrm_nav_bar_tree_point_vo")
		private List<HrmNavBarTreePointVo> menuList;
		/**
		 * 管理员列表
		 */
		@ApiListField("super_admins")
		@ApiField("emp_base_info_vo")
		private List<EmpBaseInfoVo> superAdmins;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public List<HrmNavBarTreePointVo> getMenuList() {
			return this.menuList;
		}
		public void setMenuList(List<HrmNavBarTreePointVo> menuList) {
			this.menuList = menuList;
		}
		public List<EmpBaseInfoVo> getSuperAdmins() {
			return this.superAdmins;
		}
		public void setSuperAdmins(List<EmpBaseInfoVo> superAdmins) {
			this.superAdmins = superAdmins;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
