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
@Table(name = "tmp_wait_send_email")
@GaeaSerializable(name="em.TmpWaitSendEmail")
public class TmpWaitSendEmail implements Serializable {

	@NotDBColumn
	private static final long serialVersionUID = 5117777393L;

	/**
	 * 
	 */
	@Id(insertable = true)
	@Column(name="id")
	@GaeaMember
	private long id;

	/**
	 * 邮件id
	 */
	@Column(name="email_id")
	@GaeaMember
	private long emailId;

	/**
	 * 创建时间
	 */
	@Column(name="create_time")
	@GaeaMember
	private java.util.Date createTime;

	public TmpWaitSendEmail(){
	}

	public TmpWaitSendEmail(long id){
		this.id = id;
	}

	/**
	 * getter----
	 */
	public long getId(){
		return id;
	}

	/**
	 * setter----
	 */
	public void setId(long id){
		this.id = id;
	}

	/**
	 * getter----邮件id
	 */
	public long getEmailId(){
		return emailId;
	}

	/**
	 * setter----邮件id
	 */
	public void setEmailId(long emailId){
		this.emailId = emailId;
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

}
