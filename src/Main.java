void main(){

    Email email = new Email();
    IO.println("");
    String nomeRemetente = IO.readln("Digite seu Email: ");
    String mensagens= IO.readln("Digite a mensagem que quer enviar:  ");
    String envio = IO.readln("Para quem você vai enviar: ");
    IO.println("Enviando...");
    email.enviar(mensagens,nomeRemetente,envio);
    IO.println("Enviado.");

    Sms sms = new Sms();
    IO.println("");
    String numeroRemetente = IO.readln("Digite seu numero de telefone: ");
    String mensagenss = IO.readln("Digite a mensagem que quer enviar: ");
    String envioo= IO.readln("Para quem você vai enviar: ");
    IO.println("Enviando...");
    sms.enviar(mensagenss,numeroRemetente,envioo);
    IO.println("Enviado.");

}