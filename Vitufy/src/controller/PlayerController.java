package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import model.Musica;

public class PlayerController {

	public PlayerController() {
		super();
	}

	
	public void adicionaMusica(Lista lista, String musica) throws Exception{
		String[] music = musica.split(";");
		Musica aux = new Musica(music[0], music[1], Integer.parseInt(music[2]));
		if(lista.isEmpty()) {
		lista.addFirst(aux);
	}else {
		lista.addLast(aux);
	}
	}
	
	public void removeMusica(Lista lista, int posicao) throws Exception {
		if(lista.isEmpty()) {
			System.err.println("Playlist vazia");
		}else {
			System.out.println(lista.get(posicao)+" foi removida da PlayList");
			lista.remove(posicao);	
		}
	}
	
	public void executaPlaylist(Lista lista) throws Exception {
		if(lista.isEmpty()) {
			System.err.println("Playlist vazia");	
		}else {
		while(!lista.isEmpty()) {
			String music = lista.get(0).toString();
			System.out.println(music);
			String[] duracao = music.split(":");
			music = duracao[3];
			duracao = music.split(" ]");
			lista.removeFirst();
			Thread.sleep((long) 100000*Integer.parseInt(duracao[0]));
		}
		}
	}
	
}
