public class MainElevador{

    public static void main (String[] args){
        Elevador elevador = new Elevador(0,10,0,true);
        elevador.subir();
        elevador.fecharPorta();
        elevador.descer();
        elevador.subir();
        elevador.abrirPorta();
        elevador.fecharPorta();
    }
}