package model;

public class OnDelivery {

    private String VNumber;
    private String VType;
    private String DrName;
    private String LTime;

    public OnDelivery() {
    }

    public OnDelivery(String VNumber, String VType, String drName, String LTime) {
        this.VNumber = VNumber;
        this.VType = VType;
        DrName = drName;
        this.LTime = LTime;
    }

    public OnDelivery(Object value, String text, Object value1, String text1, String text2) {
    }

    public String getVNumber() {
        return VNumber;
    }

    public void setVNumber(String VNumber) {
        this.VNumber = VNumber;
    }

    public String getVType() {
        return VType;
    }

    public void setVType(String VType) {
        this.VType = VType;
    }

    public String getDrName() {
        return DrName;
    }

    public void setDrName(String drName) {
        DrName = drName;
    }

    public String getLTime() {
        return LTime;
    }

    public void setLTime(String LTime) {
        this.LTime = LTime;
    }

    @Override
    public String toString() {
        return "OnDelivery{" +
                "VNumber='" + VNumber + '\'' +
                ", VType='" + VType + '\'' +
                ", DrName='" + DrName + '\'' +
                ", LTime='" + LTime + '\'' +
                '}';
    }
}
