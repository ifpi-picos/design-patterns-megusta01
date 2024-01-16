import enums.TipoNotificacao;

public class Post {
    private String conteudo;
    private TipoNotificacao notificacao;

    public Post(String conteudo, TipoNotificacao notificacao) {
        this.conteudo = conteudo;
        this.notificacao = notificacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public TipoNotificacao getNotificacao() {
        return notificacao;
    }
}
