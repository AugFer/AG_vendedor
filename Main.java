import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.random;

public class Main {

    private static double[][] cargarDistancias() {
        double[][] distancias = new double[11][11];

        // Bulbasaur
        distancias[0][1] = 1;   // Ivysaur
        distancias[0][2] = 2;  // Venusaur
        distancias[0][3] = 21;  // Charmander
        distancias[0][4] = 6;  // Charmeleon
        distancias[0][5] = 3;  // Charizard
        distancias[0][6] = 10; // Squirtle
        distancias[0][7] = 2;  // Wartortle
        distancias[0][8] = 4;  // Blastoise
        distancias[0][9] = 3;  // Caterpie
        distancias[0][10] = 8; // Metapod
        // Ivysaur
        distancias[1][2] = 1;   // Venusaur
        distancias[1][3] = 9;  // Charmander
        distancias[1][4] = 8;  // Charmeleon
        distancias[1][5] = 4;  // Charizard
        distancias[1][6] = 7;  // Squirtle
        distancias[1][7] = 21;  // Wartortle
        distancias[1][8] = 2;  // Blastoise
        distancias[1][9] = 4;  // Caterpie
        distancias[1][10] = 12; // Metapod
        // Venusaur
        distancias[2][3] = 1;   // Charmander
        distancias[2][4] = 14;  // Charmeleon
        distancias[2][5] = 5;  // Charizard
        distancias[2][6] = 8;  // Squirtle
        distancias[2][7] = 9;  // Wartortle
        distancias[2][8] = 3;  // Blastoise
        distancias[2][9] = 7;  // Caterpie
        distancias[2][10] = 13; // Metapod
        // Charmander
        distancias[3][4] = 1;   // Charmeleon
        distancias[3][5] = 12;  // Charizard
        distancias[3][6] = 9;  // Squirtle
        distancias[3][7] = 12;  // Wartortle
        distancias[3][8] = 5;  // Blastoise
        distancias[3][9] = 3;  // Caterpie
        distancias[3][10] = 2; // Metapod
        // Charmeleon
        distancias[4][5] = 1;   // Charizard
        distancias[4][6] = 9;  // Squirtle
        distancias[4][7] = 9;   // Wartortle
        distancias[4][8] = 2;  // Blastoise
        distancias[4][9] = 6;  // Caterpie
        distancias[4][10] = 2; // Metapod
        // Charizard
        distancias[5][6] = 1;   // Squirtle
        distancias[5][7] = 24;  // Wartortle
        distancias[5][8] = 3;  // Blastoise
        distancias[5][9] = 4;  // Caterpie
        distancias[5][10] = 37; // Metapod
        // Squirtle
        distancias[6][7] = 1;   // Wartortle
        distancias[6][8] = 10; // Blastoise
        distancias[6][9] = 99;  // Caterpie
        distancias[6][10] = 4; // Metapod
        // Wartortle
        distancias[7][8] = 1;   // Blastoise
        distancias[7][9] = 2;  // Caterpie
        distancias[7][10] = 3; // Metapod
        // Blastoise
        distancias[8][9] = 1;   // Caterpie
        distancias[8][10] = 8; // Metapod
        // Caterpie
        distancias[9][10] = 1;  // Metapod
        // Metapod - no necesita cargar ningún valor

/*
        // Cargar matriz con numeros random entre [10,99]
        Random r = new Random();
        for (int i = 0; i < distancias.length; i++) {
            for (int j = 0; j < distancias.length; j++) {
                distancias[i][j] = r.nextInt(90) + 10;
            }
        }
*/
        // Completar la matriz usando la mitad ya cargada (debido a que es simétrica)
        for (int i = 0; i < distancias.length; i++) {
            for (int j = 0; j < distancias.length && (j <= i); j++) {
                if (j < i) {
                    distancias[i][j] = distancias[j][i];
                }
                else {
                    if (j == i) {
                        distancias[i][j] = 0;
                    }
                }
            }
        }

        return distancias;
    }

    private static double[][] cargarCostos() {
        double[][] costos = new double[11][11];

        // Bulbasaur
        costos[0][1] = 1;   // Ivysaur
        costos[0][2] = 20;  // Venusaur
        costos[0][3] = 21;  // Charmander
        costos[0][4] = 16;  // Charmeleon
        costos[0][5] = 31;  // Charizard
        costos[0][6] = 100; // Squirtle
        costos[0][7] = 12;  // Wartortle
        costos[0][8] = 14;  // Blastoise
        costos[0][9] = 31;  // Caterpie
        costos[0][10] = 18; // Metapod
        // Ivysaur
        costos[1][2] = 1;   // Venusaur
        costos[1][3] = 29;  // Charmander
        costos[1][4] = 28;  // Charmeleon
        costos[1][5] = 40;  // Charizard
        costos[1][6] = 72;  // Squirtle
        costos[1][7] = 21;  // Wartortle
        costos[1][8] = 29;  // Blastoise
        costos[1][9] = 41;  // Caterpie
        costos[1][10] = 12; // Metapod
        // Venusaur
        costos[2][3] = 1;   // Charmander
        costos[2][4] = 14;  // Charmeleon
        costos[2][5] = 25;  // Charizard
        costos[2][6] = 81;  // Squirtle
        costos[2][7] = 19;  // Wartortle
        costos[2][8] = 23;  // Blastoise
        costos[2][9] = 27;  // Caterpie
        costos[2][10] = 13; // Metapod
        // Charmander
        costos[3][4] = 1;   // Charmeleon
        costos[3][5] = 12;  // Charizard
        costos[3][6] = 92;  // Squirtle
        costos[3][7] = 12;  // Wartortle
        costos[3][8] = 25;  // Blastoise
        costos[3][9] = 13;  // Caterpie
        costos[3][10] = 25; // Metapod
        // Charmeleon
        costos[4][5] = 1;   // Charizard
        costos[4][6] = 94;  // Squirtle
        costos[4][7] = 9;   // Wartortle
        costos[4][8] = 20;  // Blastoise
        costos[4][9] = 16;  // Caterpie
        costos[4][10] = 22; // Metapod
        // Charizard
        costos[5][6] = 1;   // Squirtle
        costos[5][7] = 24;  // Wartortle
        costos[5][8] = 36;  // Blastoise
        costos[5][9] = 34;  // Caterpie
        costos[5][10] = 37; // Metapod
        // Squirtle
        costos[6][7] = 1;   // Wartortle
        costos[6][8] = 101; // Blastoise
        costos[6][9] = 99;  // Caterpie
        costos[6][10] = 84; // Metapod
        // Wartortle
        costos[7][8] = 1;   // Blastoise
        costos[7][9] = 25;  // Caterpie
        costos[7][10] = 13; // Metapod
        // Blastoise
        costos[8][9] = 1;   // Caterpie
        costos[8][10] = 18; // Metapod
        // Caterpie
        costos[9][10] = 1;  // Metapod
        // Metapod - no necesita cargar ningún valor

/*
        // Cargar matriz con numeros random entre [1,99]
        Random r = new Random();
        for (int i = 0; i < costos.length; i++) {
            for (int j = 0; j < costos.length; j++) {
                costos[i][j] = r.nextInt(90) + 1;
            }
        }
*/
        // Completar la matriz usando la mitad ya cargada (debido a que es simétrica)
        for (int i = 0; i < costos.length; i++) {
            for (int j = 0; j < costos.length && (j <= i); j++) {
                if (j < i) {
                    costos[i][j] = costos[j][i];
                }
                else {
                    if (j == i) {
                        costos[i][j] = 0;
                    }
                }
            }
        }
        return costos;
    }

    private  static void defIniFin(List<Ciudad> ciudadIniFin, List<Ciudad> ciudades, int IDCiudadInicial, int IDCiudadFinal) {
        ciudadIniFin.add(ciudades.get(IDCiudadInicial));
        ciudadIniFin.add(ciudades.get(IDCiudadFinal));
        if (IDCiudadInicial == IDCiudadFinal) {
            ciudades.remove(IDCiudadInicial);
        }
        else {
            if (IDCiudadInicial > IDCiudadFinal) {
                ciudades.remove(IDCiudadInicial);
                ciudades.remove(IDCiudadFinal);
            } else {
                ciudades.remove(IDCiudadFinal);
                ciudades.remove(IDCiudadInicial);
            }
        }
    }

    private static void generarPoblacion(List<Recorrido> poblacion, List<Ciudad> ciudades, List<Ciudad> ciudadIniFin, int tamPoblacion) {
        for (int i = 0; i < tamPoblacion; i++) {
            Recorrido r = new Recorrido(ciudades);
            for (int j = 0; j < 100; j++) {
                Collections.shuffle(r.getRecorrido());
            }

            // Agregar ciudad inicial y final del recorrido
            r.getRecorrido().add(0, ciudadIniFin.get(0));
            r.getRecorrido().add(ciudadIniFin.get(1));

            poblacion.add(r);
        }
    }

    private static void fitness(List<Recorrido> poblacion, double[][] distancias, double[][] costos , double costoMaximo) {
        // Calcular distancia, costo y penalización de cada recorrido
        calcPropiedades(poblacion, distancias, costos, costoMaximo);

        // Calcular fitness y su suma para posterior normalización
        double sumFitness = 0;
        for (int i = 0; i < poblacion.size(); i++) {
            poblacion.get(i).setFitness(pow(1 / pow(poblacion.get(i).getDistancia(), poblacion.get(i).getPenalizacion()), 4));
            sumFitness += poblacion.get(i).getFitness();
        }

        // Normalizar fitness a probabilidad de selección (0,1)
        for (int i = 0; i < poblacion.size(); i++) {
            poblacion.get(i).setProbabilidad(poblacion.get(i).getFitness() / sumFitness);
        }
    }

    private static void calcPropiedades(List<Recorrido> poblacion, double[][] distancias, double[][] costos, double costoMaximo) {
        double distRecorrido;
        double costoRecorrido;
        for (int i = 0; i < poblacion.size(); i++) {
            distRecorrido = 0;
            costoRecorrido = 0;
            for (int j = 0; j < poblacion.get(i).getRecorrido().size() - 1; j++) {
                distRecorrido += distancias[poblacion.get(i).getRecorrido().get(j).getId()][poblacion.get(i).getRecorrido().get(j + 1).getId()];
                costoRecorrido += costos[poblacion.get(i).getRecorrido().get(j).getId()][poblacion.get(i).getRecorrido().get(j + 1).getId()];
            }

            poblacion.get(i).setDistancia(distRecorrido);
            poblacion.get(i).setCosto(costoRecorrido);

            if (costoRecorrido > costoMaximo) {
                poblacion.get(i).setPenalizacion(costoRecorrido/costoMaximo);
            }
        }
    }

    private static List<Ciudad> seleccion(List<Recorrido> poblacion) {
        int index = 0;
        double r = random();

        while (r > 0) {
            r = r - poblacion.get(index).getProbabilidad();
            if (r > 0 ) index++;
        }
        // Utilizado para testear si la probabilidad de ser elegido converge con las ocurrencias de seleccion
        // poblacion.get(index).count++;
/*
        for(int j=0; j<poblacion.get(index).getRecorrido().size(); j++){
            System.out.print(poblacion.get(index).getRecorrido().get(j).getNombre() + " -> ");
        }
*/

        return poblacion.get(index).getRecorrido();
    }

    private static void corssOver(List<Ciudad> padreA, List<Ciudad> padreB, List<Ciudad> hijo) {
        Random r = new Random();
        int indiceCross1 = r.nextInt(padreA.size() - 2) + 1; // indices entre [1, (padre.size - 1)]
        int indiceCross2;
        do {
            indiceCross2 = r.nextInt(padreA.size() - 2) + 1;
        } while (indiceCross2 == indiceCross1);

        if (indiceCross1 > indiceCross2) {
            int temp = indiceCross2;
            indiceCross2 = indiceCross1;
            indiceCross1 = temp;
        }

        hijo.add(padreA.get(0));
        for (int i = indiceCross1; i <= indiceCross2; i++) {
            hijo.add(padreA.get(i));
        }

        for (int j = 0; j < padreB.size() - 1; j++) {
            if (!hijo.contains(padreB.get(j))) {
                hijo.add(padreB.get(j));
            }
        }
        hijo.add(padreA.get(padreA.size() - 1));
    }

    private static void mutacion(List<Ciudad> hijo, double probMutacion) {
        for (int j = 0; j < hijo.size(); j++) {
            if (random() < probMutacion) {
                Random r = new Random();
                int indiceA = r.nextInt(hijo.size() - 2) + 1; // indices entre [1, (padre.size - 1)]
                int indiceB = r.nextInt(hijo.size() - 2) + 1;
                Ciudad temp = hijo.get(indiceA);
                hijo.set(indiceA, hijo.get(indiceB));
                hijo.set(indiceB, temp);
            }
        }
    }

    private static void imprimirResumen(int generacion, Recorrido mejorRecorrido) {
        System.out.println();
        System.out.println("Generación: "+generacion);
        System.out.println("Mejor aproximación");
        System.out.println(" - Distancia: "+mejorRecorrido.getDistancia()+" km");
        System.out.println(" - Costo: "+mejorRecorrido.getCosto()+" USD");
        System.out.println(" - Penalización: "+mejorRecorrido.getPenalizacion());
    }

    private static void imprimirFinal(List<Recorrido> poblacion, double costoMaximo, int generacion, Recorrido mejorRecorrido, int genMejorRecorrido) {
/*
        System.out.println();
        System.out.println("Individuos de la población");
        for(int i=0; i<poblacion.size(); i++){
            for(int j=0; j<poblacion.get(i).getRecorrido().size(); j++){
                System.out.print(poblacion.get(i).getRecorrido().get(j).getNombre() + " -> ");
            }
            System.out.print(poblacion.get(i).getDistancia()+" km | ");
            System.out.print(poblacion.get(i).getCosto()+" USD");
            System.out.println();
        }
*/
        System.out.println();
        System.out.println("Generación: "+generacion);
        if(mejorRecorrido.getCosto() > costoMaximo){
            System.out.println("No se ha encontrado ningún recorrido cuyo costo no supere los "+costoMaximo+" USD");
        }
        else {
            System.out.println("--------------------------");
            System.out.println("Mejor aproximación");
            System.out.println(" - Origen: generación " + genMejorRecorrido);
            System.out.println(" - Distancia: " + mejorRecorrido.getDistancia() + " km");
            System.out.println(" - Costo: " + mejorRecorrido.getCosto() + " USD");
            System.out.print(" - Recorrido: ");
            for (int j = 0; j < mejorRecorrido.getRecorrido().size(); j++) {
                //System.out.print(mejorRecorrido.getRecorrido().get(j).getNombre()+" "+mejorRecorrido.getRecorrido().get(j).getId());
                System.out.print(mejorRecorrido.getRecorrido().get(j).getNombre());
                if (j < mejorRecorrido.getRecorrido().size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Ciudad> ciudades = new ArrayList<>();
/*
        El sistema funciona para todos los subconjuntos de ciudades, siempre que cantidad de ciudades sea >= 4
        Para utilizar un subconjunto solo hay que comentar la linea de código de la/s ciudad/es a continuación
        Luego, asegurarse de no seleccionar como Inicio o Fin el ID de una ciudad comentada
*/

        ciudades.add(new Ciudad("Bulbasaur", 0));
        ciudades.add(new Ciudad("Ivysaur", 1));
        ciudades.add(new Ciudad("Venusaur", 2));
        ciudades.add(new Ciudad("Charmander", 3));
        ciudades.add(new Ciudad("Charmeleon", 4));
        ciudades.add(new Ciudad("Charizard", 5));
        ciudades.add(new Ciudad("Squirtle", 6));
        ciudades.add(new Ciudad("Wartortle", 7));
        ciudades.add(new Ciudad("Blastoise", 8));
        ciudades.add(new Ciudad("Caterpie", 9));
        ciudades.add(new Ciudad("Metapod", 10));

        // ---------- \V/ ---------- \\

        int IDCiudadInicial = 0;
        int IDCiudadFinal = 0;
        double costoMaximo = 300;

        int limiteGeneraciones = 500;
        int tamPoblacion = 100;
        double probMutacion = 0.1;

        // ---------- \V/ ---------- \\


        double[][] distancias = cargarDistancias();
        double[][] costos = cargarCostos();
        List<Ciudad> ciudadIniFin = new ArrayList<>();
        List<Ciudad> padreA, padreB, hijo;
        List<Recorrido> poblacion = new ArrayList<>();
        List<Recorrido> nuevaPoblacion;
        Recorrido mejorRecorrido;
        int genMejorRecorrido = 0;
        int generacion = 0;

        // Redefinir lista de ciudades según ciudad inicial y final seleccionadas
        defIniFin(ciudadIniFin, ciudades, IDCiudadInicial, IDCiudadFinal);

        // Crear la población inicial con recorridos random
        generarPoblacion(poblacion, ciudades, ciudadIniFin, tamPoblacion);

        // Inicializar mejorRecorrido dummy con el recorrido del primer individuo de la población (fitness = 0)
        mejorRecorrido = new Recorrido(poblacion.get(0).getRecorrido());

        // Iniciar proceso evolutivo
        while(generacion < limiteGeneraciones) {
            // Calcular fitness y normalizar probabilidad de selección
            fitness(poblacion, distancias, costos, costoMaximo);

            // Buscar al mejor individuo de la población
            boolean encontrado = false;
            for (int i = 0; i < poblacion.size(); i++) {
                if (poblacion.get(i).getFitness() > mejorRecorrido.getFitness() && poblacion.get(i).getCosto() <= costoMaximo) {
                    mejorRecorrido = poblacion.get(i);
                    genMejorRecorrido = generacion;
                    encontrado = true;
                }
            }
            // Si en la generación actual se descubrió un nuevo mejor individuo, imprimir información
            if(encontrado) {
                imprimirResumen(generacion, mejorRecorrido);
            }
            // Nueva generación
            generacion++;
            nuevaPoblacion = new ArrayList<>();
            for (int i = 0; i < poblacion.size() - 1; i++) { // -1 porque un espacio es para el mejor individuo de la generación anterior
                // Elegir padres
                padreA = seleccion(poblacion);
                padreB = seleccion(poblacion);
                hijo = new ArrayList<>();

                // CrossOver
                corssOver(padreA, padreB, hijo);

                // Mutar
                mutacion(hijo, probMutacion);

                // Crear y añadir el nuevo individuo (hijo) en la nueva población
                Recorrido nuevoRec = new Recorrido(hijo);
                nuevaPoblacion.add(nuevoRec);
            }
            // Agregar el mejor individuo de la población anterior en la nueva población
            nuevaPoblacion.add(mejorRecorrido);

            // Reemplazar la población anterior por la nueva población
            poblacion = nuevaPoblacion;
        }
        // Calcular fitness y buscar posible mejor individuo en la última generación
        fitness(poblacion, distancias, costos, costoMaximo);
        for (int i = 0; i < poblacion.size(); i++) {
            if (poblacion.get(i).getFitness() > mejorRecorrido.getFitness() && poblacion.get(i).getCosto() <= costoMaximo) {
                mejorRecorrido = poblacion.get(i);
                genMejorRecorrido = generacion;
            }
        }
        // Imprimir resultados finales
        imprimirFinal(poblacion, costoMaximo, generacion, mejorRecorrido, genMejorRecorrido);

/*
        // Imprimir matriz de distancias
        System.out.println();
        for (int i = 0; i < distancias.length; i++) {
            for (int j = 0; j < distancias.length; j++) {
                System.out.print(distancias[i][j]+" | ");
            }
            System.out.println();
        }

        // Imprimir matriz de costos
        System.out.println();
        for (int i = 0; i < costos.length; i++) {
            for (int j = 0; j < costos.length; j++) {
                System.out.print(costos[i][j]+" | ");
            }
            System.out.println();
        }
*/

/*
        // Test de convergencia probabilidad de eleccion y ocurrencias del metodo seleccion
        for (int i = 0; i < 10000000; i++) {
            ArrayList<Ciudad> test = seleccion(poblacion);
        }
        for (int i = 0; i < poblacion.size(); i++) {
            System.out.println("Probabilidad: "+poblacion.get(i).getProbabilidad()*1000);
            System.out.println("Contador: "+poblacion.get(i).count);
            System.out.println();
        }
*/
    }
}