package b2c.cloud.test.mongodb;

import java.io.Serializable;

public class B2c_prizes implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 奖品ID
	 */
	private Long prizesid;
	/**
	 *活动ID 
	 */
	private Long  activitiesid;
	/**
	 *奖品标题 
	 */
	private String  prizestitle;
	/**
	 * 奖品名称
	 */
	private String  prizesname;
	/**
	 * 奖品数量
	 */
	private Integer  prizesnum;
	/**
	 *中奖率 
	 */
	private Float  winningrate;
	/**
	 * 剩余数量
	 */
	private Integer  remaindernum;
	/**
	 * 是否配送
	 */
	private String distribution;
	/**
	 *个性化运价标识
	 */
	private String preUrl;
	/**
	 *送出数量
	 */
	private Integer prizeNum;
	/**
	 * 奖品类型
	 */
	private int prizeType;
	/**
	 * 是否填写明珠会员号
	 * @return
	 */
	private int isMakeOut;
	public Long getPrizesid() {
		return prizesid;
	}
	public void setPrizesid(Long prizesid) {
		this.prizesid = prizesid;
	}
	public Long getActivitiesid() {
		return activitiesid;
	}
	public void setActivitiesid(Long activitiesid) {
		this.activitiesid = activitiesid;
	}
	public String getPrizestitle() {
		return prizestitle;
	}
	public void setPrizestitle(String prizestitle) {
		this.prizestitle = prizestitle;
	}
	public String getPrizesname() {
		return prizesname;
	}
	public void setPrizesname(String prizesname) {
		this.prizesname = prizesname;
	}
	public Integer getPrizesnum() {
		return prizesnum;
	}
	public void setPrizesnum(Integer prizesnum) {
		this.prizesnum = prizesnum;
	}
	public Float getWinningrate() {
		return winningrate;
	}
	public void setWinningrate(Float winningrate) {
		this.winningrate = winningrate;
	}
	public Integer getRemaindernum() {
		return remaindernum;
	}
	public void setRemaindernum(Integer remaindernum) {
		this.remaindernum = remaindernum;
	}
	public String getDistribution() {
		return distribution;
	}
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}
	public String getPreUrl() {
		return preUrl;
	}
	public void setPreUrl(String preUrl) {
		this.preUrl = preUrl;
	}

	public int getPrizeType() {
		return prizeType;
	}
	public void setPrizeType(int prizeType) {
		this.prizeType = prizeType;
	}
	
	public int getIsMakeOut() {
		return isMakeOut;
	}
	public void setIsMakeOut(int isMakeOut) {
		this.isMakeOut = isMakeOut;
	}
	public Integer getPrizeNum() {
		return prizeNum;
	}
	public void setPrizeNum(Integer prizeNum) {
		this.prizeNum = prizeNum;
	}
	
	
	
}
