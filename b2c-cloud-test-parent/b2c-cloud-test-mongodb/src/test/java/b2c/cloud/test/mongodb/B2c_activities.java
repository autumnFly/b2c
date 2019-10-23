package b2c.cloud.test.mongodb;

import java.math.BigDecimal;
import java.util.Date;

public class B2c_activities {
	/**
	 * 用户安全等级
	 */
	private String phoneUserGreade;
	/**
	 * 是否调用腾讯接口
	 */
	private String isSkyDefendSysIntgd;
	/**
	 * 活动ID
	 */
	private Long activitiesid;
	/**
	 * 活动标题
	 */
	private String  activitiestitle;
	/**
	 * 活动开始时间
	 */
	private Date  startdate;
	/**
	 * 活动结束时间
	 */
	private Date  enddate;
	/**
	 * 开关 
	 */
	private Integer  switchs;
	/**
	 * 创建时间
	 */
	private Date  createdate;
	/**
	 *创建人员ID
	 */
	private String  createoperatorid;
	/**
	 * 最后更新时间
	 */
	private Date  lastupdate;
	/**
	 * 最后更新人员ID
	 */
	private String  lastupdateoperatorid;
	/**
	 * 是否身份认证
	 */
	private Integer identityAuth;
	/**
	 * 抽奖需要的点数
	 */
    private BigDecimal rafflePoints;
/**
 * 奖品数量
 */
    private long prizeNum;
/**
 * 奖品类型
 */
    private String raffleType;
    /**
     * 积分抽奖为1
     */
    private Integer activitiesType;
    private Integer activityType;
    
    private Integer rafflePointsThrshold;
    
    @Override
	public String toString() {
		return "B2c_activities [phoneUserGreade=" + phoneUserGreade + ", isSkyDefendSysIntgd=" + isSkyDefendSysIntgd
				+ ", activitiesid=" + activitiesid + ", activitiestitle=" + activitiestitle + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", switchs=" + switchs + ", createdate=" + createdate + ", createoperatorid="
				+ createoperatorid + ", lastupdate=" + lastupdate + ", lastupdateoperatorid=" + lastupdateoperatorid
				+ ", identityAuth=" + identityAuth + ", rafflePoints=" + rafflePoints + ", prizeNum=" + prizeNum
				+ ", raffleType=" + raffleType + ", activitiesType=" + activitiesType + ", activityType=" + activityType
				+ ", rafflePointsThrshold=" + rafflePointsThrshold + "]";
	}
	public String getPhoneUserGreade() {
		return phoneUserGreade;
	}
	public void setPhoneUserGreade(String phoneUserGreade) {
		this.phoneUserGreade = phoneUserGreade;
	}
	public String getIsSkyDefendSysIntgd() {
		return isSkyDefendSysIntgd;
	}
	public void setIsSkyDefendSysIntgd(String isSkyDefendSysIntgd) {
		this.isSkyDefendSysIntgd = isSkyDefendSysIntgd;
	}
	public Long getActivitiesid() {
		return activitiesid;
	}
	public void setActivitiesid(Long activitiesid) {
		this.activitiesid = activitiesid;
	}
	public String getActivitiestitle() {
		return activitiestitle;
	}
	public void setActivitiestitle(String activitiestitle) {
		this.activitiestitle = activitiestitle;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Integer getSwitchs() {
		return switchs;
	}
	public void setSwitchs(Integer switchs) {
		this.switchs = switchs;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getCreateoperatorid() {
		return createoperatorid;
	}
	public void setCreateoperatorid(String createoperatorid) {
		this.createoperatorid = createoperatorid;
	}
	public Date getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}
	public String getLastupdateoperatorid() {
		return lastupdateoperatorid;
	}
	public void setLastupdateoperatorid(String lastupdateoperatorid) {
		this.lastupdateoperatorid = lastupdateoperatorid;
	}
	public Integer getIdentityAuth() {
		return identityAuth;
	}
	public void setIdentityAuth(Integer identityAuth) {
		this.identityAuth = identityAuth;
	}

	public long getPrizeNum() {
		return prizeNum;
	}
	public void setPrizeNum(long prizeNum) {
		this.prizeNum = prizeNum;
	}
	public String getRaffleType() {
		return raffleType;
	}
	public void setRaffleType(String raffleType) {
		this.raffleType = raffleType;
	}
	public BigDecimal getRafflePoints() {
		return rafflePoints;
	}
	public void setRafflePoints(BigDecimal rafflePoints) {
		this.rafflePoints = rafflePoints;
	}
	public Integer getActivitiesType() {
		return activitiesType;
	}
	public void setActivitiesType(Integer activitiesType) {
		this.activitiesType = activitiesType;
	}
	public Integer getActivityType() {
		return activityType;
	}
	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}
	public Integer getRafflePointsThrshold() {
		return rafflePointsThrshold;
	}
	public void setRafflePointsThrshold(Integer rafflePointsThrshold) {
		this.rafflePointsThrshold = rafflePointsThrshold;
	}
	
}
