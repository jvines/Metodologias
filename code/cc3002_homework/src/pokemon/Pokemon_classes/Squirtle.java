package pokemon.Pokemon_classes;

import pokemon.AbstractPokemon;
import pokemon.IPokemon;
import pokemon.IType;
import pokemon.Type_classes.Water;

public class Squirtle extends AbstractPokemon implements IType {

  public Squirtle() {
    hp = 100;
    type = new Water();
  }

  
  @Override
  public void battle(IPokemon p) {
    // TODO Auto-generated method stub
    p.weakAgainstWater(this.getType());
  }

  @Override
  public void weakAgainstGrass(IType o) {
    // TODO Auto-generated method stub
    System.out.println("It's very effective.");

  }

  @Override
  public void weakAgainstFire(IType o) {
    // TODO Auto-generated method stub
    System.out.println("It's not very effective.");

  }

  @Override
  public void weakAgainstWater(IType o) {
    // TODO Auto-generated method stub
    System.out.println("Normal effect.");

  }

  @Override
  public void weakAgainstElectric(IType o) {
    // TODO Auto-generated method stub

  }

  @Override
  public void weakAgainstGround(IType o) {
    // TODO Auto-generated method stub

  }

  @Override
  public void weakAgainstPsychic(IType o) {
    // TODO Auto-generated method stub

  }

  @Override
  public void weakAgainstFighting(IType o) {
    // TODO Auto-generated method stub

  }

  @Override
  public void weakAgainstNormal(IType o) {
    // TODO Auto-generated method stub

  }


}
