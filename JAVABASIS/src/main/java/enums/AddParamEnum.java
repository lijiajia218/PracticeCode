package enums;

public enum AddParamEnum {

    SUCCESS("success");

    private String status;

    AddParamEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static void main(String[] args) {
        
    }
}
