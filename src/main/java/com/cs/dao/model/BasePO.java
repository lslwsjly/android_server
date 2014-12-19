package com.cs.dao.model;

/**
 * 基本持久层.
 * @author 李思良.
 *
 */
public class BasePO {

	private int id = 0;
	
	/**
     * @return 主键.
     */
    public final int getId() {
        return this.id;
    }

    /**
     * @param id 主键.
     */
    public final void setId(final int id) {
        this.id = id;
    }
}
