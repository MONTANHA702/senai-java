public class Agendamento {
    
    private int hora = 12;
    private String compromisso = "Dentista";

    public Agendamento() {

    }

        public Agendamento(String compromisso, int hora) {
        this.compromisso = compromisso;
        this.hora = hora;
    }

    public void mostrarAgenda() {
        System.out.println("_____________");
        System.out.printf("Tem %S às %d horas%n", compromisso, hora);
    }


    
    
}
