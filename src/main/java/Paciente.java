public class Paciente extends Problema {

    private int prioridade;

    public Paciente(String descricao, int prioridade) {
        super(descricao);
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getProblema() {
        return "Prontuário: " + this.getDescricao() + " - prioridade: " + this.prioridade + "\n";
    }

}
