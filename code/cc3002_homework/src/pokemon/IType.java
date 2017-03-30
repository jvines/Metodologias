package pokemon;

public interface IType {
  
  public void weakAgainstGrass(IType o);

  public void weakAgainstFire(IType o);

  public void weakAgainstWater(IType o);

  public void weakAgainstElectric(IType o);

  public void weakAgainstGround(IType o);

  public void weakAgainstPsychic(IType o);

  public void weakAgainstFighting(IType o);

  public void weakAgainstNormal(IType o);
}
