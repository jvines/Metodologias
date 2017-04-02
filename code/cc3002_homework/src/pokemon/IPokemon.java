package pokemon;


// TODO: Auto-generated Javadoc
/**
 * The Interface IPokemon.
 *
 * @author JoseIgnacio
 */
public interface IPokemon extends IType {
  
  /**
   * Gets the hp.
   *
   * @return the hp
   */
  public int getHp();

  /**
   * Gets the current hp.
   *
   * @return the current hp
   */
  public int getCurrentHp();

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName();
  
  /**
   * Gets the move power.
   *
   * @return the move power
   */
  public int getMovePower();

  
  /**
   * Decrease hp.
   *
   * @param x the x
   */
  public void decreaseHp(int x);

  /**
   * Battle.
   *
   * @param p the p
   * @return true, if successful
   */
  public boolean battle(IPokemon p);
  
}
