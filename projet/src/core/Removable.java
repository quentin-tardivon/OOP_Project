package core;

/**
 * To describe if an insect is removable or not
 *
 * @author Quentin TARDIVON, Maxime ESCAMEZ
 */
public interface Removable {

    /**
     *
     * @return if the insect is removable
     */
    boolean isRemovable();

    /**
     *
     * @param isRemovable Set if the insect is removable
     */
    void setRemovable(boolean isRemovable);

}
