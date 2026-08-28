

public class HoraDoze {
    public static void main(String[] args) {
       
        Agendamento agendaHoje = new Agendamento("Dentista", 10);
        Professor novoProfessor = new Professor("José", 45, "Mestrado");
        Ambiente novoAmbiente = new Ambiente("Sala", "105A");



        novoProfessor.mostrarDados();
        novoAmbiente.mostrarAmbiente();
        agendaHoje.mostrarAgenda();
        System.out.println("==========");

    


        
        }

    }
    

