package polymorphism.asset;

import java.time.LocalDate;

public class ShuntReactor extends Transformer {
    private int reactivePowerCompensation;
    public ShuntReactor(LocalDate installDate, int voltageLevel, String collingmethod, int reactivePowerCompensation) {
        super(installDate, voltageLevel, collingmethod);
        this.reactivePowerCompensation = reactivePowerCompensation;
    }
    public double getReactivePowerCompensation() {
        return reactivePowerCompensation;
    }
    @Override
    public double ageFactorInPercent() {
        int ageInYears = LocalDate.now().getYear() - getInstallDate().getYear();
        return (1.0 - (ageInYears / 10.0));
    }
    @Override
    public String getType() {
        return "Transformer.ShuntReactor";
    }
}