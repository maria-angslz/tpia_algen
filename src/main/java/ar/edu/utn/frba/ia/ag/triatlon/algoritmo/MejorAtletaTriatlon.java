package main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.atleta.Atleta;

import java.util.Locale;
import java.util.logging.Logger;

public class MejorAtletaTriatlon {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("es","AR"));
        ParametrosValoracion.informar();
        AlgoritmoGenetico mejorAtletaTriatlon = new AlgoritmoGenetico(new ConfiguracionTriatlon(), Atleta.class);
        Atleta mejorAtleta = (Atleta) mejorAtletaTriatlon.ejecutar();
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe("Individuo final: " + mejorAtleta.toString());
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe(mejorAtleta.aptitudSobreIdeal());
        System.out.println("------------------------------------------------------------------------");
    }

}
