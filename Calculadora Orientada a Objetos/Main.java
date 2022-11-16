import calculadora.Ligar;

class Main {
  public static void main(String[] args) {
    Ligar calc = new Ligar();
    calc.ligar();
  }
}

/*
  Modo de uso:
  Cada elemento deve ser separado por (enter) um do outro.
  Por exemplo: 7 (enter) + (enter) 8 (enter).
  Caso a primeira entrada for uma operação (+,-,*,/) e a segunda for um numero, o programa vai utilizar o resultado da conta anterior. Nas entradas "+" e "9", o programa vai utilizar o resultado anterior e somar com 9.
  Ao digitar "historico" quando o programa pedir uma operação ele vai imprimir todas as contas até agora.
  ao digitar "exit" quando o programa pedir uma operação você encerra o programa.
*/