package org.lessons.java.christmas;

public class Regalo {
	private String nomeRegalo;
	private String destinatario;
	
	public Regalo(String nomeRegalo, String destinatario) {
			setNomeRegalo(nomeRegalo);
			setDestinatario(destinatario);
		}
	
	public String getNomeRegalo() {
		return nomeRegalo;
	}

	public void setNomeRegalo(String nomeRegalo) {
		this.nomeRegalo = nomeRegalo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	@Override
	public String toString() {
		return "------------------------------------- \n"
				+ "Regalo: " + "\n"
				+ "Nome: " + getNomeRegalo() + "\n"
				+ "Destinatario:" + getDestinatario();
	}
}
