public class Ambiente {
    private String numero;
    private String tipo;

    public Ambiente() {

    }

    public Ambiente(String tipo, String numero) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return  tipo;
    }

    public void mostrarAmbiente() {
        System.out.printf("Local de trabalho: %S %s%n", tipo, numero);
    }
}
