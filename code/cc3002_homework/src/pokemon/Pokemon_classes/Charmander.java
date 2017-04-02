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
  public Charmander() {
    name = "Charmander";
    hp = 100;
    damage = 0;
    move_power = 30;
    type = new Fire();
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
    p.weakAgainstFire(this);
  }

  @Override
  public void weakAgainstGrass(IPokemon o) {
    // TODO Auto-generated method stub
    System.out.println("Not very effective..");
    this.decreaseHp(o.getMovePower() - 20);
  }

  @Override
  public void weakAgainstFire(IPokemon o) {
    // TODO Auto-generated method stub
    this.decreaseHp(o.getMovePower());

  }

  @Override
  public void weakAgainstWater(IPokemon o) {
    // TODO Auto-generated method stub
    this.decreaseHp(o.getMovePower() * 2);

  }

  @Override
  public void weakAgainstElectric(IPokemon o) {
    // TODO Auto-generated method stub
    this.decreaseHp(o.getMovePower());

  }

  @Override
  public void weakAgainstGround(IPokemon o) {
    // TODO Auto-generated method stub
    this.decreaseHp(o.getMovePower() * 2);

  }

  @Override
  public void weakAgainstPsychic(IPokemon o) {
    // TODO Auto-generated method stub
    this.decreaseHp(o.getMovePower());

  }

  @Override
  public void weakAgainstFighting(IPokemon o) {
    // TODO Auto-generated method stub
    this.decreaseHp(o.getMovePower());

  }

  @Override
  public void weakAgainstNormal(IPokemon o) {
    // TODO Auto-generated method stub
    this.decreaseHp(o.getMovePower());

  }


}
