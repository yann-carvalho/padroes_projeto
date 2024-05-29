public class Carro extends Veiculo {
    private int numeroRodas;
    private String tipoTransmissao;
    private boolean aptoParaRodarEmAreasRestritas;

    public Carro(String marca, int anoFabricacao, int numeroRodas, String tipoTransmissao) {
        super(marca, anoFabricacao);
        this.numeroRodas = numeroRodas;
        this.tipoTransmissao = tipoTransmissao;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    public boolean isAptoParaRodarEmAreasRestritas() {
        return aptoParaRodarEmAreasRestritas;
    }

    public void setAptoParaRodarEmAreasRestritas(boolean aptoParaRodarEmAreasRestritas) {
        this.aptoParaRodarEmAreasRestritas = aptoParaRodarEmAreasRestritas;
    }
}