package pokemon.Pokemon_classes;

import pokemon.AbstractPokemon;
import pokemon.IPokemon;
import pokemon.Type_classes.Electric;

// TODO: Auto-generated Javadoc
/**
 * The Class Pikachu.
 */
/**
 * @author JoseIgnacio
 *
 */
public class Pikachu extends AbstractPokemon implements IPokemon {

  /**
   * Instantiates a new pikachu.
   */
  public Pikachu() {
    name = "Pikachu";
    hp = 100;
    damage = 0;
    move_power = 30;
    type = new Electric();
  }

  /*
   * (non-Javadoc)
   * 
   * @see pokemon.IPokemon#battle(pokemon.IPokemon)
   */
  @Override
  public void battle(IPokemon p) {
    if (!this.canBattle()) {
      return;
    }
    p.weakAgainstElectric(this);
  }

  @Override
  public void weakAgainstGrass(IPokemon o) {
    this.decreaseHp(o.getMovePower());
  }

  @Override
  public void weakAgainstFire(IPokemon o) {
    this.decreaseHp(o.getMovePower());
  }

  @Override
  public void weakAgainstWater(IPokemon o) {
    this.decreaseHp(o.getMovePower() * 2);
  }

  @Override
  public void weakAgainstElectric(IPokemon o) {
    this.decreaseHp(o.getMovePower());
  }

  @Override
  public void weakAgainstGround(IPokemon o) {
    this.decreaseHp(o.getMovePower() * 2);
  }

  @Override
  public void weakAgainstPsychic(IPokemon o) {
    this.decreaseHp(o.getMovePower());
  }

  @Override
  public void weakAgainstFighting(IPokemon o) {
    this.decreaseHp(o.getMovePower());
  }

  @Override
  public void weakAgainstNormal(IPokemon o) {
    this.decreaseHp(o.getMovePower());
  }


}
