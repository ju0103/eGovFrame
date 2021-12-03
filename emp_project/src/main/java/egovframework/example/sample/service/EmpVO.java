package egovframework.example.sample.service;

public class EmpVO {
	
	/** 사원번호 */
	private int empno;
	
	/** 사원이름 */
	private String ename;
	
	/** 부서번호 */
	private int deptno;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
