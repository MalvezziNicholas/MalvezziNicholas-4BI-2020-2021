package scuola;

import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;

public class Docente extends Persona {

    private String contratto;
    private String cls_concorso;

    public Docente(String cognome, String nome, Date d_nasc, String contratto,String cls_concorso) {
        super(cognome, nome, d_nasc);
        this.contratto = contratto;
        this.cls_concorso = cls_concorso;
    }

    public Docente(String cognome, String nome, String d_nasc,String contratto,String cls_concorso) {
        super(cognome, nome, d_nasc);
        this.contratto = contratto;
        this.cls_concorso = cls_concorso;
    }

    public void setContratto(String contratto) {
        this.contratto = contratto;
    }
    
    public void setConcorso(String cls_concorso) {
        this.cls_concorso = cls_concorso;
    }

    public String getContratto() {
        return this.contratto;
    }
     public String getConcorso() {
        return this.cls_concorso;
    }

    @Override
    public String toString() {
        return super.toString() + "," + contratto + ","+ cls_concorso;
    }
        public static void main(String []args){
        Docente d = new Docente("malvezzi","nicholas","1 1 1990","xd","horse");
        System.out.println(d.toString());     
}
}
