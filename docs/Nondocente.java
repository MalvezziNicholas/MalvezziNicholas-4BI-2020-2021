package scuola;
import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;


public class Nondocente extends Persona {

    private String contratto;
    private String incarico;

    public Nondocente(String cognome, String nome, Date d_nasc, String contratto,String incarico) {
        super(cognome, nome, d_nasc);
        this.contratto = contratto;
        this.incarico = incarico;
    }

    public Nondocente(String cognome, String nome, String d_nasc,String contratto,String incarico) {
        super(cognome, nome, d_nasc);
        this.contratto = contratto;
        this.incarico = incarico;
    }

    public void setContratto(String contratto) {
        this.contratto = contratto;
    }
    
    public void setConcorso(String incarico) {
        this.incarico = incarico;
    }

    public String getContratto() {
        return this.contratto;
    }
     public String getIncarico() {
        return this.incarico;
    }

    @Override
    public String toString() {
        return super.toString() + "," + contratto + ","+ incarico;
    }
        public static void main(String []args){
        Nondocente d = new Nondocente("malvezzi","nicholas","1 1 1990","xd","horse");
        System.out.println(d.toString());     
}
}


