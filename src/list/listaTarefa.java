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
}
