import java.util.ArrayList;
import java.util.List;

public class Sala extends Problema {

    private List<Problema> problemas;

    public Sala(String descricao) {
        super(descricao);
        this.problemas = new ArrayList<Problema>();
    }

    public void addProblema(Problema problema) {
        this.problemas.add(problema);
    }

    public String getProblema() {
        String saida = "";
        saida = "Sala: " + this.getDescricao() + "\n";
        for (Problema problema : problemas) {
            saida += problema.getProblema();
        }
        return saida;
    }
}
