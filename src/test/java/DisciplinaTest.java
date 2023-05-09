import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    @Test
    void deveRetornarEmentaDisciplina() {
        Sala sala1 = new Sala("Pronto-Socorro");
        Paciente paciente11 = new Paciente("Paciente ferido no ombro após acidente", 5);
        sala1.addProblema(paciente11);
        
        Sala sala2 = new Sala("Ambulatório");
        Paciente paciente21 = new Paciente("Paciente apresenta febre de 38.1 graus", 4);
        sala2.addProblema(paciente21);

        Sala sala3 = new Sala("Centro Cirúrgico");
        Paciente paciente31 = new Paciente("Paciente necessita de troca de coração", 10);
        sala3.addProblema(paciente31);

        Sala relatorioAndar1 = new Sala("Andar 1");
        relatorioAndar1.addProblema(sala1);
        relatorioAndar1.addProblema(sala2);
        relatorioAndar1.addProblema(sala3);

        Hospital hospital = new Hospital();
        hospital.setRelatorio(relatorioAndar1);

        assertEquals("Sala: Andar 1\n" +
                "Sala: Pronto-Socorro\n" +
                "Prontuário: Paciente ferido no ombro após acidente - prioridade: 5\n" +
                "Sala: Ambulatório\n" +
                "Prontuário: Paciente apresenta febre de 38.1 graus - prioridade: 4\n" +
                "Sala: Centro Cirúrgico\n" +
                "Prontuário: Paciente necessita de troca de coração - prioridade: 10\n", hospital.getRelatorio());
    }

    @Test
    void deveRetornarExecacaoHospitalSemSalasOcupadas() {
        try {
            Hospital relatorio = new Hospital();
            relatorio.getRelatorio();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Hospital sem salas ocupadas", e.getMessage());
        }
    }
}