package Util;

public enum AbstractLocation {
    SET_PROPERTY_CHROME("webdriver.chrome.driver"),
    PROP_FILE("src/test/resources/data.properties");
    String value;

    public String getValue() {
        return value;
    }
    AbstractLocation(String value){
        this.value=value;
    }
}
