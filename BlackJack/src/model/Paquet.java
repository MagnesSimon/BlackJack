package model;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Paquet 
{
	private static final int NB_ITERATIONS = 0;
	ArrayList<Carte> paquetCartes = new ArrayList<Carte>();
	
	/**
	 * Constructeur
	 */
	
	public Paquet()
	{
		// Les carreaux
		ImageIcon carte1 = new ImageIcon("img/1-carreau.jpg");
		Carte asCarreau = new Carte("carreaux", "as", 11, carte1);
		ImageIcon carte2 = new ImageIcon("img/2-carreau.jpg");
		Carte deuxCarreau = new Carte("carreaux", "deux", 2, carte2);
		ImageIcon carte3 = new ImageIcon("img/3-carreau.jpg");
		Carte troisCarreau = new Carte("carreaux", "trois", 3, carte3);
		ImageIcon carte4 = new ImageIcon("img/4-carreau.jpg");
		Carte quatreCarreau = new Carte("carreaux", "quatre", 4, carte4);
		ImageIcon carte5 = new ImageIcon("img/5-carreau.jpg");
		Carte cinqCarreau = new Carte("carreaux", "cinq", 5, carte5);
		ImageIcon carte6 = new ImageIcon("img/6-carreau.jpg");
		Carte sixCarreau = new Carte("carreaux", "six", 6, carte6);
		ImageIcon carte7 = new ImageIcon("img/7-carreau.jpg");
		Carte septCarreau = new Carte("carreaux", "sept", 7, carte7);
		ImageIcon carte8 = new ImageIcon("img/8-carreau.jpg");
		Carte huitCarreau = new Carte("carreaux", "huit", 8, carte8);
		ImageIcon carte9 = new ImageIcon("img/9-carreau.jpg");
		Carte neufCarreau = new Carte("carreaux", "neuf", 9, carte9);
		ImageIcon carte10 = new ImageIcon("img/10-carreau.jpg");
		Carte dixCarreau = new Carte("carreaux", "dix", 10, carte10);
		ImageIcon carte11 = new ImageIcon("img/11-carreau.jpg");
		Carte valetCarreau = new Carte("carreaux", "valet", 10, carte11);
		ImageIcon carte12 = new ImageIcon("img/12-carreau.jpg");
		Carte dameCarreau = new Carte("carreaux", "dame", 10, carte12);
		ImageIcon carte13 = new ImageIcon("img/13-carreau.jpg");
		Carte roiCarreau = new Carte("carreaux", "roi", 10, carte13);
		
		// Les coeur
		ImageIcon carte14 = new ImageIcon("img/1-coeur.jpg");
		Carte ascoeur = new Carte("coeur", "as", 11, carte14);
		ImageIcon carte15 = new ImageIcon("img/2-coeur.jpg");
		Carte deuxcoeur = new Carte("coeur", "deux", 2, carte15);
		ImageIcon carte16 = new ImageIcon("img/3-coeur.jpg");
		Carte troiscoeur = new Carte("coeur", "trois", 3, carte16);
		ImageIcon carte17 = new ImageIcon("img/4-coeur.jpg");
		Carte quatrecoeur = new Carte("coeur", "quatre", 4, carte17);
		ImageIcon carte18 = new ImageIcon("img/5-coeur.jpg");
		Carte cinqcoeur = new Carte("coeur", "cinq", 5, carte18);
		ImageIcon carte19 = new ImageIcon("img/6-coeur.jpg");
		Carte sixcoeur = new Carte("coeur", "six", 6, carte19);
		ImageIcon carte20 = new ImageIcon("img/7-coeur.jpg");
		Carte septcoeur = new Carte("coeur", "sept", 7, carte20);
		ImageIcon carte21 = new ImageIcon("img/8-coeur.jpg");
		Carte huitcoeur = new Carte("coeur", "huit", 8, carte21);
		ImageIcon carte22 = new ImageIcon("img/9-coeur.jpg");
		Carte neufcoeur = new Carte("coeur", "neuf", 9, carte22);
		ImageIcon carte23 = new ImageIcon("img/10-coeur.jpg");
		Carte dixcoeur = new Carte("coeur", "dix", 10, carte23);
		ImageIcon carte24 = new ImageIcon("img/11-coeur.jpg");
		Carte valetcoeur = new Carte("coeur", "valet", 10, carte24);
		ImageIcon carte25 = new ImageIcon("img/12-coeur.jpg");
		Carte damecoeur= new Carte("coeur", "dame", 10, carte25);
		ImageIcon carte26 = new ImageIcon("img/13-coeur.jpg");
		Carte roicoeur = new Carte("coeur", "roi", 10, carte26);
		
		// Les trèfles
		ImageIcon carte27 = new ImageIcon("img/1-trefle.jpg");
		Carte astrefle = new Carte("trefle", "as", 11, carte27);
		ImageIcon carte28 = new ImageIcon("img/2-trefle.jpg");
		Carte deuxtrefle = new Carte("trefle", "deux", 2, carte28);
		ImageIcon carte29 = new ImageIcon("img/3-trefle.jpg");
		Carte troistrefle = new Carte("trefle", "trois", 3, carte29);
		ImageIcon carte30 = new ImageIcon("img/4-trefle.jpg");
		Carte quatretrefle = new Carte("trefle", "quatre", 4, carte30);
		ImageIcon carte31 = new ImageIcon("img/5-trefle.jpg");
		Carte cinqtrefle = new Carte("trefle", "cinq", 5, carte31);
		ImageIcon carte32 = new ImageIcon("img/6-trefle.jpg");
		Carte sixtrefle = new Carte("trefle", "six", 6, carte32);
		ImageIcon carte33 = new ImageIcon("img/7-trefle.jpg");
		Carte septtrefle = new Carte("trefle", "sept", 7, carte33);
		ImageIcon carte34 = new ImageIcon("img/8-trefle.jpg");
		Carte huittrefle = new Carte("trefle", "huit", 8, carte34);
		ImageIcon carte35 = new ImageIcon("img/9-trefle.jpg");
		Carte neuftrefle = new Carte("trefle", "neuf", 9, carte35);
		ImageIcon carte36 = new ImageIcon("img/10-trefle.jpg");
		Carte dixtrefle = new Carte("trefle", "dix", 10, carte36);
		ImageIcon carte37 = new ImageIcon("img/11-trefle.jpg");
		Carte valettrefle = new Carte("trefle", "valet", 10, carte37);
		ImageIcon carte38 = new ImageIcon("img/12-trefle.jpg");
		Carte dametrefle = new Carte("trefle", "dame", 10, carte38);
		ImageIcon carte39 = new ImageIcon("img/13-trefle.jpg");
		Carte roitrefle = new Carte("trefle", "roi", 10, carte39);
		
		// Les piques
		ImageIcon carte40 = new ImageIcon("img/1-pique.jpg");
		Carte aspique = new Carte("pique", "as", 11, carte40);
		ImageIcon carte41 = new ImageIcon("img/2-pique.jpg");
		Carte deuxpique = new Carte("pique", "deux", 2, carte41);
		ImageIcon carte42 = new ImageIcon("img/3-pique.jpg");
		Carte troispique = new Carte("pique", "trois", 3, carte42);
		ImageIcon carte43 = new ImageIcon("img/4-pique.jpg");
		Carte quatrepique = new Carte("pique", "quatre", 4, carte43);
		ImageIcon carte44 = new ImageIcon("img/5-pique.jpg");
		Carte cinqpique = new Carte("pique", "cinq", 5, carte44);
		ImageIcon carte45 = new ImageIcon("img/6-pique.jpg");
		Carte sixpique = new Carte("pique", "six", 6, carte45);
		ImageIcon carte46 = new ImageIcon("img/7-pique.jpg");
		Carte septpique = new Carte("pique", "sept", 7, carte46);
		ImageIcon carte47 = new ImageIcon("img/8-pique.jpg");
		Carte huitpique = new Carte("pique", "huit", 8, carte47);
		ImageIcon carte48 = new ImageIcon("img/9-pique.jpg");
		Carte neufpique = new Carte("pique", "neuf", 9, carte48);
		ImageIcon carte49 = new ImageIcon("img/10-pique.jpg");
		Carte dixpique = new Carte("pique", "dix", 10, carte49);
		ImageIcon carte50 = new ImageIcon("img/11-pique.jpg");
		Carte valetpique = new Carte("pique", "valet", 10, carte50);
		ImageIcon carte51 = new ImageIcon("img/12-pique.jpg");
		Carte damepique = new Carte("pique", "dame", 10, carte51);
		ImageIcon carte52 = new ImageIcon("img/13-pique.jpg");
		Carte roipique = new Carte("pique", "roi", 10, carte52);

		// Ajout des carreaux au paquet
		paquetCartes.add(asCarreau);
		paquetCartes.add(deuxCarreau);
		paquetCartes.add(troisCarreau);
		paquetCartes.add(quatreCarreau);
		paquetCartes.add(cinqCarreau);
		paquetCartes.add(sixCarreau);
		paquetCartes.add(septCarreau);
		paquetCartes.add(huitCarreau);
		paquetCartes.add(neufCarreau);
		paquetCartes.add(dixCarreau);
		paquetCartes.add(valetCarreau);
		paquetCartes.add(dameCarreau);
		paquetCartes.add(roiCarreau);
		
		// Ajout des coeurs au paquet
		paquetCartes.add(ascoeur);
		paquetCartes.add(deuxcoeur);
		paquetCartes.add(troiscoeur);
		paquetCartes.add(quatrecoeur);
		paquetCartes.add(cinqcoeur);
		paquetCartes.add(sixcoeur);
		paquetCartes.add(septcoeur);
		paquetCartes.add(huitcoeur);
		paquetCartes.add(neufcoeur);
		paquetCartes.add(dixcoeur);
		paquetCartes.add(valetcoeur);
		paquetCartes.add(damecoeur);
		paquetCartes.add(roicoeur);
		
		// Ajout des trèfles au paquet
		paquetCartes.add(astrefle);
		paquetCartes.add(deuxtrefle);
		paquetCartes.add(troistrefle);
		paquetCartes.add(quatretrefle);
		paquetCartes.add(cinqtrefle);
		paquetCartes.add(sixtrefle);
		paquetCartes.add(septtrefle);
		paquetCartes.add(huittrefle);
		paquetCartes.add(neuftrefle);
		paquetCartes.add(dixtrefle);
		paquetCartes.add(valettrefle);
		paquetCartes.add(dametrefle);
		paquetCartes.add(roitrefle);
		
		// Ajout des piques au paquet
		paquetCartes.add(aspique);
		paquetCartes.add(deuxpique);
		paquetCartes.add(troispique);
		paquetCartes.add(quatrepique);
		paquetCartes.add(cinqpique);
		paquetCartes.add(sixpique);
		paquetCartes.add(septpique);
		paquetCartes.add(huitpique);
		paquetCartes.add(neufpique);
		paquetCartes.add(dixpique);
		paquetCartes.add(valetpique);
		paquetCartes.add(damepique);
		paquetCartes.add(roipique);
	}
	
}
