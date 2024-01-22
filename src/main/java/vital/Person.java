package vital;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Vitalwert> werte;

    public Person() {
        this.werte = new ArrayList<>();
    }

    public List<Vitalwert> getWerte(){
        return this.werte;
    }

    public void vitalwertHinzufuegen(Vitalwert vitalwert){
        //TODO
    }

    public String letzterVitalwert(){
        //TODOdasdasdasd
        return null;
    }
}
