package test;

import java.util.ArrayList;

public class LlistaNotes {

    static ArrayList<Integer> LlistaFinal = new ArrayList<>();
    static ArrayList<Integer> Llista1 = new ArrayList<>();
    static ArrayList<Integer> Llista2 = new ArrayList<>();

    public static ArrayList concatArray() {
        for (int i = 0; i < Llista1.size(); i++) {
            LlistaFinal.add(Llista1.get(i));
            LlistaFinal.add(Llista2.get(i));
        }
        ordenarArray();
        return LlistaFinal;
    }

    public static void ordenarArray() {
        
        for (int i = 0; i < LlistaFinal.size(); i++) {
            int temp;
            for (int j = 0; j < LlistaFinal.size() - 1; j++) {
                if (LlistaFinal.get(i) < LlistaFinal.get(j)) {
                    temp = LlistaFinal.get(i);
                    LlistaFinal.set(i, LlistaFinal.get(j));
                    LlistaFinal.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Llista1.add(1);
        Llista1.add(2);
        Llista1.add(10);
        //
        Llista2.add(2);
        Llista2.add(3);
        Llista2.add(6);
        System.out.println(concatArray());
        
    }

}
