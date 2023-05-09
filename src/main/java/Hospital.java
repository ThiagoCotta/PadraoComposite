public class Hospital {

    private Problema sala;

    public void setRelatorio(Problema sala) {
        this.sala = sala;
    }

    public String getRelatorio() {
        if (this.sala == null) {
            throw new NullPointerException("Hospital sem salas ocupadas");
        }
        return this.sala.getProblema();
    }
}
