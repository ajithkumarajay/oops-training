package polymorphism.asset;

import java.time.LocalDate;

public abstract class Asset{
    protected LocalDate installDate;
    public Asset(LocalDate installDate) {
        this.installDate = installDate;
    }
    public LocalDate getInstallDate() {
        return installDate;
    }
    public abstract double ageFactorInPercent();
    public abstract String getType();
}