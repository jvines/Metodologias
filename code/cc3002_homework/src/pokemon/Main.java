package pokemon;

import pokemon.Pokemon_classes.Bulbasaur;
import pokemon.Pokemon_classes.Charmander;
import pokemon.Pokemon_classes.Pikachu;
import pokemon.Pokemon_classes.Squirtle;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    IPokemon pika = new Pikachu();
    IPokemon squirt = new Squirtle();
    IPokemon bulb = new Bulbasaur();
    IPokemon charm = new Charmander();
    
    charm.battle(bulb);
    charm.battle(squirt);
    charm.battle(charm);
    
    squirt.battle(bulb);
    squirt.battle(squirt);
    squirt.battle(charm);
    
    bulb.battle(bulb);
    bulb.battle(squirt);
    bulb.battle(charm);
    
  }

}
