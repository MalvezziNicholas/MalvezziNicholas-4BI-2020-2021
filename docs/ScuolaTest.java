package scuola;
public class ScuolaTest {
    public static void main(String []args){
        Persona p = new Persona("malvezzi","Nicholas","1 1 1990");
        System.out.println(p.toString());
        Docente d = new Docente("malvezzi","nicholas","1 1 1990","xd","horse");
        System.out.println(d.toString());     
}
}
