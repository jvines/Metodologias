package pokemon;

public interface IPokemon extends IType {
  
  public int getHp();

  public IType getType();
  
  public void battle(IPokemon p);
}
