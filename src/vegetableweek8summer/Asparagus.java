/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek8summer;

/**
 * Class to model asparagus
 * @author dancye
 */
public class Asparagus extends Vegetable{

    public Asparagus()
    {
        super("Asparagus", "green");
    }
    @Override
    public boolean isTasty() {
       return false;
    }
    
}
