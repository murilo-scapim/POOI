import java.time.LocalDate;
import java.time.LocalTime;

public class TestaEvento {
    public static void main(String[] args) {

        Evento e = new Evento("Simpósio de Educação");
        e.setTipo(TipoEvento.SIMPOSIO);
        e.setLocal("FAFRAM");
        e.setData(LocalDate.of(2025, 9, 12));
        e.setHoraInicio(LocalTime.of(13, 30));

        Participante p1 = new Participante();
        p1.setNome("Paulo");
        p1.setEmail("paulo@sou.fafram.com.br");
        p1.setInstituicao("FAFRAM");

        e.cadastrarParticipante(p1);

        Participante p2 = new Participante();
        p2.setNome("Sofia");
        p2.setEmail("sofia@sou.fafram.com.br");
        p2.setInstituicao("FAFRAM");

        e.cadastrarParticipante(p2);

        Participante p3 = new Participante();
        p3.setNome("Matheus");
        p3.setEmail("matheus@sou.fafram.com.br");
        p3.setInstituicao("FAFRAM");

        e.cadastrarParticipante(p3);

        e.exibirEvento();

        e.removerParticipantePorEmail(p3.getEmail());

        e.exibirEvento();
    }
}
