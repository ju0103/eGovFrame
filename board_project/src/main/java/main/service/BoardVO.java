package main.service;

import java.sql.Timestamp;

public class BoardVO {
	/** 게시물 번호 */
	private int bno;
	/** 게시물 제목 */
	private String title;
	/** 게시물 암호 */
	private String pwd;
	/** 게시물 작성자 */
	private String name;
	/** 게시물 내용 */
	private String content;
	/** 게시물 조회수 */
	private int hits;
	/** 게시물 작성일 */
	private Timestamp regdate;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
}
