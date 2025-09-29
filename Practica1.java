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
        Set<Integer> sicuad= new HashSet<>();
        int datoit1;
        int datoit4;
        int datoit2;
        int datoit3;
        Iterator<Integer> it= cuadrados.iterator();
        Iterator<Integer> it4= cuadrados.iterator();
        Iterator<Integer> it2= noCuadrados.iterator();
        Iterator<Integer> it3= noCuadrados.iterator();
        while (it.hasNext()){   //comparamos elementos de cuadrados con los de cuadrados
            datoit1=it.next();
            while(it4.hasNext()){
                datoit4=it4.next();
                if(datoit4*datoit4==datoit1)
                    sicuad.add(datoit1);
                }
            it4= cuadrados.iterator();
            }
        it=cuadrados.iterator();
        while (it.hasNext()){   //comparamos elementos de cuadrados con los de nocuadrados
            datoit1=it.next();
            while(it2.hasNext()){
                datoit2=it2.next();
                if(datoit2*datoit2==datoit1)
                    sicuad.add(datoit1);
            }
            it2= noCuadrados.iterator();
        }
        it=cuadrados.iterator();
        it2=noCuadrados.iterator();
        while (it2.hasNext()){   //comparamos elementos de nocuadrados con los de cuadrados
            datoit2=it2.next();
            while(it.hasNext()){
                datoit1=it.next();
                if(datoit1*datoit1==datoit2)
                    sicuad.add(datoit2);
            }
            it= cuadrados.iterator();
        }
        it2=noCuadrados.iterator();
        while (it2.hasNext()){   //comparamos elementos de nocuadrados con los de nocuadrados
            datoit2=it2.next();
            while(it3.hasNext()){
                datoit3=it3.next();
                if(datoit3*datoit3==datoit2)
                    sicuad.add(datoit2);
            }
            it3= noCuadrados.iterator();
        }
        if(!(cuadrados.contains(1) && noCuadrados.contains(1)))
            sicuad.remove(1);
        noCuadrados.addAll(cuadrados);
        noCuadrados.removeAll(sicuad);
        cuadrados.removeAll(cuadrados);
        cuadrados.addAll(sicuad);
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













