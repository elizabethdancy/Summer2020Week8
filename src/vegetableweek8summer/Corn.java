/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek8summer;

/**
 * A class to model corn
 * @author dancye
 */
public class Corn extends Vegetable{
    
    public Corn()
    {
        super("Corn", "yellow");
    }
    
    @Override
    public boolean isTasty()
    {
        return true;
    }
}
