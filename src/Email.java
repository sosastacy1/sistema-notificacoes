public class Email implements Notificador{

    @Override
    public void enviar(String mensagem, String De, String Para) {
        IO.println(De +  " enviou para "  + Para + ": " + mensagem);
    }
}
