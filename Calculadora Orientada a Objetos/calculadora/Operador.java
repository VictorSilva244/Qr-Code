package calculadora;
import java.util.Scanner;


public class Operador{
  Calculadora calcular = new Calculadora();
  private float resultado = 0;
  private float num = 0;
  private String historico = "";
  private float temp = 0;
  Scanner scan = new Scanner(System.in); 
  
  public void coordenar(String x,String y){
    
    if(y.equals("+")){
      num = Float.valueOf(scan.next());
      resultado = calcular.somar(Float.valueOf(x),num);
      System.out.println(resultado);
      historico = historico + Float.valueOf(x) + " + " + num + " = " + resultado + "\n";
      
    } else if(x.equals("+")){
      temp = resultado;
      resultado = calcular.somar(Float.valueOf(y),resultado);
      System.out.println(resultado);
      historico = historico + temp + " + " + Float.valueOf(y) + " = " + resultado + "\n";
      
      
    } else if(y.equals("-")){
      num = Float.valueOf(scan.next());
      resultado = calcular.subtrair(Float.valueOf(x),num);
      System.out.println(resultado);
      historico = historico + Float.valueOf(x) + " - " + num + " = " + resultado + "\n";
      
    } else if(x.equals("-")){
      temp = resultado;
      resultado = calcular.subtrair(resultado,Float.valueOf(y));
      System.out.println(resultado);
      historico = historico + temp + " - " + Float.valueOf(y) + " = " + resultado + "\n";
      
    } else if(y.equals("*")){
      num = Float.valueOf(scan.next());
      resultado = calcular.multiplicar(Float.valueOf(x),num);
      System.out.println(resultado);
      historico = historico + Float.valueOf(x) + " * " + num + " = " + resultado + "\n";
      
    } else if(x.equals("*")){
      temp = resultado;
      resultado = calcular.multiplicar(resultado,Float.valueOf(y));
      System.out.println(resultado);
      historico = historico + temp + " * " + Float.valueOf(y) + " = " + resultado + "\n";
      
    } else if(y.equals("/")){
      num = Float.valueOf(scan.next());
      resultado = calcular.dividir(Float.valueOf(x),num);
      System.out.println(resultado);
      historico = historico + Float.valueOf(x) + " / " + num + " = " + resultado + "\n";
      
    } else if(x.equals("/")){
      temp = resultado;
      resultado = calcular.dividir(resultado,Float.valueOf(y));
      System.out.println(resultado);
      historico = historico + temp + " / " + Float.valueOf(y) + " = " + resultado + "\n";
      
    } else if(y.equals("^2")){
      resultado = calcular.ao_quadrado(Float.valueOf(x));
      System.out.println(resultado);
      historico = historico + Float.valueOf(x) + "^2 = " + resultado + "\n"; 

    } else if(y.equals("^3")){
      resultado = calcular.ao_cubo(Float.valueOf(x));
      System.out.println(resultado);
      historico = historico + Float.valueOf(x) + "^3 = " + resultado + "\n"; 

    } else if(x.equals("√")){
      resultado = calcular.raiz(Float.valueOf(y));
      System.out.println(resultado);
      historico = historico + "√" + Float.valueOf(y) + " = " + resultado + "\n"; 
      
    } else if(x.equals("3√")){
      resultado = calcular.raiz_cubica(Float.valueOf(y));
      System.out.println(resultado);
      historico = historico + "3√" + Float.valueOf(y) + " = " + resultado + "\n"; 

    } else if(x.equals("log")){
      resultado = calcular.logaritmo(Float.valueOf(y));
      System.out.println(resultado);
      historico = historico + "log " + Float.valueOf(y) + " = " + resultado + "\n"; 

    } 
  }
  
  public void historico(){
    System.out.println("-------------------------------------");
    System.out.println(historico);
  }
}
/*ta feio, mas não achei outro geito de organizar as entradas*/