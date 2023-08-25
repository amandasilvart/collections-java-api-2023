package list;

import java.util.ArrayList;
import java.util.List;

public class listaTarefa {
    private List<tarefa> tarefaList;

    public listaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionartarefa(String descricao){
        tarefaList.add(new tarefa(descricao));

    }
    public void removerTarefa(String descricao){
        List<tarefa> tarefasParaRemover= new ArrayList<>();
        for(tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
    tarefaList.removeAll(tarefasParaRemover);
    }
    public int obternumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);

    }
    public static void main(String[] args){
        listaTarefa ListaTarefa= new listaTarefa();
        System.out.println("O número total de tarefas é: " + ListaTarefa.obternumeroTotalTarefas());

        ListaTarefa.adicionartarefa( "Tarefa 1");
        ListaTarefa.adicionartarefa( "Tarefa 1");
        ListaTarefa.adicionartarefa( "Tarefa 2");
        System.out.println("O número total de tarefas é: " + ListaTarefa.obternumeroTotalTarefas());

        ListaTarefa.removerTarefa("Tarefa 1");
        System.out.println("A tarefa removida foi: " + ListaTarefa.obternumeroTotalTarefas());

        ListaTarefa.obterDescricoesTarefas();

    }
}
