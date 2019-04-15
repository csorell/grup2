
package test;

import java.util.ArrayList;


public class Pila {
    static ArrayList<Integer> c = new ArrayList<>();
    
    public static void Push(int n){
        c.add(n);
    } 
    
    public static void Pop(){
        c.remove(c.size()-1);
    }
    
    public static boolean IsEmpty(){
        return c.isEmpty();
    }
    
    public static int TOP(){
        return c.get(c.size()-1);
    }
    
    
    public static void main(String[] args) {
        int n = 100000000;
        Push(n);
        Push(-5);
        Push(null);
        Push(0);
        
    }

}
