package com.kiy.common;

/**
 * 密保问题（用于主账号注册和找回密码）
 * 
 * @author Administrator
 *
 */
public class Question extends Unit {

	private static final long serialVersionUID = 1L;
	// 用户编号
	private String userId;
	// 问题编号（具体问题与APP定义好）
	private int questionNumber;
	// 问题答案
	private String questionAnswer;
	/**
	 * 获取用户编号
	 * @return
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置用户编号
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取问题编号
	 * @return
	 */
	public int getQuestionNumber() {
		return questionNumber;
	}
	/**
	 * 设置问题编号
	 * @param questionNumber
	 */
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	/**
	 * 获取问题答案
	 * @return
	 */
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	/**
	 * 设置问题答案
	 * @param questionAnswer
	 */
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	
}
