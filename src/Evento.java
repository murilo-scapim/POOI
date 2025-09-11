import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Evento {
    private String descricao;
    private TipoEvento tipo;
    private String local;
    private LocalDate data;
    private LocalTime horaInicio;
    private ArrayList<Participante> participantes;

    public Evento(String descricao) {
        this.descricao = descricao;
        this.participantes = new ArrayList<>();
    }

    public void cadastrarParticipante(Participante p) {
        this.participantes.add(p);
    }

    public void exibirEvento() {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("---- Dados do evento ----");
        System.out.println("Descrição: " + descricao);
        System.out.println("Tipo: " + tipo);
        System.out.println("Local: " + local);
        System.out.println("Data: " + data.format(formatoData));
        System.out.println("Hora de início: " + horaInicio.format(formatoHora));
        System.out.println("Participantes:");

        if (participantes.isEmpty()) {
            System.out.println("Não existe participantes registrados!");
        } else {
            for (Participante p : participantes) {
                System.out.println("Nome: " + p.getNome());
                System.out.println("E-mail: " + p.getEmail());
                System.out.println("Instituição: " + p.getInstituicao());
                System.out.println();
            }
        }
    }

    public void removerParticipantePorEmail(String email) {
        boolean removido = participantes.removeIf(p -> p.getEmail()
                .equalsIgnoreCase(email));

        if (removido) {
            System.out.println("Participante removido com sucesso!");
        } else {
            System.out.println("Participante não removido!");
        }
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Participante> getParticipantes() {
        return this.participantes;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }
}

