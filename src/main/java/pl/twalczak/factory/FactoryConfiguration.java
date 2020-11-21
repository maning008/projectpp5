package pl.twalczak.factory;

public class FactoryConfiguration {
    public static Boss getResponsibleEmployee() {
        return new Boss(new Worker("bob", 10, true));
    }
}
