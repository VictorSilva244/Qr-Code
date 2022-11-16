package calculadora;

import java.util.Scanner;

  public class Ligar{

  private String x = "";
  private String y;
    Scanner scan = new Scanner(System.in); 
    Operador n = new Operador();
    
    public void ligar(){
      while(true){   
        System.out.println("----------------------------------");
        System.out.println("digite a operação:");
        x = scan.next();
        if(x.equals("historico")){
          n.historico();
        } else if(x.equals("exit")){
          break;
        } else {
        y = scan.next();
        n.coordenar(x,y);
        }
      }
    }
  }