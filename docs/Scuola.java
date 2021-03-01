
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
            s = s+vect[i].toString();
        }
        return s;
    }
    
    public int indexOf(String s){
        int cont = -1;
        for(int i = 0; i<size; i++){
            Persona pers = vect[i];
            if(pers.getNome().equals(s)){
                cont = i;  
            } 
            if(pers.getCognome().equals(s)){
                cont = i;
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
        vect[pos] = null;
    }

    Persona get(int pos) {
        if (pos >= 0 && pos < size) {
            return vect[pos];
        } else {
            return null;
        }
    }
    
}
    
