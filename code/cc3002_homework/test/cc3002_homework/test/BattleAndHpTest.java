package cc3002_homework.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pokemon.Pokemon_classes.Abra;
import pokemon.Pokemon_classes.Bulbasaur;
import pokemon.Pokemon_classes.Charmander;
import pokemon.Pokemon_classes.Geodude;
import pokemon.Pokemon_classes.Machop;
import pokemon.Pokemon_classes.Meowth;
import pokemon.Pokemon_classes.Pikachu;
import pokemon.Pokemon_classes.Squirtle;

public class BattleAndHpTest {
  
  private Pikachu pikachu;
  private Bulbasaur bulbasaur;
  private Charmander charmander;
  private Squirtle squirtle;
  private Abra abra;
  private Meowth meowth;
  private Machop machop;
  private Geodude geodude;
  
  private Pikachu pikachu2;
  private Bulbasaur bulbasaur2;
  private Charmander charmander2;
  private Squirtle squirtle2;
  private Abra abra2;
  private Meowth meowth2;
  private Machop machop2;
  private Geodude geodude2;
  
  private int fullhp;
  private int weakhp;
  private int resisthp;
  private int normalhp1;
  private int normalhp2;
  private int normalhp3;
  private int normalhp4;
  private int normalhp5;

  @Before
  public void setUp() throws Exception {
    pikachu = new Pikachu();
    bulbasaur = new Bulbasaur();
    charmander = new Charmander();
    squirtle = new Squirtle();
    abra = new Abra();
    meowth = new Meowth();
    machop = new Machop();
    geodude = new Geodude();
    
    pikachu2 = new Pikachu();
    bulbasaur2 = new Bulbasaur();
    charmander2 = new Charmander();
    squirtle2 = new Squirtle();
    abra2 = new Abra();
    meowth2 = new Meowth();
    machop2 = new Machop();
    geodude2 = new Geodude();
    
    fullhp = 130;
    weakhp = 70;
    resisthp = 120;
    normalhp1 = 100;
    normalhp2 = 70;
    normalhp3 = 40;
    normalhp4 = 10;
    normalhp5 = -20;
  }

  @Test
  public void testHp() {
    assertEquals(pikachu.getHp(), fullhp);
    assertEquals(bulbasaur.getHp(), fullhp);
    assertEquals(charmander.getHp(), fullhp);
    assertEquals(squirtle.getHp(), fullhp);
    assertEquals(abra.getHp(), fullhp);
    assertEquals(meowth.getHp(), fullhp);
    assertEquals(machop.getHp(), fullhp);
    assertEquals(geodude.getHp(), fullhp);
  }
  
  @Test
  public void testGrassWeakness() {
    bulbasaur.battle(squirtle);
    assertEquals(squirtle.getCurrentHp(), weakhp);
    bulbasaur.battle(geodude);
    assertEquals(geodude.getCurrentHp(), weakhp);
  }
  
  @Test
  public void testFireWeakness() {
    charmander.battle(bulbasaur);
    assertEquals(bulbasaur.getCurrentHp(), weakhp);
  }
  
  @Test
  public void testWaterWeakness() {
    squirtle.battle(charmander);
    assertEquals(charmander.getCurrentHp(), weakhp);
    squirtle.battle(geodude);
    assertEquals(geodude.getCurrentHp(), weakhp);
  }
  
  @Test
  public void testElectricWeakness() {
    pikachu.battle(squirtle);
    assertEquals(squirtle.getCurrentHp(), weakhp);
  }
  
  @Test
  public void testGroundWeakness() {
    geodude.battle(charmander);
    assertEquals(charmander.getCurrentHp(), weakhp);
    geodude.battle(pikachu);
    assertEquals(pikachu.getCurrentHp(), weakhp);
  }
  
  @Test
  public void testPsychicWeakness() {
    abra.battle(abra2);
    assertEquals(abra2.getCurrentHp(), weakhp);
    abra.battle(machop);
    assertEquals(machop.getCurrentHp(), weakhp);
  }
  
  @Test
  public void testFightingWeakness() {
    machop.battle(meowth);
    assertEquals(meowth.getCurrentHp(), weakhp);
  }
  
  @Test
  public void testGrassResistance() {
    squirtle.battle(bulbasaur);
    assertEquals(bulbasaur.getCurrentHp(), resisthp);
    geodude.battle(bulbasaur);
    assertEquals(bulbasaur.getCurrentHp(), resisthp - 10);
  }
  
  @Test
  public void testFireResistance() {
    bulbasaur.battle(charmander);
    assertEquals(charmander.getCurrentHp(), resisthp);
  }
  
  @Test
  public void testWaterResistance() {
    charmander.battle(squirtle);
    assertEquals(squirtle.getCurrentHp(), resisthp);
  }
  
  @Test
  public void testElectricResistance() {
    pikachu.battle(pikachu2);
    assertEquals(pikachu2.getCurrentHp(), resisthp);
  }
  
  @Test
  public void testGroundResistance() {
    meowth.battle(geodude);
    assertEquals(geodude.getCurrentHp(), resisthp);
    pikachu.battle(geodude);
    assertEquals(geodude.getCurrentHp(), resisthp - 10);
  }
  
  @Test
  public void testFightingResistance() {
    geodude.battle(machop);
    assertEquals(machop.getCurrentHp(), resisthp);
  }
  
  @Test
  public void testNormalResistance() {
    abra.battle(meowth);
    assertEquals(meowth.getCurrentHp(), resisthp);
  }
 
  @Test
  public void testGrassBattle() {
    pikachu.battle(bulbasaur);
    assertEquals(bulbasaur.getCurrentHp(), normalhp1);
    abra.battle(bulbasaur);
    assertEquals(bulbasaur.getCurrentHp(), normalhp2);
    machop.battle(bulbasaur);
    assertEquals(bulbasaur.getCurrentHp(), normalhp3);
    meowth.battle(bulbasaur);
    assertEquals(bulbasaur.getCurrentHp(), normalhp4);
    bulbasaur2.battle(bulbasaur);
    assertEquals(bulbasaur.getCurrentHp(), normalhp5);
    assertEquals(bulbasaur.battle(pikachu), false);
  }
  
  @Test
  public void testFireBattle() {
    pikachu.battle(charmander);
    assertEquals(charmander.getCurrentHp(), normalhp1);
    abra.battle(charmander);
    assertEquals(charmander.getCurrentHp(), normalhp2);
    machop.battle(charmander);
    assertEquals(charmander.getCurrentHp(), normalhp3);
    meowth.battle(charmander);
    assertEquals(charmander.getCurrentHp(), normalhp4);
    charmander2.battle(charmander);
    assertEquals(charmander.getCurrentHp(), normalhp5);
    assertEquals(charmander.battle(pikachu), false);
  }
  
  @Test
  public void testWaterBattle() {
    geodude.battle(squirtle);
    assertEquals(squirtle.getCurrentHp(), normalhp1);
    abra.battle(squirtle);
    assertEquals(squirtle.getCurrentHp(), normalhp2);
    machop.battle(squirtle);
    assertEquals(squirtle.getCurrentHp(), normalhp3);
    meowth.battle(squirtle);
    assertEquals(squirtle.getCurrentHp(), normalhp4);
    squirtle2.battle(squirtle);
    assertEquals(squirtle.getCurrentHp(), normalhp5);
    assertEquals(squirtle.battle(pikachu), false);
  }
  
  @Test
  public void testElectricBattle() {
    bulbasaur.battle(pikachu);
    assertEquals(pikachu.getCurrentHp(), normalhp1);
    squirtle.battle(pikachu);
    assertEquals(pikachu.getCurrentHp(), normalhp2);
    charmander.battle(pikachu);
    assertEquals(pikachu.getCurrentHp(), normalhp3);
    abra.battle(pikachu);
    assertEquals(pikachu.getCurrentHp(), normalhp4);
    machop.battle(pikachu);
    assertEquals(pikachu.getCurrentHp(), normalhp5);
    meowth.battle(pikachu2);
    assertEquals(pikachu2.getCurrentHp(), normalhp1);
    assertEquals(pikachu.battle(abra), false);
  }
  
  @Test
  public void testGroundBattle() {
    charmander.battle(geodude);
    assertEquals(geodude.getCurrentHp(), normalhp1);
    abra.battle(geodude);
    assertEquals(geodude.getCurrentHp(), normalhp2);
    machop.battle(geodude);
    assertEquals(geodude.getCurrentHp(), normalhp3);
    geodude2.battle(geodude);
    assertEquals(geodude.getCurrentHp(), normalhp4);
    geodude2.battle(geodude);
    assertEquals(geodude.getCurrentHp(), normalhp5);
    assertEquals(geodude.battle(pikachu), false);
  }
  
  @Test
  public void testPsychicBattle() {
    bulbasaur.battle(abra);
    assertEquals(abra.getCurrentHp(), normalhp1);
    squirtle.battle(abra);
    assertEquals(abra.getCurrentHp(), normalhp2);
    charmander.battle(abra);
    assertEquals(abra.getCurrentHp(), normalhp3);
    pikachu.battle(abra);
    assertEquals(abra.getCurrentHp(), normalhp4);
    machop.battle(abra);
    assertEquals(abra.getCurrentHp(), normalhp5);
    meowth.battle(abra2);
    assertEquals(abra2.getCurrentHp(), normalhp1);
    geodude.battle(abra2);
    assertEquals(abra2.getCurrentHp(), normalhp2);
    assertEquals(abra.battle(pikachu), false);
  }
  
  @Test
  public void testFightingBattle() {
    bulbasaur.battle(machop);
    assertEquals(machop.getCurrentHp(), normalhp1);
    squirtle.battle(machop);
    assertEquals(machop.getCurrentHp(), normalhp2);
    charmander.battle(machop);
    assertEquals(machop.getCurrentHp(), normalhp3);
    pikachu.battle(machop);
    assertEquals(machop.getCurrentHp(), normalhp4);
    machop2.battle(machop);
    assertEquals(machop.getCurrentHp(), normalhp5);
    meowth.battle(machop2);
    assertEquals(machop2.getCurrentHp(), normalhp1);
    assertEquals(machop.battle(pikachu), false);
  }
  
  @Test
  public void testNormalBattle() {
    bulbasaur.battle(meowth);
    assertEquals(meowth.getCurrentHp(), normalhp1);
    squirtle.battle(meowth);
    assertEquals(meowth.getCurrentHp(), normalhp2);
    charmander.battle(meowth);
    assertEquals(meowth.getCurrentHp(), normalhp3);
    pikachu.battle(meowth);
    assertEquals(meowth.getCurrentHp(), normalhp4);
    meowth2.battle(meowth);
    assertEquals(meowth.getCurrentHp(), normalhp5);
    geodude.battle(meowth2);
    assertEquals(meowth2.getCurrentHp(), normalhp1);
    assertEquals(meowth.battle(pikachu), false);
  }

}
