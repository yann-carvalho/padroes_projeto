public class Moto extends Veiculo {
    private int cilindrada;
    private String tipoPartida;

    public Moto(String marca, int anoFabricacao, int cilindrada, String tipoPartida) {
        super(marca, anoFabricacao);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }
}