/**
 * 
 */
package com.cs.dao.model;

/**
 * 留言持久对象
 * @author 李思良
 *
 */
public class MsgPO extends BasePO {

	/**
	 * 留言id.
	 */
	private int id = 0;
	
	/**
	 * 活动id.
	 */
	private int actid = 0;
	
	/**
	 * 用户id
	 */
	private int uid = 0;
	
	/**
	 * 留言内容
	 */
	private String content = "";
	
	/**
	 * 留言时间.
	 */
	private String date;
	
	/**
     * @return 留言id
     */
    public final int getId() {
        return this.id;
    }

    /**
     * @param id
     *            留言id
     */
    public final void setId(final int id) {
        this.id = id;
    }
    
    /**
     * @return 活动id
     */
    public final int getActid() {
        return this.actid;
    }

    /**
     * @param actid
     *            活动id
     */
    public final void setActid(final int actid) {
        this.actid = actid;
    }
    
    /**
     * @return 用户id
     */
    public final int getUid() {
        return this.uid;
    }

    /**
     * @param uid
     *            用户id
     */
    public final void setUid(final int uid) {
        this.uid = uid;
    }
    
    /**
     * @return 留言时间
     */
    public final String getDate() {
        return this.date;
    }

    /**
     * @param content
     *            留言时间
     */
    public final void setDate(final String date) {
        this.date = date;
    }
    
    /**
     * @return 留言内容
     */
    public final String getContent() {
        return this.content;
    }

    /**
     * @param content
     *            留言内容
     */
    public final void setContent(final String content) {
        this.content = content;
    }
}
