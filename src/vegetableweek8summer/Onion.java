/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek8summer;

/**
 * A class to model an onion
 * An onion is tasty.
 * @author dancye, 2020
 */
public class Onion extends Vegetable 
{
    private int numLayers;
    
    public Onion(int givenLayers)
    {
        super("onion","green" );
        numLayers = givenLayers;
    }
    
      @Override
      public boolean isTasty()
      {
          return true;
      }
    
}
