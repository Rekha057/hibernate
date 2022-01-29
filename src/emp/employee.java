package emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class employee {
	@Id    
	int empno;
	@Column
	String empname;
	String empemail;
	public String getEmpemail() {
	    return empemail;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	@Override
	public String toString() {
		return "employee [empno=" + empno + ", empname=" + empname + ", empemail=" + empemail + "]";
	}
}
