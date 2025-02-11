package polymorphism.asset;

import java.time.LocalDate;

public class IsolationTransformer extends Transformer {
    private int clampingVoltage;
    public IsolationTransformer(LocalDate installDate, int voltageLevel, String collingMethod, int clampingVoltage){
        super(installDate, voltageLevel, collingMethod);
        this.clampingVoltage = clampingVoltage;
    }
    public double getClampingVoltage() {
        return clampingVoltage;
    }
    @Override
    public double ageFactorInPercent(){
        int ageInYears = LocalDate.now().getYear() - getInstallDate().getYear();
        return (1.0 - (ageInYears / 20.0));
    }
    @Override
    public String getType() {
        return "Transformer.IsolationTransformer";
    }
}