package it.corsojava.insiemi;

public class Comune {
    private String codice;
    private String cap;
    private String nome;
    private String provincia;
    private String istat;

    public Comune(){

    }

    public Comune(String codice, String cap, String nome, String provincia, String istat) {
        this.codice = codice;
        this.cap = cap;
        this.nome = nome;
        this.provincia = provincia;
        this.istat = istat;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getIstat() {
        return istat;
    }

    public void setIstat(String istat) {
        this.istat = istat;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(getNome());
        sb.append(" (");
        sb.append(getProvincia());
        sb.append(") ");
        sb.append(getCap());
        sb.append(" - Coddice: ");
        sb.append(getCodice());
        sb.append(" Codice Istat: ");
        sb.append(getIstat());
        return sb.toString();
    }

}
