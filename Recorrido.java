import java.util.ArrayList;
import java.util.List;

public class Recorrido {
    private List<Ciudad> recorrido = new ArrayList<>();
    private double distancia;
    private double costo;
    private double penalizacion;
    private double fitness;
    private double probabilidad;
    //int count = 0; usada para debug de distribución de probabilidades

    public Recorrido(List<Ciudad> ciudades) {
        for (int i = 0; i < ciudades.size(); i++) {
            recorrido.add(ciudades.get(i));
        }
        this.distancia = 0;
        this.costo = 0;
        this.penalizacion = 1;
        this.fitness = 0;
        this.probabilidad = 0;
    }

    public double getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(double penalizacion) {
        this.penalizacion = penalizacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public List<Ciudad> getRecorrido() {
        return recorrido;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }
}