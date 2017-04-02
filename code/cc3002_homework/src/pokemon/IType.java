package pokemon;

// TODO: Auto-generated Javadoc
/**
 * The Interface IType.
 */
public interface IType {
  
  /**
   * Weak against grass.
   *
   * @param o the o
   */
  public void weakAgainstGrass(IPokemon o);

  /**
   * Weak against fire.
   *
   * @param o the o
   */
  public void weakAgainstFire(IPokemon o);

  /**
   * Weak against water.
   *
   * @param o the o
   */
  public void weakAgainstWater(IPokemon o);

  /**
   * Weak against electric.
   *
   * @param o the o
   */
  public void weakAgainstElectric(IPokemon o);

  /**
   * Weak against ground.
   *
   * @param o the o
   */
  public void weakAgainstGround(IPokemon o);

  /**
   * Weak against psychic.
   *
   * @param o the o
   */
  public void weakAgainstPsychic(IPokemon o);

  /**
   * Weak against fighting.
   *
   * @param o the o
   */
  public void weakAgainstFighting(IPokemon o);

  /**
   * Weak against normal.
   *
   * @param o the o
   */
  public void weakAgainstNormal(IPokemon o);
}
