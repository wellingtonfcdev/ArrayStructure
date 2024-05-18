public class ArrayStructure {
    public static void main(String[] args) {
        
        String[] tarefas = {"Estudar Java","Fazer Exercícios","Tomar Café"};

        //Acessar posições do Array
        System.out.println(tarefas[0]);
        System.out.println(tarefas[1]);
        System.out.println(tarefas[2]);

        //Atualizar posições do Array
        tarefas[2] = "Limpar a casa";
        System.out.println(tarefas[2]);

        //Tamanho do Array
        System.out.println("Você possui " + tarefas.length + " tarefas.");
    }
}
