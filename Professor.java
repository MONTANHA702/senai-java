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

         public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public String getEscolaridade() {
            return escolaridade;
        }
        public void setEscolaridade(String escolaridade) {
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
    

