package it.corsojava.insiemi;

import java.util.HashMap;
import java.util.Map;
import it.corsojava.datasources.StringDataSources;
import it.corsojava.ui.TerminalUI;

public class MapSample {
    public static void main(String[] args) {

        String source = StringDataSources.getComuni();
        Comuni c =new Comuni();
        c.load(source);

        TerminalUI ui =new TerminalUI();

        ui.writeln("-------------------------------------------");
        ui.writeln("            ARCHIVIO COMUNI                ");
        ui.writeln("-------------------------------------------");

        MapSampleAgent agent=new MapSampleAgent(ui,c);
        agent.run();

        ui.writeln("-------------------------------------------");

    }
}
