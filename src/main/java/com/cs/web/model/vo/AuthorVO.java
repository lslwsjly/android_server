/**
 * 
 */
package com.cs.web.model.vo;

/**
 * @author 李思良
 *
 */
public class AuthorVO extends BaseVO {

	/**
	 * 发布者id.
	 */
	private int id;
	
	/**
	 * 头像url.
	 */
	private String head;
	
	/**
	 * 姓名.
	 */
	private String name;
	
	/**
     * @return 作者id
     */
    public final int getId() {
        return this.id;
    }

    /**
     * @param id
     *            作者id
     */
    public final void setId(final int id) {
        this.id = id;
    }
    
    /**
     * @return 姓名
     */
    public final String getName() {
        return this.name;
    }

    /**
     * @param name
     *            姓名
     */
    public final void setName(final String name) {
        this.name = name;
    }
    
    /**
     * @return 头像
     */
    public final String getHead() {
        return this.head;
    }

    /**
     * @param head
     *            头像
     */
    public final void setHead(final String head) {
        this.head = head;
    }
}
