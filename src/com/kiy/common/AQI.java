package com.kiy.common;


/**
 * 天气质量指数
 * @author HLX Tel:18996470535 
 * @date 2018年4月26日 
 * Copyright:Copyright(c) 2018
 */
public class AQI {
	/**
	 * 消息返回码 1:成功 0:失败
	 */
	private String success;
	
	/**
	 * 消息结果 
	 */
	private AQIResult result;
	
	/**
	 * AQI消息结果
	 * @author HLX Tel:18996470535 
	 * @date 2018年4月19日 
	 * Copyright:Copyright(c) 2018
	 */
	public class AQIResult{
		/**
		 * 天气ID
		 */
		private String weaid;
		
		/**
		 * 城市拼音
		 */
		private String cityno;
		
		/**
		 * 城市汉语
		 */
		private String citynm;
		
		/**
		 * 城市ID
		 */
		private String cityid;
		
		/**
		 * aqi
		 */
		private String aqi;
		
		/**
		 * aqi_scope
		 */
		private String aqi_scope;
		
		/**
		 * aqi_levid
		 */
		private String aqi_levid;
		
		/**
		 * aqi_levnm
		 */
		private String aqi_levnm;
		
		/**
		 * aqi_remark
		 */
		private String aqi_remark;

		/**
		 * 获取天气ID
		 * @return 天气ID
		 */
		public String getWeaid() {
			return weaid;
		}

		/**
		 * 设置天气id
		 * @param weaid 天气ID
		 */
		public void setWeaid(String weaid) {
			this.weaid = weaid;
		}

		/**
		 * 获取城市拼音
		 * @return 城市拼音
		 */
		public String getCityno() {
			return cityno;
		}

		/**
		 * 设置城市拼音
		 * @param cityno 城市拼音
		 */
		public void setCityno(String cityno) {
			this.cityno = cityno;
		}

		/**
		 * 获取城市汉语
		 * @return 城市汉语
		 */
		public String getCitynm() {
			return citynm;
		}

		/**
		 * 设置城市汉语 
		 * @param citynm 城市汉语
		 */
		public void setCitynm(String citynm) {
			this.citynm = citynm;
		}

		/**
		 * 获取城市ID
		 * @return 城市ID
		 */
		public String getCityid() {
			return cityid;
		}

		/**
		 * 设置城市ID
		 * @param cityid 城市ID
		 */
		public void setCityid(String cityid) {
			this.cityid = cityid;
		}

		/**
		 * 获取AQI指数
		 * @return AQI指数
		 */
		public String getAqi() {
			return aqi;
		}

		/**
		 * 设置AQI指数
		 * @param aqi AQI指数
		 */
		public void setAqi(String aqi) {
			this.aqi = aqi;
		}

		/**
		 * 获取AQI范围
		 * @return AQI范围
		 */
		public String getAqi_scope() {
			return aqi_scope;
		}

		/**
		 * 设置AQI范围
		 * @param aqi_scope AQI范围
		 */
		public void setAqi_scope(String aqi_scope) {
			this.aqi_scope = aqi_scope;
		}

		/**
		 * 获取AQI等级ID
		 * @return AQI等级ID
		 */
		public String getAqi_levid() {
			return aqi_levid;
		}

		/**
		 * 设置AQI等级ID
		 * @param aqi_levid AQI等级ID
		 */
		public void setAqi_levid(String aqi_levid) {
			this.aqi_levid = aqi_levid;
		}

		/**
		 * 获取AQI等级汉语
		 * @return AQI等级汉语
		 */
		public String getAqi_levnm() {
			return aqi_levnm;
		}

		/**
		 * 设置AQI等级汉语
		 * @param aqi_levnm AQI等级汉语
		 */
		public void setAqi_levnm(String aqi_levnm) {
			this.aqi_levnm = aqi_levnm;
		}

		/**
		 * 获取AQI备注
		 * @return AQI备注
		 */
		public String getAqi_remark() {
			return aqi_remark;
		}

		/**
		 * 设置AQI备注
		 * @param aqi_remark AQI备注
		 */
		public void setAqi_remark(String aqi_remark) {
			this.aqi_remark = aqi_remark;
		}
	}

	/**
	 * 获取成功信息
	 * @return 成功信息
	 */
	public String getSuccess() {
		return success;
	}

	/**
	 * 设置成功信息
	 * @param success 成功信息
	 */
	public void setSuccess(String success) {
		this.success = success;
	}

	/**
	 * 获取返回结果
	 * @return 返回结果
	 */
	public AQIResult getResult() {
		return result;
	}

	/**
	 * 设置返回结果
	 * @param result 返回结果
	 */
	public void setResult(AQIResult result) {
		this.result = result;
	}	
	
	
}
