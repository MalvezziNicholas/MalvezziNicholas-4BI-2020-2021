
package scuola;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;


public class Persona {

    protected String cognome, nome;
    protected Date data_nasc;

    public Persona(String cognome, String nome, Date d_nasc) {
        this.cognome = cognome;
        this.nome = nome;
        this.data_nasc = d_nasc;
    }

    public Persona(String cognome, String nome, String d_nasc) {
        this.cognome = cognome;
        this.nome = nome;
        try {
            this.data_nasc = new SimpleDateFormat("dd/MM/yyyy").parse(d_nasc);
        } catch (ParseException ex) {
            this.data_nasc = new Date(0);
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
     public void setCognome(String cognome){
        this.cognome = cognome;
    }
      public void setData(Date data_nasc){
        this.data_nasc = data_nasc;
    }
      public String getNome(){
          return this.nome;
      }
      public String getCognome(){
          return this.cognome;
      }
      public Date getData(){
          return this.data_nasc;
      }
      

 @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        return cognome + "," + nome + "," + df.format(data_nasc);
    }
    
    public static void main(String []args){
        Persona p = new Persona("malvezzi","Nicholas","1 1 1990");
        System.out.println(p.toString());      
}
    }





    

