package egovframework.example.sample.service;

public class DeptVO {
	/** 부서번호 */
	private int deptno;
	
	/** 부서명 */
	private String dname;
	
	/** 부서위치 */
	private String loc;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
}
