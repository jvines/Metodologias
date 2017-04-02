package pokemon.Pokemon_classes;

import pokemon.AbstractPokemon;
import pokemon.IPokemon;
import pokemon.IType;
import pokemon.Type_classes.Water;

// TODO: Auto-generated Javadoc
/**
 * The Class Squirtle.
 */
public class Squirtle extends AbstractPokemon implements IType {

  /**
   * Instantiates a new squirtle.
   */
  public Squirtle() {
    name = "Squirtle";
    hp = 100;
    damage = 0;
    move_power = 30;
    type = new Water();
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
    p.weakAgainstWater(this);
  }


  @Override
  public void weakAgainstGrass(IPokemon o) {
    this.decreaseHp(o.getMovePower() * 2);

  }


  @Override
  public void weakAgainstFire(IPokemon o) {
    this.decreaseHp(o.getMovePower() - 20);
  }


  @Override
  public void weakAgainstWater(IPokemon o) {
    this.decreaseHp(o.getMovePower());
  }


  @Override
  public void weakAgainstElectric(IPokemon o) {
    this.decreaseHp(o.getMovePower() * 2);
  }


  @Override
  public void weakAgainstGround(IPokemon o) {
    this.decreaseHp(o.getMovePower());
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
