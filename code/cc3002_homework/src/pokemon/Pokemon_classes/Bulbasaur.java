package pokemon.Pokemon_classes;

import pokemon.AbstractPokemon;
import pokemon.IPokemon;
import pokemon.IType;
import pokemon.Type_classes.Grass;

// TODO: Auto-generated Javadoc
/**
 * The Class Bulbasaur.
 */
public class Bulbasaur extends AbstractPokemon implements IType {

  /**
   * Instantiates a new bulbasaur.
   */
  public Bulbasaur() {
    name = "Bulbasaur";
    hp = 100;
    damage = 0;
    move_power = 30;
    type = new Grass();
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
    p.weakAgainstGrass(this);
  }


  @Override
  public void weakAgainstGrass(IPokemon o) {
    this.decreaseHp(o.getMovePower());

  }


  @Override
  public void weakAgainstFire(IPokemon o) {
    System.out.println("It's very effective!");
    this.decreaseHp(o.getMovePower() * 2);
  }


  @Override
  public void weakAgainstWater(IPokemon o) {
    this.decreaseHp(o.getMovePower() - 20);

  }


  @Override
  public void weakAgainstElectric(IPokemon o) {
    this.decreaseHp(o.getMovePower());

  }


  @Override
  public void weakAgainstGround(IPokemon o) {
    this.decreaseHp(o.getMovePower() - 20);

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
