public class Currency {

    private String displayName;
    private String code;

    public Currency(String displayName, String code) {
        this.displayName = displayName;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return displayName;
    }
}