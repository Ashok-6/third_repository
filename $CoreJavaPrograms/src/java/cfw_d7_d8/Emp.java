package java.cfw_d7_d8;

public class Emp implements Comparable {

    private Integer emp_id;
    private String emp_name;

   
    public Emp(Integer emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

 
    @Override
	public String toString() {
		return "Emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
	@Override
	public int compareTo(Object o) {
		return this.getEmp_name().compareTo(((Emp) o).getEmp_name());
	}
}
