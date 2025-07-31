package ProcessoSeletivo;

import java.util.concurrent.ThreadLocalRandom;

public class CandidatoService {

    private int valorPretendido() {
        return ThreadLocalRandom.current().nextInt(1000, 2500);
    }

    public void chamarEntrevistados(String[] candidatos, int salarioBase) {
        Integer candidatosSelecionados = 0;

        for (int i = 0; i < candidatos.length; i++) {
            if (candidatosSelecionados.equals(5)) break;

            Candidato candidato = new Candidato();
            candidato.setNomeCandidato(candidatos[i]);
            candidato.setSalarioPretendido(valorPretendido());

            System.out.printf("Candidato: %s Solicitou %d %n", candidato.getNomeCandidato(), candidato.getSalarioPretendido());
            if (candidato.salarioPretendido.equals(salarioBase) || candidato.salarioPretendido < salarioBase) {
                System.out.printf("Candidato %s selecionado %n", candidato.getNomeCandidato());
                candidatosSelecionados++;
            }
        }
    }
}
