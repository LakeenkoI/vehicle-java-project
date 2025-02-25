package main.java.com.lakeenkoI;

public enum TypeOfEngine {
    GAS("Бензиновый"),
    ELECTRIC("Электрический");

    String typeName;

    TypeOfEngine(String type) {
        this.typeName = type;
    }

    public String getTypeName() {
        return typeName;
    }
}