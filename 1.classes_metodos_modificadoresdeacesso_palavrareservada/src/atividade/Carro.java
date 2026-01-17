package atividade;

public class Carro {

    private String cor;

    private String marca;

    private String modelo;


    /**
     *
     * @return cor do veículo
     */
    public String getCor(){
        return cor;
    }

    /**
     *
     * @param cor do veiculo
     */
    public void setCor(String cor){
        this.cor = cor;
    }

    /**
     *
     * @return modelo do carro
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo do carro
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    /**
     *
     * @return marca do carro
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca do carro
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
