package ProcessoSeletivo;

public class Main {
    public static void main(String[] args) {
        CandidatoService candidatoService = new CandidatoService();

        int valorSalarioBase = 2000;
        String[] candidatos = {"Felipe", "Marcia", " Julia", "Paulo", "Augusto", "Renato", "Ivo", "Pedro", "Caua"};

        candidatoService.chamarEntrevistados(candidatos, valorSalarioBase);
    }
}
