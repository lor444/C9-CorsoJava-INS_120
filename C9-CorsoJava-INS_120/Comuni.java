package it.corsojava.insiemi;

import java.util.HashMap;
import java.util.Map;

public class Comuni {

    Map<String,Comune> comuniMap;

    public Comuni(){
        comuniMap = new HashMap<String,Comune>();
    }

    public void load(String source){
        if(source!=null) {
            String[] lines = source.split("\n");
            for (String line : lines) {
                Comune c=loadComuneByString(line);
                importComune(c);
            }
        }
    }

    private void importComune(Comune c){
        comuniMap.put(c.getCodice(),c);
    }

    private Comune loadComuneByString(String line){
        if(line!=null){
            String[] fields = line.split("\t");
            if (fields.length == 5) {
                Comune c = new Comune();
                c.setCodice(fields[0]);
                c.setCap(fields[1]);
                c.setNome(fields[2]);
                c.setProvincia(fields[3]);
                c.setIstat(fields[4]);
                return c;
            } else {
                throw new IllegalArgumentException("Invalid line: " + line);
            }
        }else {
            throw new IllegalArgumentException("Null line");
        }
    }
}
