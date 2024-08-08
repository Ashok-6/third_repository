package java.cfw_d7_d8;

public class Empp {
    private int id;
    private String emname;

    public Empp(int id, String emname) {
        this.id = id;
        this.emname = emname;
    }

    public String getEmname() {
        return emname;
    }

    @Override
    public String toString() {
        return  id  +" "+ emname ;
    }
}
