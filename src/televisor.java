//ABSTRACCION
public abstract class televisor {
    //Atributos
    private String Color, Marca;
    private int Tamaño;
    private boolean Decodificador;

    //Metodos
    public void Encender() {
        System.out.println("Televisor encendido");
    }

    public void Apagar() {
        System.out.println("Televisor apagado");
    }

    public void CambiarCanal(int canal) {
        System.out.println("Cambio de canal: " + canal);
    }
    //ENCAPSULAMIENTO

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public boolean getDecodificador() {
        return Decodificador;
    }

    public void setDecodificador(boolean Decodificador) {
        this.Decodificador = Decodificador;
    }

    public void itsNew(boolean someWord) {

    }

    public void hola(boolean hola1){}

}