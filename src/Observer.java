import enums.TipoNotificacao;

public interface Observer {
    public void update(Post post);

    public TipoNotificacao getTipoNotificacao();
}