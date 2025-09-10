public class TestaEvento {
    public static void main(String[] args) {

        Evento e = new Evento("Simpósio de Educação");

        Participante p = new Participante();
        p.setNome("Paulo");

        e.cadastrarParticipante(p);

        e.exibirEvento();
    }
}
