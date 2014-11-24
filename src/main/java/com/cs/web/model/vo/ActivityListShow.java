/**
 * 
 */
package com.cs.web.model.vo;

/**
 * @author ZST
 *
 */
public class ActivityListShow extends BaseVO {

	private int id;
	
	private String image;
	
	private String title;
	
	private String acttime;
	
	private int applynum;
	
	private int collectnum;
	
	private int watchnum;
	
	private String description;
	
	private AuthorVO author;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the acttime
	 */
	public String getActtime() {
		return acttime;
	}

	/**
	 * @param acttime the acttime to set
	 */
	public void setActtime(String acttime) {
		this.acttime = acttime;
	}

	/**
	 * @return the applynum
	 */
	public int getApplynum() {
		return applynum;
	}

	/**
	 * @param applynum the applynum to set
	 */
	public void setApplynum(int applynum) {
		this.applynum = applynum;
	}

	/**
	 * @return the collectnum
	 */
	public int getCollectnum() {
		return collectnum;
	}

	/**
	 * @param collectnum the collectnum to set
	 */
	public void setCollectnum(int collectnum) {
		this.collectnum = collectnum;
	}

	/**
	 * @return the watchnum
	 */
	public int getWatchnum() {
		return watchnum;
	}

	/**
	 * @param watchnum the watchnum to set
	 */
	public void setWatchnum(int watchnum) {
		this.watchnum = watchnum;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the author
	 */
	public AuthorVO getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(AuthorVO author) {
		this.author = author;
	}
}
