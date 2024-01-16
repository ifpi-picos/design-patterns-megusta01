

import enums.TipoNotificacao;


public class Follower implements Observer {
    private TipoNotificacao tipoNotificacao;
    private String nome;

    public TipoNotificacao getTipoNotificacao() {
        return tipoNotificacao;
    }


    public Follower(TipoNotificacao preferencia, String nome) {
        this.tipoNotificacao = preferencia;
        this.nome = nome;
    }

    @Override
    public void update(Post post) {
            System.out.println(nome + " - " + post.getNotificacao().toString() + " - " + post.getConteudo());
    }
}
