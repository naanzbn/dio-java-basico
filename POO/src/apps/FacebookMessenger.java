package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet(); // só pede validação se pedir
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}