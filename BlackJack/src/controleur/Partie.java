package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import vue.*;

public class Partie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcranAccueil home = new EcranAccueil();
		Regles ecranRegles = new Regles();
		home.getBoutonStart().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BlackjackGUI jeu = new BlackjackGUI();
				jeu.lancerJeu();
				home.fermerFenetre();
				ecranRegles.dispose();
			}
		});
	}

}
