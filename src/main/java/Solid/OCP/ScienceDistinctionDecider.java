package Solid.OCP;

public class ScienceDistinctionDecider implements DistintionDecider {

    @Override
    public void evaluateDistinction(Estudiante estudiante) {
        if (estudiante.score > 80){
            System.out.println(estudiante.regNumber+" recibió una distincion en ciencias.");
        }
    }
}