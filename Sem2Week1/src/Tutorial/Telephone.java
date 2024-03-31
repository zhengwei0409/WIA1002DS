
package Tutorial;

public class Telephone {
    private String areaCode;
    private int number;
    private static int numberOfTelephoneObject;
    
    Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String makeFullNumber() {
        return areaCode + "-" + number;
    }
}
