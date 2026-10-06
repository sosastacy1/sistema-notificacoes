void main(){

    Email email = new Email();
    String nomeRemetente = IO.readln("Digite seu Email: ");
    String mensagens= IO.readln("Digite a mensagem que quer enviar:  ");
    String envio = IO.readln("Para quem você vai enviar: ");
    email.enviar(mensagens,nomeRemetente,envio);

//    Sms sms = new Sms();
//    String numeroRemetente = IO.readln("Digite seu numero de telefone: ");
//    String mensagenss = IO.readln("Digite a mensagem que quer enviar: ");
//    String envioo= IO.readln("Para quem você vai enviar: ");
//    sms.enviar(mensagenss,numeroRemetente,envioo);
}