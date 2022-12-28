//POLIMORFISMO
public abstract class figura {
    public abstract float area();
}
class circulo extends figura{
    float radio;
    @Override
    public float area() {
        return radio *(float)(Math.PI*Math.PI);
    }
}
class cuadrado extends figura{
    float lado;
    @Override
    public float area() {
        return lado * lado;
    }

}