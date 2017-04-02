package pokemon.Pokemon_classes;

import pokemon.AbstractPokemon;
import pokemon.IPokemon;
import pokemon.IType;
import pokemon.Type_classes.Ground;

public class Geodude extends AbstractPokemon implements IType {

  public Geodude(String name, int hp, int move_power) {
    this.name = name;
    this.hp = hp;
    this.move_power = move_power;
    damage = 0;
    type = new Ground();

  }
  
  public Geodude(String name) {
    this(name, 130, 30);
  }

  public Geodude() {
    this("Geodude", 130, 30);
  }

  @Override
  public boolean battle(IPokemon p) {
    if (!this.canBattle()) {
      return false;
    }
    p.weakAgainstGround(this);
    return true;

  }

  @Override
  public void weakAgainstGrass(IPokemon o) {
    this.decreaseHp(o.getMovePower() * 2);

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
    this.decreaseHp(o.getMovePower() - 20);

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
    this.decreaseHp(o.getMovePower() - 20);

  }

}
