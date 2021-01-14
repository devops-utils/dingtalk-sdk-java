package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiMaterialArticleUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.article.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.06.28
 */
public class OapiMaterialArticleUpdateRequest extends BaseTaobaoRequest<OapiMaterialArticleUpdateResponse> {
	
	

	/** 
	* 文章对象
	 */
	private String article;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	public void setArticle(String article) {
		this.article = article;
	}

	public void setArticle(ArticleCreateDTO article) {
		this.article = new JSONWriter(false,false,true).write(article);
	}

	public String getArticle() {
		return this.article;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.material.article.update";
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
		txtParams.put("article", this.article);
		txtParams.put("unionid", this.unionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMaterialArticleUpdateResponse> getResponseClass() {
		return OapiMaterialArticleUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
	}
	
	/**
	 * 文章对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ArticleCreateDTO extends TaobaoObject {
		private static final long serialVersionUID = 7774178695515399388L;
		/**
		 * 文章id
		 */
		@ApiField("article_id")
		private Long articleId;
		/**
		 * html码
		 */
		@ApiField("content")
		private String content;
		/**
		 * 摘要
		 */
		@ApiField("digest")
		private String digest;
		/**
		 * 封面图
		 */
		@ApiField("thumb_media_id")
		private String thumbMediaId;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public Long getArticleId() {
			return this.articleId;
		}
		public void setArticleId(Long articleId) {
			this.articleId = articleId;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getDigest() {
			return this.digest;
		}
		public void setDigest(String digest) {
			this.digest = digest;
		}
		public String getThumbMediaId() {
			return this.thumbMediaId;
		}
		public void setThumbMediaId(String thumbMediaId) {
			this.thumbMediaId = thumbMediaId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}