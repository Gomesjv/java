public class MainElevador{

    public static void main (String[] args){
        Elevador elevador = new Elevador(0,10,0,true);
        elevador.subir();
        elevador.statusPorta(); 
        elevador.fecharPorta();
        elevador.statusPorta(); 
        elevador.statusPorta(); 
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.statusPorta();
        elevador.descer();
        elevador.statusPorta(); 
        elevador.abrirPorta();
        elevador.statusPorta(); 
        elevador.fecharPorta();
        elevador.statusPorta(); 

    }   
}