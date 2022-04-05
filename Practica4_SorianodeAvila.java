import java.util.Random;
import java.util.Scanner;

class mexicano {

   public String nombre;
   public String apepat;
   public String apemat;
   public long RFC;
   public long CURP;
   public int  dianac;
   public int  mesnac;
   public int  yearnac;
   public String  genero;
   public String estado;

}

public class Main{
   static Scanner sc = new Scanner(System.in);
   static Scanner scn = new Scanner(System.in);
   static Scanner scnr = new Scanner(System.in);
   
   
   public static void main(String[] args) {

     Random random = new Random();

     int valor1 = random.nextInt(9 - 1) + 1;
     
     int valor2 = random.nextInt(9 - 1) + 1;
       int valor3 = random.nextInt(9 - 1) + 1;
     

       mexicano m1 = new mexicano();
       mexicano m2 = new mexicano();   
       mexicano m3 = new mexicano();   
       
       System.out.println( "OBJETO 1");
       System.out.println( "Ingrese su nombre: ");
       m1.nombre = sc.nextLine();
       System.out.println( "Ingrese su apellido paterno: ");
       m1.apepat = sc.nextLine();
       System.out.println( "Ingrese su apellido materno: ");
       m1.apemat = sc.nextLine();
       System.out.println( "Ingrese su genero(H o M): ");
       m1.genero = sc.nextLine();
       System.out.println( "Ingrese el estado de nacimiento: ");
       m1.estado = sc.nextLine();
       System.out.println( "Ingrese su dia de nacimiento: ");
       m1.dianac = sc.nextInt();
       System.out.println( "Ingrese su mes de nacimiento: ");
       m1.mesnac = sc.nextInt();
       System.out.println( "Ingrese su year de nacimiento: ");
       m1.yearnac = sc.nextInt();
       
       
       System.out.print( "CURP: ");

       System.out.print( ""+m1.apepat.charAt(0)+"");
       System.out.print( ""+m1.apepat.charAt(1)+"");
       System.out.print( ""+m1.apemat.charAt(0)+"");
       System.out.print( ""+m1.nombre.charAt(0)+"");
       System.out.print( ""+m1.yearnac+"");
       System.out.print( ""+m1.mesnac+"");
       System.out.print( ""+m1.dianac+"");
       System.out.print( ""+m1.genero.charAt(0)+"");
       System.out.print( ""+m1.estado.charAt(0)+"");
       System.out.print( ""+m1.estado.charAt(4)+"");
       System.out.print( ""+m1.apepat.charAt(2)+"");
       System.out.print( ""+m1.apemat.charAt(1)+"");
       System.out.print( ""+m1.nombre.charAt(1)+"");
       System.out.print(valor1);
       System.out.print(valor2);
       System.out.print("\n");
       
       //////////////////////////////////////////////
       
       System.out.println( "\nOBJETO 2 ");
       System.out.println( "Ingrese su nombre: ");
       m2.nombre = scn.nextLine();
       System.out.println( "Ingrese su apellido paterno: ");
       m2.apepat = scn.nextLine();
       System.out.println( "Ingrese su apellido materno: ");
       m2.apemat = scn.nextLine();
       System.out.println( "Ingrese su dia de nacimiento: ");
       m2.dianac = scn.nextInt();
       System.out.println( "Ingrese su mes de nacimiento: ");
       m2.mesnac = scn.nextInt();
       System.out.println( "Ingrese su year de nacimiento: ");
       m2.yearnac = scn.nextInt();
       
 
       System.out.println( "RFC: ");

       System.out.print( ""+m2.apepat.charAt(0)+"");
       System.out.print( ""+m2.apepat.charAt(1)+"");
       System.out.print( ""+m2.apemat.charAt(0)+"");
       System.out.print( ""+m2.nombre.charAt(0)+"");
       System.out.print( ""+m2.yearnac+"");
       System.out.print( ""+m2.mesnac+"");
       System.out.print( ""+m2.dianac+"");
       System.out.print(valor1);
       System.out.print(valor2);
       System.out.println(valor3);
       
///////////////////////////////////////////////////////////////

       System.out.println( "\nOBJETO 3");
       System.out.println( "Ingrese su nombre: ");
       m3.nombre = scnr.nextLine();
       System.out.println( "Ingrese su apellido paterno: ");
       m3.apepat = scnr.nextLine();
       System.out.println( "Ingrese su apellido materno: ");
       m3.apemat = scnr.nextLine();
       System.out.println( "Ingrese su genero(H o M): ");
       m3.genero = scnr.nextLine();
       System.out.println( "Ingrese el estado de nacimiento: ");
       m3.estado = scnr.nextLine();
       System.out.println( "Ingrese su dia de nacimiento: ");
       m3.dianac = scnr.nextInt();
       System.out.println( "Ingrese su mes de nacimiento: ");
       m3.mesnac = scnr.nextInt();
       System.out.println( "Ingrese su year de nacimiento: ");
       m3.yearnac = scnr.nextInt();
       
       
       System.out.print( "CURP: ");

       System.out.print( ""+m3.apepat.charAt(0)+"");
       System.out.print( ""+m3.apepat.charAt(1)+"");
       System.out.print( ""+m3.apemat.charAt(0)+"");
       System.out.print( ""+m3.nombre.charAt(0)+"");
       System.out.print( ""+m3.yearnac+"");
       System.out.print( ""+m3.mesnac+"");
       System.out.print( ""+m3.dianac+"");
       System.out.print( ""+m3.genero.charAt(0)+"");
       System.out.print( ""+m3.estado.charAt(0)+"");
       System.out.print( ""+m3.estado.charAt(4)+"");
       System.out.print( ""+m3.apepat.charAt(2)+"");
       System.out.print( ""+m3.apemat.charAt(1)+"");
       System.out.print( ""+m3.nombre.charAt(1)+"");
       System.out.print(valor1);
       System.out.print(valor2);
       System.out.print("\n");
       
       System.out.println( "RFC: ");

       System.out.print( ""+m3.apepat.charAt(0)+"");
       System.out.print( ""+m3.apepat.charAt(1)+"");
       System.out.print( ""+m3.apemat.charAt(0)+"");
       System.out.print( ""+m3.nombre.charAt(0)+"");
       System.out.print( ""+m3.yearnac+"");
       System.out.print( ""+m3.mesnac+"");
       System.out.print( ""+m3.dianac+"");
       System.out.print(valor1);
       System.out.print(valor2);
       System.out.println(valor3);
   }
}