package Hamburgueria;

public class Hamburguer {


   private String TipoHamburguer;

   private String TipoPão;

   private String TipoMolho;

    private String TipoQueijo;

    private String AcrescentaVerdura;


    public Hamburguer(String tipoHamburguer, String tipoPão,
                      String tipoMolho, String tipoQueijo, String acrescentaVerdura) {
        TipoHamburguer = tipoHamburguer;
        TipoPão = tipoPão;
        TipoMolho = tipoMolho;
        TipoQueijo = tipoQueijo;
        AcrescentaVerdura = acrescentaVerdura;
    }

    public Hamburguer() {

    }

    public String getTipoHamburguer() {
        return TipoHamburguer;
    }

    public void setTipoHamburguer(String tipoHamburguer) {
        TipoHamburguer = tipoHamburguer;
    }

    public String getTipoPão() {
        return TipoPão;
    }

    public void setTipoPão(String tipoPão) {
        TipoPão = tipoPão;
    }

    public String getTipoMolho() {
        return TipoMolho;
    }

    public void setTipoMolho(String tipoMolho) {
        TipoMolho = tipoMolho;
    }

    public String getTipoQueijo() {
        return TipoQueijo;
    }

    public void setTipoQueijo(String tipoQueijo) {
        TipoQueijo = tipoQueijo;
    }

    public String getAcrescentaVerdura() {
        return AcrescentaVerdura;
    }

    public void setAcrescentaVerdura(String acrescentaVerdura) {
        AcrescentaVerdura = acrescentaVerdura;
    }
}
