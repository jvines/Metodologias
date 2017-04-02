package pokemon;

import pokemon.Pokemon_classes.Bulbasaur;
import pokemon.Pokemon_classes.Charmander;
import pokemon.Pokemon_classes.Pikachu;
import pokemon.Pokemon_classes.Squirtle;

public class Main {

  public static void main(String[] args) {
    IPokemon pika = new Pikachu();
    IPokemon squirt = new Squirtle();
    IPokemon bulb = new Bulbasaur();
    IPokemon charm = new Charmander();

    charm.battle(bulb);
    System.out.println(bulb.getCurrentHp());
    charm.battle(squirt);

    bulb.battle(charm);
    System.out.println(charm.getCurrentHp());

  }

}
