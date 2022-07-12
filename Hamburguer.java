package Hamburgueria;

public class Hamburguer {


   public String TipoHamburguer;

   public String TipoPão;

   public String TipoMolho;

    public String TipoQueijo;

    public String AcrescentaVerdura;


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
}
