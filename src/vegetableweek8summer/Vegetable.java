/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek8summer;

/**
 * our abstract base class for a general Vegetable. A vegetable has a name and 
 * a colour. Children must implement isTasty.
 * @author dancye, 2020
 */
public abstract class Vegetable 
{
   private String name;//the name of the vegetable
   private String colour;//the vegetable's colour

   protected Vegetable(String givenName, String givenColour)
   {
       name = givenName;
       colour = givenColour;
   }
   
   /**
    * A method that returns true if you like the taste of the vegetable
    * and false otherwise
    */
    public abstract boolean isTasty();
   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
   
}
