package controldelflujo;
	import java.util.Scanner;
public class Triangulos {
 
   public static void main(String[] args) {
     
       Scanner ang1 = new Scanner(System.in);
       Scanner ang2 = new Scanner(System.in);
       Scanner ang3 = new Scanner(System.in);
       
       
       System.out.print("Introduzca el angulo del lado numero 1:");
       int l1 = (int) ang1.nextDouble();
       System.out.print("Introduzca el angulo del lado numero 2:");
       int l2 = (int) ang2.nextDouble();
       System.out.print("Introduzca el angulo del lado numero 2:");
       int l3 = (int) ang3.nextDouble();
       
       double total= l1 + l2 + l3;
             
    String mensaje = "";
	if(total == 180) {
		mensaje = "La suma de los angulos corresonde"
				+ "a un triangulo";
	} else {
		mensaje = "La suma de los angulos no corresonde"
				+ "a un triangulo";
	}
   }
}
