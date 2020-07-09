/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek8summer;

import java.util.ArrayList;

/**
 * A class that has an ArrayList of vegetables
 * Will determine whether the stirfry tastes good.
 * @author dancye
 */
public class StirFry 
{
  public static void main(String[] args)
  {
      ArrayList<Vegetable> veggies = new ArrayList();
      Vegetable v1 = new Carrot();
      Vegetable v2 = new Corn();
      Vegetable v3 = new Asparagus();
      Vegetable v4 = new Onion(12);
        
      veggies.add(v1);
      veggies.add(v2);
      veggies.add(v3);
      veggies.add(v4);
      
      boolean tastesGood = true;
      for(Vegetable v: veggies)
      {
          if(!v.isTasty())
          {
              tastesGood=false;
          }
      }
      System.out.println("Does this stirfry taste good? "+tastesGood);
  }
}
