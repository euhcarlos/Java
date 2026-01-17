public class Cliente {

    private int codigo;

    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String endereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }


    /**
     *
     * @param valor
     * @return
     * @deprecated
     * @see String getNomeValor(String valor)
     */
    public String getNomeValor(String valor){
        return valor;
    }
}
