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
@Table(name = "email_adjunct")
@GaeaSerializable(name="em.EmailAdjunct")
public class EmailAdjunct implements Serializable {

	@NotDBColumn
	private static final long serialVersionUID = 1310306208L;

	/**
	 * id
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
	 * 附件名称
	 */
	@Column(name="adjunct_name")
	@GaeaMember
	private String adjunctName;

	/**
	 * 附件类型，文件扩展名
	 */
	@Column(name="adjunct_type")
	@GaeaMember
	private String adjunctType;

	/**
	 * 附件大小
	 */
	@Column(name="adjunct_size")
	@GaeaMember
	private int adjunctSize;

	/**
	 * 附件内容
	 */
	@Column(name="adjunct_data")
	@GaeaMember
	private byte[] adjunctData;

	/**
	 * 附件标记
	 */
	@Column(name="emailBox_type")
	@GaeaMember
	private String emailboxType;

	public EmailAdjunct(){
	}

	public EmailAdjunct(long id){
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
	 * getter----附件名称
	 */
	public String getAdjunctName(){
		return adjunctName;
	}

	/**
	 * setter----附件名称
	 */
	public void setAdjunctName(String adjunctName){
		this.adjunctName = adjunctName;
	}

	/**
	 * getter----附件类型，文件扩展名
	 */
	public String getAdjunctType(){
		return adjunctType;
	}

	/**
	 * setter----附件类型，文件扩展名
	 */
	public void setAdjunctType(String adjunctType){
		this.adjunctType = adjunctType;
	}

	/**
	 * getter----附件大小
	 */
	public int getAdjunctSize(){
		return adjunctSize;
	}

	/**
	 * setter----附件大小
	 */
	public void setAdjunctSize(int adjunctSize){
		this.adjunctSize = adjunctSize;
	}

	/**
	 * getter----附件内容
	 */
	public byte[] getAdjunctData(){
		return adjunctData;
	}

	/**
	 * setter----附件内容
	 */
	public void setAdjunctData(byte[] adjunctData){
		this.adjunctData = adjunctData;
	}

	/**
	 * getter----附件标记
	 */
	public String getEmailboxType(){
		return emailboxType;
	}

	/**
	 * setter----附件标记
	 */
	public void setEmailboxType(String emailboxType){
		this.emailboxType = emailboxType;
	}

}
