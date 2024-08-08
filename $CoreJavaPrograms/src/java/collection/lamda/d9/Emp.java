package java.collection.lamda.d9;

public class Emp {
	private Integer Emid;
	private String Emname;	
public Emp(Integer Emid,String Emname) {
	this.Emid=Emid;
	this.Emname=Emname;
	}
public Integer getEmid() {
	return Emid;
}
public void setEmid(Integer emid) {
	Emid = emid;
}
public String getEmname() {
	return Emname;
}
public void setEmname(String emname) {
	Emname = emname;
}	
@Override
public String toString() {
	return "Emid=" + Emid + ", Emname=" + Emname ;
}
}

