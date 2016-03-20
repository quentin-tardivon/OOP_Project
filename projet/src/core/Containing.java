package core;

/**
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public interface Containing {

    /**
     * Ajoute l'insecte à contenir
     * @param ant à ajouter
     * @return si l'insecte à bien été ajouté ou non
     */
    public boolean addContenantInsect(Ant ant);


    /**
     * Retire l'insecte contenu
     * @return si l'insecte a bien été retiré
     */
    public boolean removeContenantInsect();


    /**
     * Renvoie l'insecte contenu
     * @return l'insecte contenu
     */
    public Ant getContenantInsect();

}
