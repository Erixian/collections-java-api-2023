import list.OperacoesBasicas.ListaTarefa;

public class Program {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
