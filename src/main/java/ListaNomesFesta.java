import java.util.ArrayList;
import java.util.List;

public class ListaNomesFesta implements Cloneable{

    private List<String> nomes;

    public ListaNomesFesta(){
        nomes = new ArrayList<String>();
    }

    public ListaNomesFesta(List<String> list){
        this.nomes=list;
    }
    public void convidados(){
        nomes.add("Caio");
        nomes.add("Sarah");
        nomes.add("David");
        nomes.add("Lisa");
        nomes.add("Rau");
    }

    public List<String> novosNomes() {
        return nomes;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> nomesN = new ArrayList<String>();
        for(String n : this.novosNomes()){
            nomesN.add(n);
        }
        return new ListaNomesFesta(nomesN);
    }

}