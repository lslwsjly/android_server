/**
 * 
 */
package com.cs.web.model.vo;

import com.cs.dao.model.MsgPO;

/**
 * 消息模型
 * @author 李思良
 *
 */
public class MsgVO extends BaseVO {
	
	private int id;

	private int actid;
	
	private int uid;

	private String content;
	
	
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
    /**
     * 
     * @return 持久化
     */
    public final MsgPO toPO() {
    	MsgPO msg = new MsgPO();
    	msg.setId(this.id);
    	msg.setActid(this.actid);
    	msg.setUid(this.uid);
    	msg.setContent(this.content);
    	return msg;
    }
}
