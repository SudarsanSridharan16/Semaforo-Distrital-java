public class SistemaSemaforo {

    public static void main(String[] args) {
        semaforosDistrital t = new semaforosDistrital();
        SemaforoNorteSur sema1 = new SemaforoNorteSur(t);
        SemaforoEsteOeste sema2 = new SemaforoEsteOeste(t);
       
      System.out.println("&&&&&&&&&&&&&&&Programacion&&&&&&&&&&&&&&&&&");
	  System.out.println("                                            ");
	  System.out.println("        Jeffry Gonzalez Garcia              ");
	  System.out.println("                                            ");
	  System.out.println("                                ID: 20093292");
	  System.out.println("                                            ");
	  System.out.println("                                            ");
	  System.out.println("                   The Nigger Soft company  ");
	  System.out.println("                                  CopyRight ");  
      System.out.println("Sistema de semaforo distrital               ");
	  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	  
	  
	   System.out.println("                                            ");
	  
	  

   	   sema1.start();
       sema2.start();

    }
}