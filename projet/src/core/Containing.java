package core;

/**
 * Created by quentin on 01/03/16.
 */
public interface Containing {

    /**
     * Ajoute l'insecte à contenir
     * @param insect à ajouter
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
