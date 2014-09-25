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
@Table(name = "email_label")
@GaeaSerializable(name="em.EmailLabel")
public class EmailLabel implements Serializable {

	@NotDBColumn
	private static final long serialVersionUID = 3750874635L;

	/**
	 * id
	 */
	@Id(insertable = true)
	@Column(name="id")
	@GaeaMember
	private int id;

	/**
	 * 名称
	 */
	@Column(name="level_name")
	@GaeaMember
	private String levelName;

	/**
	 * 颜色
	 */
	@Column(name="level_color")
	@GaeaMember
	private String levelColor;

	public EmailLabel(){
	}

	public EmailLabel(int id){
		this.id = id;
	}

	/**
	 * getter----id
	 */
	public int getId(){
		return id;
	}

	/**
	 * setter----id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * getter----名称
	 */
	public String getLevelName(){
		return levelName;
	}

	/**
	 * setter----名称
	 */
	public void setLevelName(String levelName){
		this.levelName = levelName;
	}

	/**
	 * getter----颜色
	 */
	public String getLevelColor(){
		return levelColor;
	}

	/**
	 * setter----颜色
	 */
	public void setLevelColor(String levelColor){
		this.levelColor = levelColor;
	}

}
