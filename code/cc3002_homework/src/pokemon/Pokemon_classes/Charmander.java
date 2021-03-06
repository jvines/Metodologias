package pokemon.Pokemon_classes;

import pokemon.AbstractPokemon;
import pokemon.IPokemon;
import pokemon.IType;
import pokemon.Type_classes.Fire;

// TODO: Auto-generated Javadoc
/**
 * The Class Charmander.
 */
public class Charmander extends AbstractPokemon implements IType {

  /**
   * Instantiates a new charmander.
   */
  public Charmander(String name, int hp, int move_power) {
    this.name = name;
    this.hp = hp;
    this.move_power = move_power;
    damage = 0;
    type = new Fire();
  }
  
  public Charmander(String name) {
    this(name, 130, 30);
  }

  public Charmander() {
    this("Charmander", 130, 30);
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
    p.weakAgainstFire(this);
    return true;
  }

  @Override
  public void weakAgainstGrass(IPokemon o) {
    this.decreaseHp(o.getMovePower() - 20);
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
