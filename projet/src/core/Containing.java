package core;

/**
 * To allow an insect to contain an other
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public interface Containing {

    /**
     * Ajoute l'insecte à contenir
     * @param ant à ajouter
     * @return si l'insecte à bien été ajouté ou non
     */
    boolean addContenantInsect(Ant ant);


    /**
     * Retire l'insecte contenu
     * @return si l'insecte a bien été retiré
     */
    boolean removeContenantInsect();


    /**
     * Renvoie l'insecte contenu
     * @return l'insecte contenu
     */
    Ant getContenantInsect();

}
