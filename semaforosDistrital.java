public class semaforosDistrital{

int contador = 0;

 public synchronized void sema01(){
 
    while (contador <= 0){
		  
		  for (int c1 = 30; c1 > 5; c1--) {
                System.out.println("Semaforos Norte-Sur en verde " + c1 + " Segundos");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
		   System.out.println("");
		   
		   for (int j1 = 5; j1 > 0; j1--) {
                System.out.println("Semaforos Norte-Sur en amarillo " + j1 + " Segundos");

                try {
                    Thread.sleep(1000);


                } catch (InterruptedException e) {
                }
            }
		  
		    System.out.println("");
			
			System.out.println("Semaforos Norte-Sur en Rojo ");
			
			System.out.println("");

            try {
                wait();



            } catch (InterruptedException e) {
            }

            contador--;
		  
		  }
  
 }



 public synchronized void sema02() {


        for (int t1 = 30; t1 > 5; t1--) {
            System.out.println("Semaforos Este-Oeste en verde " + t1 + " Segundos");


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

           System.out.println("");
		   
        for (int t1 = 5; t1 > 0; t1--) {
            System.out.println("Semaforos Este-Oeste en amarillo " + t1 + " Segundos");

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
            }

        }
       
	   System.out.println("");
	   
        System.out.println("Semaforos Este-Oeste  en rojo");
		
		System.out.println("");


        contador--;
        notify();

    }




}