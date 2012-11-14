import java.util.List;
import java.util.ArrayList;

public class StarBuzz {
  
  int answer = 42;
  public static List x;public static List y;

  public static void main(String[] args) {x = java.util.Arrays.asList("HouseBlend", "Espresso", "DarkRoast", "Decaf");y = java.util.Arrays.asList("SteamedMilk", "Mocha", "Soy", "Whip");
 
    /*
     * Prix:
     * HouseBlend -> 2.5
     * Espresso -> 1.5
     * DarkRoast -> 2.0
     * Decaf -> 1.0
     * 
     * SteamedMilk -> 0.25
     * Mocha -> 0.19
     * Soy -> 0.33
     * Whip -> 0.41
     */

    List toto2 = java.util.Arrays.asList(
      "EspressoWithMochaandSoy",
      "EspressoWithSoy",
      "EspressoWithSoyandMocha",
      "HouseBlendWithSteamedMilkandWhip",
      "EspressoWithWhipandSoy",
      "DecafWithSoyandWhip",
      "HouseBlendWithMochaandSoy",
      "DarkRoastWithSteamedMilkandSoy",
      "EspressoWithSteamedMilkandSteamedMilk",
      "DecafWithSoyandMocha",
      "EspressoWithSoyandWhip",
      "EspressoWithSteamedMilkandMocha",
      "HouseBlendWithSoyandSoy",
      "DecafWithSoyandSoy",
      "EspressoWithMochaandSteamedMilk",
      "DarkRoast",
      "EspressoWithWhipandMocha",
      "EspressoWithMochaandMocha",
      "DarkRoastWithMochaandSteamedMilk",
      "HouseBlendWithSoyandSteamedMilk",
      "DecafWithSteamedMilk",
      "DarkRoastWithSteamedMilk",
      "HouseBlendWithMocha",
      "EspressoWithWhipandWhip",
      "EspressoWithSoyandSoy",
      "DarkRoastWithMochaandSoy",
      "DarkRoastWithWhipandWhip",
      "DarkRoastWithMochaandMocha",
      "HouseBlendWithMochaandMocha",
      "DecafWithMochaandWhip",
      "HouseBlendWithSteamedMilkandSteamedMilk",
      "DecafWithSteamedMilkandSteamedMilk",
      "EspressoWithSteamedMilkandWhip",
      "HouseBlendWithSoyandMocha",
      "HouseBlendWithWhip",
      "DecafWithSteamedMilkandSoy",
      "HouseBlendWithWhipandMocha",
      "HouseBlendWithMochaandWhip",
      "DecafWithSoyandSteamedMilk",
      "HouseBlendWithWhipandWhip",
      "HouseBlend",
      "DarkRoastWithMochaandWhip",
      "DecafWithSteamedMilkandMocha",
      "DarkRoastWithMocha",
      "DarkRoastWithSteamedMilkandWhip",
      "DecafWithWhipandMocha",
      "Decaf",
      "HouseBlendWithSoyandWhip",
      "DecafWithMocha",
      "DarkRoastWithSoyandSoy",
      "EspressoWithMochaandWhip",
      "DecafWithSteamedMilkandWhip",
      "EspressoWithWhip",
      "DecafWithWhipandWhip",
      "EspressoWithSteamedMilk",
      "HouseBlendWithWhipandSteamedMilk",
      "DarkRoastWithSoyandWhip",
      "HouseBlendWithWhipandSoy",
      "HouseBlendWithSteamedMilkandMocha",
      "EspressoWithSteamedMilkandSoy",
      "HouseBlendWithMochaandSteamedMilk",
      "DarkRoastWithSteamedMilkandMocha",
      "HouseBlendWithSoy",
      "DarkRoastWithWhip",
      "EspressoWithMocha",
      "DecafWithWhipandSoy",
      "DarkRoastWithWhipandSoy",
      "DarkRoastWithWhipandSteamedMilk",
      "Espresso",
      "HouseBlendWithSteamedMilk",
      "HouseBlendWithSteamedMilkandSoy",
      "DarkRoastWithSoy",
      "DecafWithWhip",
      "EspressoWithWhipandSteamedMilk",
      "DecafWithMochaandMocha",
      "DecafWithMochaandSteamedMilk",
      "EspressoWithSoyandSteamedMilk",
      "DecafWithSoy",
      "DecafWithWhipaHouseBlendWithSteamedMilkandSoyndSteamedMilk",
      "DarkRoastWithSoyandMocha",
      "DarkRoastWithWhipandMocha",
      "DecafWithMochaandSoy",
      "DarkRoastWithSoyandSteamedMilk",
      "DarkRoastWithSteamedMilkandSteamedMilk"
    );

    Beverage toto = new DecafWithSteamedMilkandMocha("A great decaf with steamed milk and mocha");
    Beverage voiture = new DarkRoastWithWhip("Un peu de logique, que diable !");
    Beverage epsilon = new Espresso("Short beverage which tends to be tiny towards infinity");

    System.out.println("Let's print our beverages.\n");
         ArrayList ppp = new ArrayList<Beverage>();
  ppp.add(epsilon);
        ppp.add(voiture);   ppp.add(toto);

    for(int i=0;i<ppp.size();i++) {
      String j = iAmVeryClear((Beverage)ppp.get(i)); System.out.println("Description de la boisson: '"+j+"' coûte "+boisson(ppp,i).cost()+" euros");    }
  }

  public static String iAmVeryClear(Beverage h) {    return h.getDescription();
  }
                         public static Beverage boisson(ArrayList x, int y) {
  return ((Beverage)x.get(y));}


}

