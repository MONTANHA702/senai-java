public class HoraDoze {
    public static void main(String[] args) {
       
        Agendamento agendaHoje = new Agendamento();
        Professor novoProfessor = new Professor();

        novoProfessor.mostrarDados();
        System.out.println("Agenda de hoje: " + agendaHoje.local);
        System.out.println("Horário: " + agendaHoje.hora +"h");
        System.out.println("==========");


        }

    }
    

