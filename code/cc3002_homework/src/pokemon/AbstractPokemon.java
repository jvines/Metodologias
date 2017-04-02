package pokemon;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractPokemon.
 */
/**
 * @author Jose Ignacio
 *
 */

public abstract class AbstractPokemon implements IType, IPokemon {

  /** The name of the pokemon. */
  protected String name;

  /** The total hp of the pokemon. */
  protected int hp;

  /** The damage received by the pokemon. hp-damage is the remaining hp of the pokemon */
  protected int damage;

  /** The pokemon's type. */
  protected IType type;

  /** The pokemon's move power. */
  protected int move_power;

  /*
   * (non-Javadoc)
   * 
   * @see pokemon.IPokemon#getHp()
   */
  public int getHp() {
    return hp;
  }
  
  /* (non-Javadoc)
   * @see pokemon.IPokemon#getCurrentHp()
   */
  public int getCurrentHp() {
    // TODO Auto-generated method stub
    return hp - damage;
  }

  /* (non-Javadoc)
   * @see pokemon.IPokemon#getName()
   */
  public String getName() {
    // TODO Auto-generated method stub
    return name;
  }
  
  public int getMovePower() {
    return move_power;
  }

  /*
   * (non-Javadoc)
   * 
   * @see pokemon.IPokemon#getType()
   */
  public IType getType() {
    return type;
  }

  /**
   * Decreases the pokemon's hp by adding the received damage to the damage counter.
   *
   * @param x the damage received
   */
  public void decreaseHp(int x) {
    damage += x;
  }

  /**
   * Can battle.
   *
   * @return true, if the pokemon can still battle
   */
  public boolean canBattle() {
    return !(damage >= hp);
  }
}
