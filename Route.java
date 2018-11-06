/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Ahssan
 */
public class Route {
    String routeName;
    boolean claimedRoute=false;
    Route(String name)
    {
        routeName=name;
    }
    
}

//to be used to initialize array OR .txt file with all the routes
class main{
public static void main(String[] args)
{
Route[] arrRoutes=new Route[100];
arrRoutes[0]=new Route("Los Angeles, Las Vegas, Gray, 2");
arrRoutes[1]=new Route("Los Angeles, Phoenix, Blue, 3");
arrRoutes[2]=new Route("Los Angeles, ElPaso, Black, 6");
arrRoutes[3]=new Route("San Francisco, Portland, Pink, 5");
arrRoutes[4]=new Route("San Francisco, Portland, Green, 5");
arrRoutes[5]=new Route("San Francisco, Salt Lake City, Orange, 5");
arrRoutes[6]=new Route("San Francisco, Salt Lake City, White, 5");
arrRoutes[7]=new Route("San Francisco, Los Angeles, Pink, 3");
arrRoutes[8]=new Route("San Francisco, Los Angeles, Yellow, 3");
arrRoutes[9]=new Route("Portland, Seattle, Gray, 1");
arrRoutes[10]=new Route("Portland, Seattle, Gray, 1");
arrRoutes[11]=new Route("Portland, Salt Lake City, Blue, 6");
arrRoutes[12]=new Route("Seattle, Helena, Yellow, 6");
arrRoutes[13]=new Route("Seattle, Calgary, Gray, 4");
arrRoutes[14]=new Route("Seattle, Vancouver, Gray, 1");
arrRoutes[15]=new Route("Seattle, Vancouver, Gray, 1");
arrRoutes[16]=new Route("Vancouver, Calgary, Gray, 3");
arrRoutes[17]= new Route("Calgary, Winnipeg, White, 6");
arrRoutes[18]= new Route("Calgary, Helena, Gray, 4");
arrRoutes[19]=new Route("Helena, Salt Lake City, Yello, 3");
arrRoutes[20]=new Route("Salt Lake City, Denver, Red, 3");
arrRoutes[21]=new Route("Salt Lake City, Denver, Yellow, 3");
arrRoutes[22]=new Route("Salt Lake City, Las Vegas, Orange, 3");
arrRoutes[23]=new Route("Phoenix, Denver, White, 5");
arrRoutes[24]=new Route("Phoenix, Santa Fe, Gray, 3");
arrRoutes[25]=new Route("Phoenix, El Paso, Gray, 3");
arrRoutes[26]=new Route("El Paso, Santa Fe, Gray, 2");
arrRoutes[27]=new Route("El Paso, Oklahoma City, Yellow, 5");
arrRoutes[28]=new Route("El Paso, Dallas, Red, 4");
arrRoutes[29]=new Route("El Paso, Houston, Green, 6");
arrRoutes[30]=new Route("Santa Fe, Oklahoma City, Blue, 3");
arrRoutes[31]=new Route("Santa Fe, Denver, Gray, 2");
arrRoutes[32]=new Route("Denver, Oklahoma City, Red, 4");
arrRoutes[33]=new Route("Denver, Kansas City, Orange, 4");
arrRoutes[34]=new Route("Denver, Kansas City, Green, 4");
arrRoutes[35]=new Route("Denver, Helena, Green, 4");
arrRoutes[36]=new Route("Helena, Omaha, Red, 5");
arrRoutes[37]=new Route("Helena, Duluth, Orange, 6");
arrRoutes[38]=new Route("Helena, Winnipeg, Blue, 4");
arrRoutes[39]=new Route("Winnipeg, Sault St. Marie, Gray, 6");
arrRoutes[40]=new Route("Winnipeg, Duluth, Black, 4");
arrRoutes[41]=new Route("Duluth, Saul St. Marie, Gray, 3");
arrRoutes[42]=new Route("Duluth, Toronto, Pink, 6");
arrRoutes[43]=new Route("Duluth, Chicago, Red, 3");
arrRoutes[44]=new Route("Duluth, Omaha, Gray, 2");
arrRoutes[45]=new Route("Duluth, Omaha, Gray, 2");
arrRoutes[46]=new Route("Omaha, Chicago, Blue, 4");
arrRoutes[47]=new Route("Omaha, Kansas City, Gray, 1");
arrRoutes[48]=new Route("Omaha, Kansas City, Gray, 1");
arrRoutes[49]=new Route("Kansas City, Saint Louis, Blue, 2");
arrRoutes[50]=new Route("Kansas City, Saint Louis, Pink, 2");
arrRoutes[51]=new Route("Kansas City, Oklahoma City, Green, 2");
arrRoutes[52]=new Route("Kansas City, Oklahoma City, Gray, 2");
arrRoutes[53]=new Route("Oklahoma City, Little Rock, Purple, 2");
arrRoutes[54]=new Route("Oklahoma City, Dallas, Gray, 2");
arrRoutes[55]=new Route("Oklahoma City, Dallas, Gray, 2");
arrRoutes[56]=new Route("Dallas, Houston, Gray, 1");
arrRoutes[57]=new Route("Dallas, Houston, Gray, 1");
arrRoutes[58]=new Route("Houston, New Orleans, Gray, 2");
arrRoutes[59]=new Route("New Orleans, Miami, Red, 6");
arrRoutes[60]=new Route("New Orleans, Atlanta, Orange, 4");
arrRoutes[61]=new Route("New Orleans, Atlanta, Yellow, 4");
arrRoutes[62]=new Route("Atlanta, Miami, Blue, 5");
arrRoutes[63]=new Route("Atlanta, Charleston, Gray, 2");
arrRoutes[64]=new Route("Atlanta, Raleigh, Gray, 2");
arrRoutes[65]=new Route("Atlanta, Raleigh, Gray, 2");
arrRoutes[66]=new Route("Atlanta, Nashville, Gray, 1");
arrRoutes[67]=new Route("Little Rock, New Orleans, Green, 3");
arrRoutes[68]=new Route("Little Rock, Nashville, Purple, 3");
arrRoutes[69]=new Route("Little Rock, Saint Louis,Gray, 2");
arrRoutes[70]=new Route("Saint Louis, Nashville, Gray, 2");
arrRoutes[71]=new Route("Saint Louis, Pittsburgh, Green, 5");
arrRoutes[72]=new Route("Saint Louis, Chicago, White, 2");
arrRoutes[73]=new Route("Saint Louis, Chicago, Green, 2");
arrRoutes[74]=new Route("Chicago, Pittsburgh, Black, 3");
arrRoutes[75]=new Route("Chicago, Pittsburgh, Orange, 3");
arrRoutes[76]=new Route("Chicago, Toronto, White, 4");
arrRoutes[77]=new Route("Toronto, Sault St. Marie, Gray, 2");
arrRoutes[78]=new Route("Toronto, Montreal, Gray, 3");
arrRoutes[79]=new Route("Sault St. Marie, Montreal, Black, 5");
arrRoutes[80]=new Route("Montreal, Boston, Gray, 2");
arrRoutes[81]=new Route("Montreal, Boston, Gray, 2");
arrRoutes[82]=new Route("Montreal, New York, Blue, 3");
arrRoutes[83]=new Route("Pittsburgh, New York, White, 2");
arrRoutes[84]=new Route("Pittsburgh, New York, Yellow, 2");
arrRoutes[85]=new Route("Pittsburgh, Washington, Gray, 2");
arrRoutes[86]=new Route("Pittsburgh, Raleigh, Gray, 2");
arrRoutes[87]=new Route("Pittsburgh, Nashville, Yellow, 4");
arrRoutes[88]=new Route("Nashville, Raleigh, Black, 3");
arrRoutes[89]=new Route("Miami, Charleston, Pink, 4");
arrRoutes[90]=new Route("Charleston, Raleigh, Gray, 2");
arrRoutes[91]=new Route("Raleigh, Washington, Gray, 2");
arrRoutes[92]=new Route("Raleigh, Washington, Gray, 2");
arrRoutes[93]=new Route("Washington, New York, Orange, 2");
arrRoutes[94]=new Route("Washington, New York, Black, 2");
arrRoutes[95]=new Route("New York, Boston, Red, 2");
arrRoutes[96]=new Route("New York, Boston, Yellow, 2");



}}
