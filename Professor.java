public class Professor {
   
        //ATRIBUTOS
        private String nome;
        private int idade;
        private String escolaridade;

        public Professor(){

        }

        public Professor(String nome, int idade, String escolaridade) {
            this.nome = nome;
            this.idade = idade;
            this.escolaridade = escolaridade;
        }



         void mostrarDados() {  
           
         System.out.println("==========");
        System.out.println("DADOS DO PROFESSOR");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Escolaridade: " + escolaridade);
        

        }
      
    }
    

