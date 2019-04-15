
package test;

import java.util.ArrayList;


public class Coa {
ArrayList<Integer> c = new ArrayList<>();
    
    
    public void Push(int n){
        c.add(n);
    } 
    
    public void Pop(){
        c.remove(0);
    }
    
    public boolean IsEmpty(){
        return c.isEmpty();
    }
    
    public int TOP(){
        return c.get(0);
    }
    
    
    public static void main(String[] args) {
        
    }


}
