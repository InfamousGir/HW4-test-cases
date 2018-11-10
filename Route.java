/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
 * @author Ahssan
 */
public class Route {

    public String routeName;//"City-to-City"
    public int distance;//spaces between two cities
    public String color;//color of path
    public boolean claimed=false;//default false, once claimed, make sure to set to true
    Route(String thisName, int thisDistance, String thisColor)
    {
        routeName=thisName;
        distance=thisDistance;
        color=thisColor;
    }
    public String getRouteName()
    {
        return routeName;
    }
    public int getDistance()
    {
        return distance;
    }
    public String getColor()
    {
        return color;
    }
    public void setClaim()
    {
        claimed=true;
    }
    public boolean getClaim()
    {
        return claimed;
    }
}
