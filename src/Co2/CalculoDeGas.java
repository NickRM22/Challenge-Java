package Co2;
// METODO QUE CALCULA GAS

public class CalculoDeGas {
    double carEmission = 0.192; // kg CO2 por km
    double totalBusImission = 0.105; // kg CO2 por km
    int passagers = 40;
    double busEmissionsPerPerson;
    double co2Saved;

    public double calcularCO2Economizado(double distanciaKm) {
        busEmissionsPerPerson = totalBusImission / passagers;
        co2Saved = (carEmission - busEmissionsPerPerson) * distanciaKm;

        return co2Saved; // em kg
    }
}
