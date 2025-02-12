package polymorphism;

import java.time.LocalDate;
import polymorphism.asset.Asset;
import polymorphism.asset.IsolationTransformer;
import polymorphism.asset.ShuntReactor;

public class Polymorphism{
    public static void main (String[] args) {
        // Asset transformer = new Transformer(LocalDate.of(2015, 12, 01), 150, "oil_immersed");
        Asset shuntReactor = new ShuntReactor(LocalDate.of(2022, 6, 22), 10, "air-cooled", 5000);
        Asset isolationTransformer = new IsolationTransformer(LocalDate.of(2017, 5, 13), 10, "air-cooled", 200);
        Asset[] assets = {shuntReactor, isolationTransformer};
        for (Asset asset : assets) {
           System.out.println();
           System.out.println("Type: " + asset.getType());
           System.out.println("Install Date: " + asset.getInstallDate());
           System.out.println("Age Factor (%): " + Math.round(asset.ageFactorInPercent() * 100) + "%");
        }
    }
}