package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        int dato;
        Set<Integer> leidos = new HashSet<>();
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
        int elemento, dato;
        Set<Integer> datos = new HashSet<>();
        Set<Integer> sicuadrados = new HashSet<>();
        datos.addAll(cuadrados);
        datos.addAll(noCuadrados);
        Iterator<Integer> itcuadrados = cuadrados.iterator();
        Iterator<Integer> itnocuadrados = noCuadrados.iterator();
        while (itcuadrados.hasNext()){
            elemento=itcuadrados.next();
            if(datos.contains(elemento*elemento))
                sicuadrados.add(elemento*elemento);
        }
        while (itnocuadrados.hasNext()){
            elemento=itnocuadrados.next();
            if(datos.contains(elemento*elemento))
                sicuadrados.add(elemento*elemento);
        }
        if(cuadrados.contains(1) && noCuadrados.contains(1))
            sicuadrados.add(1);
        else sicuadrados.remove(1);
        cuadrados.removeAll(cuadrados);
        cuadrados.addAll(sicuadrados);
        noCuadrados.removeAll(noCuadrados);
        datos.removeAll(sicuadrados);
        noCuadrados.addAll(datos);

        //arreglado

    }




    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        Collection<Set<T>> result = new ArrayList<>();
        Set<T> current = new HashSet<>();
        List<T> resto = new LinkedList<>();
        if (it.hasNext())
            result.add(new HashSet<>());
        int num_elementos=1;
        while (it.hasNext()) {
            T elem = it.next();
            boolean añadido=false;
            for(Set<T> s : result){
                if(!s.contains(elem)) {
                    s.add(elem);
                    añadido=true;
                    break;
                }
            }
            if(! añadido){
                Set<T> t = new HashSet<>();
                t.add(elem);
                result.add(t);
            }
        }

        return  result;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        Collection<Set<T>> resultado=new HashSet<>();
        ListIterator<Set<T>> it=col.listIterator();
        ListIterator<Set<T>> it2=col.listIterator();
        Set<T> pruebas = new HashSet<>();
        while (it.hasNext()){
            Set<T> elem = it.next();
            while (it2.hasNext()){
                Set<T> elem2 = it2.next();
                pruebas.addAll(elem);
                pruebas.addAll(elem2);
                if(u.equals(pruebas) && !(u.equals(elem) || u.equals(elem2))){
                    resultado.add(new HashSet<>(elem));
                    resultado.add(new HashSet<>(elem2));
                    return resultado;
                }
                pruebas.removeAll(pruebas);
            }
            it2=col.listIterator();

        }
        return resultado;
    }



}

