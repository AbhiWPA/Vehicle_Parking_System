package view.tm;

public class OnDeliveryTM {

    private String VNumb;
    private String VType;
    private String DName;
    private String Date;

    public OnDeliveryTM() {
    }

    public OnDeliveryTM(String VNumb, String VType, String DName, String date) {
        this.VNumb = VNumb;
        this.VType = VType;
        this.DName = DName;
        Date = date;
    }

    public String getVNumb() {
        return VNumb;
    }

    public void setVNumb(String VNumb) {
        this.VNumb = VNumb;
    }

    public String getVType() {
        return VType;
    }

    public void setVType(String VType) {
        this.VType = VType;
    }

    public String getDName() {
        return DName;
    }

    public void setDName(String DName) {
        this.DName = DName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "OnDelivery{" +
                "VNumb='" + VNumb + '\'' +
                ", VType='" + VType + '\'' +
                ", DName='" + DName + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }



}
