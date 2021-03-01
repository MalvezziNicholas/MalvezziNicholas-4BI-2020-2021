package scuola;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;    

public class Alunno extends Persona {

    private String classe;

    public Alunno(String cognome, String nome, Date d_nasc, String classe) {
        super(cognome, nome, d_nasc);
        this.classe = classe;
    }

    public Alunno(String cognome, String nome, String d_nasc,
            String classe) {
        super(cognome, nome, d_nasc);
        this.classe = classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return this.classe;
    }

    @Override
    public String toString() {
        return super.toString() + "," + classe;
    }
        public static void main(String []args){
        Alunno d = new Alunno("malvezzi","nicholas","1 1 1970", "4bi");
        System.out.println(d.toString());     
}
}
