package com.kiy.common;

/**
 * 天气
 * 
 * @author HLX Tel:18996470535
 * @date 2018年4月19日 Copyright:Copyright(c) 2018
 */
public class Weather {

	/**
	 * 消息返回码 1:成功 0:失败
	 */
	private String success;

	/**
	 * result
	 */
	private WeatherResult result;

	/**
	 * 最后更新时间戳
	 */
	private long updated;

	/**
	 * 
	 * @author HLX Tel:18996470535
	 * @date 2018年4月19日 Copyright:Copyright(c) 2018
	 */
	public class WeatherResult {
		/**
		 * 天气ID
		 */
		private String weaid;

		/**
		 * 日期
		 */
		private String days;

		/**
		 * 星期
		 */
		private String week;

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
		 * 今日温度
		 */
		private String temperature;

		/**
		 * 当前温度
		 */
		private String temperature_curr;

		/**
		 * 当前湿度
		 */
		private String humidity;

		/**
		 * aqi指数 AQI指数 等级 注意事项 0-50 1级 优 参加户外活动呼吸清新空气 50-100 2级 良 可以正常进行室外活动
		 * 101-150 3级 轻度污染 敏感人群减少体力消耗大的户外活动 151-200 4级 中度污染 对敏感人群影响较大 201-300 5级
		 * 重度污染 所有人应适当减少室外活动 >300 6级 严重污染 尽量不要留在室外
		 */
		private String aqi;

		/**
		 * 天气
		 */
		private String weather;

		/**
		 * 当前天气
		 */
		private String weather_curr;

		/**
		 * 天气图标
		 */
		private String weather_icon;

		/**
		 * 天气图标2(无意义)
		 */
		private String weather_icon1;

		/**
		 * 风向
		 */
		private String wind;

		/**
		 * 风速
		 */
		private String winp;

		/**
		 * 最高温度
		 */
		private String temp_high;

		/**
		 * 最低温度
		 */
		private String temp_low;

		/**
		 * 最大湿度
		 */
		private String humi_high;

		/**
		 * 最小湿度
		 */
		private String humi_low;

		/**
		 * 天气ID
		 */
		private String weatid;

		/**
		 * 无意义
		 */
		private String weatid1;

		/**
		 * 风向ID
		 */
		private String windid;

		/**
		 * 风力ID
		 */
		private String winpid;

		/**
		 * 气象图标编号
		 */
		private String weather_iconid;

		/**
		 * 获取天气ID
		 * 
		 * @return 天气ID
		 */
		public String getWeaid() {
			return weaid;
		}

		/**
		 * 设置天气ID
		 * 
		 * @param weaid 天气ID
		 */
		public void setWeaid(String weaid) {
			this.weaid = weaid;
		}

		/**
		 * 获取日期
		 * 
		 * @return 日期
		 */
		public String getDays() {
			return days;
		}

		/**
		 * 设置日期
		 * 
		 * @param days 日期
		 */
		public void setDays(String days) {
			this.days = days;
		}

		/**
		 * 获取星期
		 * 
		 * @return 星期
		 */
		public String getWeek() {
			return week;
		}

		/**
		 * 设置星期
		 * 
		 * @param week 星期
		 */
		public void setWeek(String week) {
			this.week = week;
		}

		/**
		 * 获取城市拼音
		 * 
		 * @return 城市拼音
		 */
		public String getCityno() {
			return cityno;
		}

		/**
		 * 设置城市拼音
		 * 
		 * @param cityno 城市拼音
		 */
		public void setCityno(String cityno) {
			this.cityno = cityno;
		}

		/**
		 * 获取城市汉语
		 * 
		 * @return 城市汉语
		 */
		public String getCitynm() {
			return citynm;
		}

		/**
		 * 设置城市汉语
		 * 
		 * @param citynm 城市汉语
		 */
		public void setCitynm(String citynm) {
			this.citynm = citynm;
		}

		/**
		 * 获取城市ID
		 * 
		 * @return 城市ID
		 */
		public String getCityid() {
			return cityid;
		}

		/**
		 * 设置城市ID
		 * 
		 * @param cityid 城市ID
		 */
		public void setCityid(String cityid) {
			this.cityid = cityid;
		}

		/**
		 * 获取今日温度
		 * 
		 * @return 今日温度
		 */
		public String getTemperature() {
			return temperature;
		}

		/**
		 * 设置今日温度
		 * 
		 * @param temperature 今日温度
		 */
		public void setTemperature(String temperature) {
			this.temperature = temperature;
		}

		/**
		 * 获取当前温度
		 * 
		 * @return 当前温度
		 */
		public String getTemperature_curr() {
			return temperature_curr;
		}

		/**
		 * 设置当前温度
		 * 
		 * @param temperature_curr 当前温度
		 */
		public void setTemperature_curr(String temperature_curr) {
			this.temperature_curr = temperature_curr;
		}

		/**
		 * 获取当前湿度
		 * 
		 * @return 当前湿度
		 */
		public String getHumidity() {
			return humidity;
		}

		/**
		 * 设置当前湿度
		 * 
		 * @param humidity 当前湿度
		 */
		public void setHumidity(String humidity) {
			this.humidity = humidity;
		}

		/**
		 * 获取aqi指数
		 * 
		 * @return aqi指数
		 */
		public String getAqi() {
			return aqi;
		}

		/**
		 * 设置aqi指数
		 * 
		 * @param aqi aqi指数
		 */
		public void setAqi(String aqi) {
			this.aqi = aqi;
		}

		/**
		 * 获取天气
		 * 
		 * @return 天气
		 */
		public String getWeather() {
			return weather;
		}

		/**
		 * 设置天气
		 * 
		 * @param weather 天气
		 */
		public void setWeather(String weather) {
			this.weather = weather;
		}

		/**
		 * 获取当前天气
		 * 
		 * @return 当前天气
		 */
		public String getWeather_curr() {
			return weather_curr;
		}

		/**
		 * 设置当前天气
		 * 
		 * @param weather_curr 当前天气
		 */
		public void setWeather_curr(String weather_curr) {
			this.weather_curr = weather_curr;
		}

		/**
		 * 获取天气图标
		 * 
		 * @return 天气图标
		 */
		public String getWeather_icon() {
			return weather_icon;
		}

		/**
		 * 设置天气图标
		 * 
		 * @param weather_icon 天气图标
		 */
		public void setWeather_icon(String weather_icon) {
			this.weather_icon = weather_icon;
		}

		/**
		 * 获取天气图标2(无意义)
		 * 
		 * @return 天气图标2(无意义)
		 */
		public String getWeather_icon1() {
			return weather_icon1;
		}

		/**
		 * 设置天气图标2(无意义)
		 * 
		 * @return
		 */
		public void setWeather_icon1(String weather_icon1) {
			this.weather_icon1 = weather_icon1;
		}

		/**
		 * 获取风向
		 * 
		 * @return 风向
		 */
		public String getWind() {
			return wind;
		}

		/**
		 * 设置风向
		 * 
		 * @param wind 风向
		 */
		public void setWind(String wind) {
			this.wind = wind;
		}

		/**
		 * 获取风速
		 * 
		 * @return 风速
		 */
		public String getWinp() {
			return winp;
		}

		/**
		 * 设置风速
		 * 
		 * @param winp 风速
		 */
		public void setWinp(String winp) {
			this.winp = winp;
		}

		/**
		 * 获取最高温度
		 * 
		 * @return 最高温度
		 */
		public String getTemp_high() {
			return temp_high;
		}

		/**
		 * 设置最高温度
		 * 
		 * @param temp_high 最高温度
		 */
		public void setTemp_high(String temp_high) {
			this.temp_high = temp_high;
		}

		/**
		 * 获取最低温度
		 * 
		 * @return 最低温度
		 */
		public String getTemp_low() {
			return temp_low;
		}

		/**
		 * 设置最低温度
		 * 
		 * @param temp_low 最低温度
		 */
		public void setTemp_low(String temp_low) {
			this.temp_low = temp_low;
		}

		/**
		 * 获取最大湿度
		 * 
		 * @return 最大湿度
		 */
		public String getHumi_high() {
			return humi_high;
		}

		/**
		 * 设置最大湿度
		 * 
		 * @param humi_high 最大湿度
		 */
		public void setHumi_high(String humi_high) {
			this.humi_high = humi_high;
		}

		/**
		 * 获取最小湿度
		 * 
		 * @return 最小湿度
		 */
		public String getHumi_low() {
			return humi_low;
		}

		/**
		 * 设置最小湿度
		 * 
		 * @param humi_low 最小湿度
		 */
		public void setHumi_low(String humi_low) {
			this.humi_low = humi_low;
		}

		/**
		 * 获取天气ID
		 * 
		 * @return 天气ID
		 */
		public String getWeatid() {
			return weatid;
		}

		/**
		 * 设置天气ID
		 * 
		 * @param weatid 天气ID
		 */
		public void setWeatid(String weatid) {
			this.weatid = weatid;
		}

		public String getWeatid1() {
			return weatid1;
		}

		public void setWeatid1(String weatid1) {
			this.weatid1 = weatid1;
		}

		/**
		 * 获取风向ID
		 * 
		 * @return 风向ID
		 */
		public String getWindid() {
			return windid;
		}

		/**
		 * 设置风向ID
		 * 
		 * @param windid 风向ID
		 */
		public void setWindid(String windid) {
			this.windid = windid;
		}

		/**
		 * 获取风力ID
		 * 
		 * @return 风力ID
		 */
		public String getWinpid() {
			return winpid;
		}

		/**
		 * 设置风力ID
		 * 
		 * @param winpid 风力ID
		 */
		public void setWinpid(String winpid) {
			this.winpid = winpid;
		}

		/**
		 * 获取气象图标编号
		 * 
		 * @return 气象图标编号
		 */
		public String getWeather_iconid() {
			return weather_iconid;
		}

		/**
		 * 设置气象图标编号
		 * 
		 * @param weather_iconid 气象图标编号
		 */
		public void setWeather_iconid(String weather_iconid) {
			this.weather_iconid = weather_iconid;
		}

		public String getAQIString() {
			if (Tool.isEmpty(aqi))
				return "优";
			int number = Integer.parseInt(aqi);
			if (number < 50) {
				return "优";
			} else if (number >= 50 && number < 100) {
				return "良";
			} else if (number >= 100 && number < 150) {
				return "轻度";
			} else if (number >= 150 && number < 200) {
				return "中度";
			} else if (number >= 200 && number < 250) {
				return "重度";
			} else if (number >= 250 && number < 300) {
				return "严重";
			}
			return "严重";

		}
	}

	/**
	 * 获取消息发送状态
	 * 
	 * @return 消息返回码 1:成功 0:失败
	 */
	public String getSuccess() {
		return success;
	}

	/**
	 * 设置消息发送状态
	 * 
	 * @param success 消息返回码 1:成功 0:失败
	 */
	public void setSuccess(String success) {
		this.success = success;
	}

	public WeatherResult getResult() {
		return result;
	}

	public void setResult(WeatherResult result) {
		this.result = result;
	}

	/**
	 * 获取最后更新时间戳
	 * 
	 * @return
	 */
	public long getUpdated() {
		return updated;
	}

	/**
	 * 设置最后更新时间戳
	 * 
	 * @param updated
	 */
	public void setUpdated(long updated) {
		this.updated = updated;
	}

	
}
