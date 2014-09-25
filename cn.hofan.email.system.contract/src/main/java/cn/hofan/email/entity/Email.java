package cn.hofan.email.entity;

import java.io.Serializable;

import cn.hofan.spat.db.dal.annotation.Column;
import cn.hofan.spat.db.dal.annotation.Id;
import cn.hofan.spat.db.dal.annotation.NotDBColumn;
import cn.hofan.spat.db.dal.annotation.Table;

import com.bj58.spat.gaea.serializer.component.annotation.GaeaMember;
import com.bj58.spat.gaea.serializer.component.annotation.GaeaSerializable;

/**
 */
@Table(name = "email")
@GaeaSerializable(name="em.Email")
public class Email implements Serializable {

	@NotDBColumn
	private static final long serialVersionUID = 856367410L;

	/**
	 * id
	 */
	@Id(insertable = true)
	@Column(name="id")
	@GaeaMember
	private long id;

	/**
	 * 账号id，对应广告系统account表
	 */
	@Column(name="account_id")
	@GaeaMember
	private int accountId;

	/**
	 * 销售平台id
	 */
	@Column(name="sales_platform_id")
	@GaeaMember
	private int salesPlatformId;

	/**
	 * 语言id，对应广告系统language表
	 */
	@Column(name="language_id")
	@GaeaMember
	private int languageId;

	/**
	 * 邮件类型：1 收件箱，2 异常邮件箱，3 待发送邮件，4 发件箱，5 废件箱，6 归档邮件
	 */
	@Column(name="email_type")
	@GaeaMember
	private int emailType;

	/**
	 * 买家id
	 */
	@Column(name="buyer_id")
	@GaeaMember
	private String buyerId;

	/**
	 * 买家名称
	 */
	@Column(name="buyer_name")
	@GaeaMember
	private String buyerName;

	/**
	 * 平台订单id
	 */
	@Column(name="item_id")
	@GaeaMember
	private String itemId;

	/**
	 * Case编号
	 */
	@Column(name="case_id")
	@GaeaMember
	private String caseId;

	/**
	 * 交易ID
	 */
	@Column(name="TransactionID")
	@GaeaMember
	private String transactionid;

	/**
	 * 发件箱关联邮件Id
	 */
	@Column(name="email_relation_id")
	@GaeaMember
	private int emailRelationId;

	/**
	 * 归档id，关联归档表
	 */
	@Column(name="email_archive_config_id")
	@GaeaMember
	private int emailArchiveConfigId;

	/**
	 * 邮件唯一标识
	 */
	@Column(name="uidl")
	@GaeaMember
	private String uidl;

	/**
	 * 是否有附件：0没有 ， 1有
	 */
	@Column(name="has_attachment")
	@GaeaMember
	private int hasAttachment;

	/**
	 * 发件人
	 */
	@Column(name="from_name")
	@GaeaMember
	private String fromName;

	/**
	 * 发件人邮箱
	 */
	@Column(name="from_email")
	@GaeaMember
	private String fromEmail;

	/**
	 * 回复人
	 */
	@Column(name="reply_name")
	@GaeaMember
	private String replyName;

	/**
	 * 回复人邮箱
	 */
	@Column(name="reply_email")
	@GaeaMember
	private String replyEmail;

	/**
	 * 接收人
	 */
	@Column(name="to_name")
	@GaeaMember
	private String toName;

	/**
	 * 接收人邮箱
	 */
	@Column(name="to_email")
	@GaeaMember
	private String toEmail;

	/**
	 * 抄送人
	 */
	@Column(name="cc_name")
	@GaeaMember
	private String ccName;

	/**
	 * 抄送人邮箱
	 */
	@Column(name="cc_email")
	@GaeaMember
	private String ccEmail;

	/**
	 * 标题
	 */
	@Column(name="subject")
	@GaeaMember
	private String subject;

	/**
	 * 接收时间
	 */
	@Column(name="receive_date")
	@GaeaMember
	private java.util.Date receiveDate;

	/**
	 * 发送时间
	 */
	@Column(name="send_date")
	@GaeaMember
	private java.util.Date sendDate;

	/**
	 * 内容
	 */
	@Column(name="content")
	@GaeaMember
	private String content;

	/**
	 * 邮件长度
	 */
	@Column(name="email_length")
	@GaeaMember
	private int emailLength;

	/**
	 * 是否异常：0否，1是
	 */
	@Column(name="is_unusual")
	@GaeaMember
	private int isUnusual;

	/**
	 * 标记颜色
	 */
	@Column(name="level_color")
	@GaeaMember
	private String levelColor;

	/**
	 * 创建时间
	 */
	@Column(name="create_time")
	@GaeaMember
	private java.util.Date createTime;

	/**
	 * 尝试发送次数
	 */
	@Column(name="try_send_num")
	@GaeaMember
	private int trySendNum;

	/**
	 * 备注
	 */
	@Column(name="remark")
	@GaeaMember
	private String remark;

	public Email(){
	}

	public Email(long id){
		this.id = id;
	}

	/**
	 * getter----id
	 */
	public long getId(){
		return id;
	}

	/**
	 * setter----id
	 */
	public void setId(long id){
		this.id = id;
	}

	/**
	 * getter----账号id，对应广告系统account表
	 */
	public int getAccountId(){
		return accountId;
	}

	/**
	 * setter----账号id，对应广告系统account表
	 */
	public void setAccountId(int accountId){
		this.accountId = accountId;
	}

	/**
	 * getter----销售平台id
	 */
	public int getSalesPlatformId(){
		return salesPlatformId;
	}

	/**
	 * setter----销售平台id
	 */
	public void setSalesPlatformId(int salesPlatformId){
		this.salesPlatformId = salesPlatformId;
	}

	/**
	 * getter----语言id，对应广告系统language表
	 */
	public int getLanguageId(){
		return languageId;
	}

	/**
	 * setter----语言id，对应广告系统language表
	 */
	public void setLanguageId(int languageId){
		this.languageId = languageId;
	}

	/**
	 * getter----邮件类型：1 收件箱，2 异常邮件箱，3 待发送邮件，4 发件箱，5 废件箱，6 归档邮件
	 */
	public int getEmailType(){
		return emailType;
	}

	/**
	 * setter----邮件类型：1 收件箱，2 异常邮件箱，3 待发送邮件，4 发件箱，5 废件箱，6 归档邮件
	 */
	public void setEmailType(int emailType){
		this.emailType = emailType;
	}

	/**
	 * getter----买家id
	 */
	public String getBuyerId(){
		return buyerId;
	}

	/**
	 * setter----买家id
	 */
	public void setBuyerId(String buyerId){
		this.buyerId = buyerId;
	}

	/**
	 * getter----买家名称
	 */
	public String getBuyerName(){
		return buyerName;
	}

	/**
	 * setter----买家名称
	 */
	public void setBuyerName(String buyerName){
		this.buyerName = buyerName;
	}

	/**
	 * getter----平台订单id
	 */
	public String getItemId(){
		return itemId;
	}

	/**
	 * setter----平台订单id
	 */
	public void setItemId(String itemId){
		this.itemId = itemId;
	}

	/**
	 * getter----Case编号
	 */
	public String getCaseId(){
		return caseId;
	}

	/**
	 * setter----Case编号
	 */
	public void setCaseId(String caseId){
		this.caseId = caseId;
	}

	/**
	 * getter----交易ID
	 */
	public String getTransactionid(){
		return transactionid;
	}

	/**
	 * setter----交易ID
	 */
	public void setTransactionid(String transactionid){
		this.transactionid = transactionid;
	}

	/**
	 * getter----发件箱关联邮件Id
	 */
	public int getEmailRelationId(){
		return emailRelationId;
	}

	/**
	 * setter----发件箱关联邮件Id
	 */
	public void setEmailRelationId(int emailRelationId){
		this.emailRelationId = emailRelationId;
	}

	/**
	 * getter----归档id，关联归档表
	 */
	public int getEmailArchiveConfigId(){
		return emailArchiveConfigId;
	}

	/**
	 * setter----归档id，关联归档表
	 */
	public void setEmailArchiveConfigId(int emailArchiveConfigId){
		this.emailArchiveConfigId = emailArchiveConfigId;
	}

	/**
	 * getter----邮件唯一标识
	 */
	public String getUidl(){
		return uidl;
	}

	/**
	 * setter----邮件唯一标识
	 */
	public void setUidl(String uidl){
		this.uidl = uidl;
	}

	/**
	 * getter----是否有附件：0没有 ， 1有
	 */
	public int getHasAttachment(){
		return hasAttachment;
	}

	/**
	 * setter----是否有附件：0没有 ， 1有
	 */
	public void setHasAttachment(int hasAttachment){
		this.hasAttachment = hasAttachment;
	}

	/**
	 * getter----发件人
	 */
	public String getFromName(){
		return fromName;
	}

	/**
	 * setter----发件人
	 */
	public void setFromName(String fromName){
		this.fromName = fromName;
	}

	/**
	 * getter----发件人邮箱
	 */
	public String getFromEmail(){
		return fromEmail;
	}

	/**
	 * setter----发件人邮箱
	 */
	public void setFromEmail(String fromEmail){
		this.fromEmail = fromEmail;
	}

	/**
	 * getter----回复人
	 */
	public String getReplyName(){
		return replyName;
	}

	/**
	 * setter----回复人
	 */
	public void setReplyName(String replyName){
		this.replyName = replyName;
	}

	/**
	 * getter----回复人邮箱
	 */
	public String getReplyEmail(){
		return replyEmail;
	}

	/**
	 * setter----回复人邮箱
	 */
	public void setReplyEmail(String replyEmail){
		this.replyEmail = replyEmail;
	}

	/**
	 * getter----接收人
	 */
	public String getToName(){
		return toName;
	}

	/**
	 * setter----接收人
	 */
	public void setToName(String toName){
		this.toName = toName;
	}

	/**
	 * getter----接收人邮箱
	 */
	public String getToEmail(){
		return toEmail;
	}

	/**
	 * setter----接收人邮箱
	 */
	public void setToEmail(String toEmail){
		this.toEmail = toEmail;
	}

	/**
	 * getter----抄送人
	 */
	public String getCcName(){
		return ccName;
	}

	/**
	 * setter----抄送人
	 */
	public void setCcName(String ccName){
		this.ccName = ccName;
	}

	/**
	 * getter----抄送人邮箱
	 */
	public String getCcEmail(){
		return ccEmail;
	}

	/**
	 * setter----抄送人邮箱
	 */
	public void setCcEmail(String ccEmail){
		this.ccEmail = ccEmail;
	}

	/**
	 * getter----标题
	 */
	public String getSubject(){
		return subject;
	}

	/**
	 * setter----标题
	 */
	public void setSubject(String subject){
		this.subject = subject;
	}

	/**
	 * getter----接收时间
	 */
	public java.util.Date getReceiveDate(){
		return receiveDate;
	}

	/**
	 * setter----接收时间
	 */
	public void setReceiveDate(java.util.Date receiveDate){
		this.receiveDate = receiveDate;
	}

	/**
	 * getter----发送时间
	 */
	public java.util.Date getSendDate(){
		return sendDate;
	}

	/**
	 * setter----发送时间
	 */
	public void setSendDate(java.util.Date sendDate){
		this.sendDate = sendDate;
	}

	/**
	 * getter----内容
	 */
	public String getContent(){
		return content;
	}

	/**
	 * setter----内容
	 */
	public void setContent(String content){
		this.content = content;
	}

	/**
	 * getter----邮件长度
	 */
	public int getEmailLength(){
		return emailLength;
	}

	/**
	 * setter----邮件长度
	 */
	public void setEmailLength(int emailLength){
		this.emailLength = emailLength;
	}

	/**
	 * getter----是否异常：0否，1是
	 */
	public int getIsUnusual(){
		return isUnusual;
	}

	/**
	 * setter----是否异常：0否，1是
	 */
	public void setIsUnusual(int isUnusual){
		this.isUnusual = isUnusual;
	}

	/**
	 * getter----标记颜色
	 */
	public String getLevelColor(){
		return levelColor;
	}

	/**
	 * setter----标记颜色
	 */
	public void setLevelColor(String levelColor){
		this.levelColor = levelColor;
	}

	/**
	 * getter----创建时间
	 */
	public java.util.Date getCreateTime(){
		return createTime;
	}

	/**
	 * setter----创建时间
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	/**
	 * getter----尝试发送次数
	 */
	public int getTrySendNum(){
		return trySendNum;
	}

	/**
	 * setter----尝试发送次数
	 */
	public void setTrySendNum(int trySendNum){
		this.trySendNum = trySendNum;
	}

	/**
	 * getter----备注
	 */
	public String getRemark(){
		return remark;
	}

	/**
	 * setter----备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}

}
