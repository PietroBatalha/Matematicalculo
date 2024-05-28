public class Main {
  public static void main(String[] args)
  
  {   System.out.println("Uma tv de 200 watts fica ligada diariamente aproximadamente a 5horas, consumo elétrico mensal será de:");
  System.out.println("");
  System.out.println("Considerado que a potencia é 200 e é ligada 5 horas diariamente.");
System.out.println("");
int potencia = 200;

System.out.println("potência:");

System.out.println(potencia);

int tempo = 5;

System.out.println("tempo ligada:");
   
System.out.println(tempo);
   System.out.println("");
   System.out.println("fazemos o seguinte cálculo");
   

System.out.println("");

System.out.println("200 x 5 = 1000");

System.out.println("");

int diario = potencia * tempo;
              
System.out.println("dando um resultado diário de:");    
System.out.println("");
System.out.println("1000 x 30 = 30000");
System.out.println("");
int mes = 30;
int gastomensal = diario * mes;
System.out.println("o gasto mensal em watts será:");
System.out.println(gastomensal);

System.out.println("*");
System.out.println("30000/1000");
System.out.println("");
int kwh = 1000;
System.out.println("transformando em forma KWH ficará:");
int transformado = gastomensal/kwh;
System.out.println(transformado);
System.out.println("");
System.out.println("Resultando:30KWH");
  }

}
  

      

