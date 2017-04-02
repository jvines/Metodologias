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

  public Squirtle(String name, int hp, int move_power) {
    this.name = name;
    this.hp = hp;
    this.move_power = move_power;
    damage = 0;
    type = new Water();
  }
  
  public Squirtle(String name) {
    this(name, 130, 30);
  }

  public Squirtle() {
    this("Squirtle", 130, 30);
  }


  /*
   * (non-Javadoc)
   * 
   * @see pokemon.IPokemon#battle(pokemon.IPokemon)
   */
  @Override
  public boolean battle(IPokemon p) {
    if (!this.canBattle()) {
      return false;
    }
    p.weakAgainstWater(this);
    return true;
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
