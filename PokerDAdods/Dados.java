import java.util.ArrayList;

public class Dados {
    int id;
    int valor = 0;
    String cara;
    String ndado;

    public Dados(int id, int valor, String cara) {
        this.id = id;
        this.valor = valor;
        this.cara = cara;
    }

    public Dados(String ndado) {
        this.ndado = ndado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public String getNdado() {
        return ndado;
    }

    public void setNdado(String ndado) {
        this.ndado = ndado;
    }
}