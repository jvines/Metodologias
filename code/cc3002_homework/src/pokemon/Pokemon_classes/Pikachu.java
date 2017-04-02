package pokemon.Pokemon_classes;

import pokemon.AbstractPokemon;
import pokemon.IPokemon;
import pokemon.IType;
import pokemon.Type_classes.Electric;

public class Pikachu extends AbstractPokemon implements IType {

  public Pikachu(String name, int hp, int move_power) {
    this.name = name;
    this.hp = hp;
    this.move_power = move_power;
    damage = 0;
    type = new Electric();
  }

  public Pikachu(String name) {
    this(name, 130, 30);
  }
  
  public Pikachu() {
    this("Pikachu", 130, 30);
  }

  @Override
  public boolean battle(IPokemon p) {
    if (!this.canBattle()) {
      return false;
    }
    p.weakAgainstElectric(this);
    return true;
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
    this.decreaseHp(o.getMovePower());
  }

  @Override
  public void weakAgainstElectric(IPokemon o) {
    this.decreaseHp(o.getMovePower() - 20);
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
