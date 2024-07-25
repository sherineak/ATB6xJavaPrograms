package ex_20_WrapperClass;

public class Lab212 {
}

class PersonATB{
    Integer rollNO;
    String name;
    Long phoneNo;

    public PersonATB(Integer rollNO, String name, Long phoneNo) {
        this.rollNO = rollNO;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public Integer getRollNO() {
        return rollNO;
    }

    public void setRollNO(Integer rollNO) {
        this.rollNO = rollNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
