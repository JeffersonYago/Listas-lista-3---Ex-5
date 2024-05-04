package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.lista.listaObj.Lista;
import controller.PlayerController;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		PlayerController pc = new PlayerController();
		int opc = 0;
		while(opc !=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar m�sica\n2- Remover m�sica\n3- Tocar Playlist\n9- Sair"));
			switch(opc){
			case 1:
					String nome = JOptionPane.showInputDialog("insira o nome da m�sica");
					String nomeartista = JOptionPane.showInputDialog("insira o nome do(a) artista");
					int duracao = Integer.parseInt(JOptionPane.showInputDialog("Insira a dura��o da M�sica"));
					String music = nome+";"+nomeartista+";"+duracao;
					pc.adicionaMusica(lista,music);	
					break;
			case 2: 
					int posicao = Integer.parseInt(JOptionPane.showInputDialog("insira a posi��o da m�sica que deseja remover"));
					pc.removeMusica(lista, posicao);
					break;
			case 3:
					pc.executaPlaylist(lista);
			}
		}
	}
}
