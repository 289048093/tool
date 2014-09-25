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
@Table(name = "email_archive_config")
@GaeaSerializable(name="em.EmailArchiveConfig")
public class EmailArchiveConfig implements Serializable {

	@NotDBColumn
	private static final long serialVersionUID = 5269630820L;

	/**
	 * 编号
	 */
	@Id(insertable = true)
	@Column(name="id")
	@GaeaMember
	private int id;

	/**
	 * 父id
	 */
	@Column(name="parent_id")
	@GaeaMember
	private int parentId;

	/**
	 * 归档标题
	 */
	@Column(name="subject_name")
	@GaeaMember
	private String subjectName;

	/**
	 * 是否启用：0否，1启用
	 */
	@Column(name="is_enabled")
	@GaeaMember
	private int isEnabled;

	/**
	 * 创建人
	 */
	@Column(name="create_user")
	@GaeaMember
	private String createUser;

	/**
	 * 创建时间
	 */
	@Column(name="create_time")
	@GaeaMember
	private java.util.Date createTime;

	/**
	 * 修改时间
	 */
	@Column(name="last_upd_time")
	@GaeaMember
	private java.util.Date lastUpdTime;

	/**
	 * 修改人
	 */
	@Column(name="last_upd_user")
	@GaeaMember
	private String lastUpdUser;

	public EmailArchiveConfig(){
	}

	public EmailArchiveConfig(int id){
		this.id = id;
	}

	/**
	 * getter----编号
	 */
	public int getId(){
		return id;
	}

	/**
	 * setter----编号
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * getter----父id
	 */
	public int getParentId(){
		return parentId;
	}

	/**
	 * setter----父id
	 */
	public void setParentId(int parentId){
		this.parentId = parentId;
	}

	/**
	 * getter----归档标题
	 */
	public String getSubjectName(){
		return subjectName;
	}

	/**
	 * setter----归档标题
	 */
	public void setSubjectName(String subjectName){
		this.subjectName = subjectName;
	}

	/**
	 * getter----是否启用：0否，1启用
	 */
	public int getIsEnabled(){
		return isEnabled;
	}

	/**
	 * setter----是否启用：0否，1启用
	 */
	public void setIsEnabled(int isEnabled){
		this.isEnabled = isEnabled;
	}

	/**
	 * getter----创建人
	 */
	public String getCreateUser(){
		return createUser;
	}

	/**
	 * setter----创建人
	 */
	public void setCreateUser(String createUser){
		this.createUser = createUser;
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
	 * getter----修改时间
	 */
	public java.util.Date getLastUpdTime(){
		return lastUpdTime;
	}

	/**
	 * setter----修改时间
	 */
	public void setLastUpdTime(java.util.Date lastUpdTime){
		this.lastUpdTime = lastUpdTime;
	}

	/**
	 * getter----修改人
	 */
	public String getLastUpdUser(){
		return lastUpdUser;
	}

	/**
	 * setter----修改人
	 */
	public void setLastUpdUser(String lastUpdUser){
		this.lastUpdUser = lastUpdUser;
	}

}
