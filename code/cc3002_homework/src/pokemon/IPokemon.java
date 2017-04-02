package pokemon;

// TODO: Auto-generated Javadoc
/**
 * The Interface IPokemon.
 */
public interface IPokemon extends IType {
  
  /**
   * Gets the hp.
   *
   * @return the total hp of the pokemon
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
  
  public int getMovePower();

  /**
   * Gets the type.
   *
   * @return the type
   */
  public IType getType();
  
  public void decreaseHp(int x);
  
  /**
   * Battle.
   *
   * @param p the p
   */
  public void battle(IPokemon p);
  
}
