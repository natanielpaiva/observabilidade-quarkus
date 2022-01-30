package observabilidade.exemplo;

import java.io.Serializable;

public class MinhaExcecao extends Exception implements Serializable
{
    private static final long serialVersionUID = 1L;

    public MinhaExcecao() {
        super();
    }
    public MinhaExcecao(String msg)   {
        super(msg);
    }
    public MinhaExcecao(String msg, Exception e)  {
        super(msg, e);
    }
}