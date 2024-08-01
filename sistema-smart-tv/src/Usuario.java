public class Usuario {
    public static void main(String[] args) throws Exception {

         SmarTv smarTv  = new SmarTv();


         System.out.println("TV Ligada ? "  + smarTv.ligada);
         System.out.println("Canal Atual : " + smarTv.canal);
         System.out.println("Volume Atual : " + smarTv.volume);

         smarTv.ligar ();
         System.out.println("Novo Status -> TV Ligada ? "  + smarTv.ligada);

         smarTv.desligar();
         System.out.println("Novo Status -> TV Ligada ? "  + smarTv.ligada);
      
         


        

         
        
    }
}
