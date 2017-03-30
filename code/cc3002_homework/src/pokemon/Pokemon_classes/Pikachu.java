package pokemon.Pokemon_classes;

import pokemon.AbstractPokemon;
import pokemon.IPokemon;
import pokemon.IType;
import pokemon.Type_classes.Electric;

public class Pikachu extends AbstractPokemon implements IPokemon {

  public Pikachu() {
    hp = 100;
    type = new Electric();
  }
  
  @Override
  public void battle(IPokemon p) {
    // TODO Auto-generated method stub
    p.weakAgainstElectric(this.getType());
  }

  @Override
  public void weakAgainstGrass(IType o) {
    // TODO Auto-generated method stub

  }

  @Override
  public void weakAgainstFire(IType o) {
    // TODO Auto-generated method stub

  }

  @Override
  public void weakAgainstWater(IType o) {
    // TODO Auto-generated method stub

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
