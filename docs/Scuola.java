/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scuola;

public class Scuola {

    private Persona[] vect;
    private int size; // numero elementi effettivamente inseriti

    public int getSize() {
        return size;
    }

    public boolean add(Persona p) {
        if (vect == null) {
            vect = new Persona[20];
        }
        if (size < vect.length) {
            vect[size] = p;
            size++;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        String s = "Grandezza:"+ size;
        for(int i = 0; i<size; i++){
            s = s+ vect[i];
        }
        return s;
    }
    
    public int indexOf(String s){
        int cont = 0;
        for(int i = 0; i<size; i++){
            Persona pers = vect[i];
            if(pers.getNome().equals(s)){
                cont++;  
            } 
            if(pers.getCognome().equals(s)){
                cont++;
            }
        }
        if(cont==0){
            return -1;
        }
        else{
            return cont;
        }
    }
    public void remove(int pos){
        
    }

    Persona get(int pos) {
        if (pos >= 0 && pos < size) {
            return vect[pos];
        } else {
            return null;
        }
    }
    
}
    
