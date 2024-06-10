
public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada?" + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status ligada?" + smartTv.ligada);
        smartTv.desligar();
        System.out.println("novo status ligada?" + smartTv.ligada);

        smartTv.aumentar();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.aumentar();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.diminuir();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.diminuir();
        smartTv.diminuir();
        smartTv.diminuir();
        System.out.println("Volume atual:" + smartTv.volume);
        System.out.println("Canal atual:" + smartTv.canal);

        smartTv.avancarCanal();
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.voltarCanal();
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Canal atual:" + smartTv.canal);
    }
}
