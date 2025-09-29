package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        int dato;
        Set<Integer> leidos= new HashSet<>();
        Iterator<Integer> it2 = leidos.iterator();
        Set<Integer> devolver= new HashSet<>();
        int dato_leidos;
        while (it.hasNext()){
            dato=it.next();
            if (dato !=0){
                while (it2.hasNext()){
                    dato_leidos=it2.next();
                    if(dato%dato_leidos==0){
                        devolver.add(dato);
                    }else{
                        if(dato_leidos%dato==0) {
                            devolver.add(dato_leidos);
                        }
                    }
                }
                leidos.add(dato);
                it2 = leidos.iterator();
            }
        }
        return devolver;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        //TODO

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
