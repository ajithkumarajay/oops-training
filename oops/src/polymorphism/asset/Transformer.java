package polymorphism.asset;

import java.time.LocalDate;

public abstract  class Transformer extends Asset{
    private int voltageLevel;
    private String CollingMethod;
    public Transformer(LocalDate installDate, int voltageLevel, String collingmethod) {
        super (installDate);
        this.voltageLevel = voltageLevel;
        this.CollingMethod = collingmethod;
    }
    public int getVoltageLevel() {
        return voltageLevel;
    }
    public String getCollingMethod() {
        return CollingMethod;
    }
    @Override
    public String getType() {
        return "Transformer";
    }
}