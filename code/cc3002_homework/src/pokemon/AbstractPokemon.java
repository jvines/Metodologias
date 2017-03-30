package pokemon;

public abstract class AbstractPokemon implements IType, IPokemon {

  protected int hp;
  protected IType type;
  protected int move_power;

  public void attack() {
    // placeholder
  }
  public int getHp() {
    return hp;
  }
  
  public IType getType() {
    return type;
  }
  
  public void decreaseHp(int x) {
    hp -= x;
  }
}
