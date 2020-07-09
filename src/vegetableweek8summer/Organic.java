/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek8summer;

/**
 * An interface that gives some properties that classes which
 * implement this interface must share. For example, to be organic
 * maybe we want to have a Vegetable not use pesticides.
 * Grow would be an example of a method we may wish to use in our interface.
 * @author dancye, 2020
 */
public interface Organic 
{
    public static final boolean USES_PESTICIDES=false;
    
    public abstract void grow();
}
