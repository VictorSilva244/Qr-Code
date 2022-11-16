package calculadora;


public class Calculadora{

  public float somar(float num1,float num2){
    return num1 + num2;
  }
  public float multiplicar(float num1,float num2){
    return num1 * num2;
  }
  public float subtrair(float num1,float num2){
    return num1 - num2;
  }
  public float dividir(float num1,float num2){
    return num1 / num2;
  }
  public float ao_quadrado(float num1){
    return num1 * num1;
  }
  public float ao_cubo(float num1){
    return num1 * num1 * num1;
  }
  public float raiz(float num1){
    return (float) Math.sqrt(num1);
  }
  public float raiz_cubica(float num1){
    return (float) Math.cbrt(num1);
  }
  public float logaritmo(float num1){
    return (float) Math.log(num1);
  }

}