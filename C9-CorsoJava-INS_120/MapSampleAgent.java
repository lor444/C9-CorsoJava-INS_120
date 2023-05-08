package it.corsojava.insiemi;

import it.corsojava.ui.TerminalUI;

import java.util.ArrayList;
import java.util.List;

public class MapSampleAgent {

    private TerminalUI ui;
    private Comuni archivio;

    public MapSampleAgent(TerminalUI ui,Comuni archivio){
        this.ui=ui;
        this.archivio=archivio;
    }

    public void run(){
        boolean goAhead=true;
        while(goAhead) {
            ui.write("[1] Cerca per codice comune   [2] Cerca per codice istat   [3] Cerca per nome   [4] Cerca per provincia   [0] Esci");
            String cmd = ui.read();
            switch (cmd) {
                case "0":
                    goAhead=false;
                    break;
                case "1":
                    cmdSearchByCodice();
                    break;
                case "2":
                    cmdSearchByIstat();
                    break;
                case "3":
                    cmdSearchByNome();
                    break;
                case "4":
                    cmdSearchByProvincia();
                    break;
                default:
                    ui.writeln("Comando non riconosciuto");
            }
        }
    }

    private void cmdSearchByCodice(){
        ui.write("Codice comune: ");
        String codice=ui.read();
        Comune c = null; //TODO archivio.getComuneByCodice(codice);
        if(c!=null){
            ui.writeln(c.toString());
        }else {
            ui.writeln("Nessun comune trovato per il codice richiesto");
        }
    }

    private void cmdSearchByIstat(){
        ui.write("Codice Istat: ");
        String codice=ui.read();
        Comune c = null; //TODO archivio.getComuneByIstat(codice);
        if(c!=null){
            ui.writeln(c.toString());
        }else {
            ui.writeln("Nessun comune trovato corrisponde al codice ISTAT richiesto");
        }
    }

    private void cmdSearchByNome(){
        ui.write("Ricerca per nome: ");
        String nome=ui.read();
        List<Comune> comuni = new ArrayList<Comune>(); //TODO archivio.findComuniByNome(nome);
        int count=0;
        for(Comune c : comuni){
            count++;
            ui.write(count+" - ");
            ui.writeln(c.toString());
        }
        ui.writeln("Sono stati trovati "+count+" risultati");
    }

    private void cmdSearchByProvincia(){
        ui.write("Provincia (sigla): ");
        String provincia=ui.read();
        List<Comune> comuni = new ArrayList<Comune>(); //TODO archivio.getComuniByProvincia(provincia);
        int count=0;
        for(Comune c : comuni){
            count++;
            ui.write(count+" - ");
            ui.writeln(c.toString());
        }
        ui.writeln("Sono stati trovati "+count+" risultati");
    }
}
