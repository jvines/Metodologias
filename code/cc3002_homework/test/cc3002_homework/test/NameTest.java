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

public class NameTest {

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

    pikachu2 = new Pikachu("TestNamePika");
    bulbasaur2 = new Bulbasaur("TestNameBulba");
    charmander2 = new Charmander("TestNameCharm");
    squirtle2 = new Squirtle("TestNameSquirt");
    abra2 = new Abra("TestNameAbra");
    meowth2 = new Meowth("TestNameMeowth");
    machop2 = new Machop("TestNameMachop");
    geodude2 = new Geodude("TestNameGeo");
  }

  @Test
  public void testNames() {
    assertEquals(pikachu.getName(), "Pikachu");
    assertEquals(bulbasaur.getName(), "Bulbasaur");
    assertEquals(charmander.getName(), "Charmander");
    assertEquals(squirtle.getName(), "Squirtle");
    assertEquals(abra.getName(), "Abra");
    assertEquals(meowth.getName(), "Meowth");
    assertEquals(machop.getName(), "Machop");
    assertEquals(geodude.getName(), "Geodude");
  }

  @Test
  public void testCustomNames() {
    assertEquals(pikachu2.getName(), "TestNamePika");
    assertEquals(bulbasaur2.getName(), "TestNameBulba");
    assertEquals(charmander2.getName(), "TestNameCharm");
    assertEquals(squirtle2.getName(), "TestNameSquirt");
    assertEquals(abra2.getName(), "TestNameAbra");
    assertEquals(meowth2.getName(), "TestNameMeowth");
    assertEquals(machop2.getName(), "TestNameMachop");
    assertEquals(geodude2.getName(), "TestNameGeo");
  }

}
