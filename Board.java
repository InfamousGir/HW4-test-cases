
public class Board {
    int displayScore;//recording of game's current score
    String[] arrayOfRoutes= new String[50];//routes between destinations, used for points
    String[] destinationPlaces= new String[25];//destination names
    arrayOfRoutes[0]="Raleigh->Chicago";//hardcoded preset example 
    destinationPlaces[0]="Raleigh";//hardcode
    destinationPlaces[1]="Chicago";//hardcode
    int[] scoreMarkerArray={20,13,4,15};
    int displayScore()
    {
    	return displayScore;
    }
    public String displayTrainCars()
    {
    	return"Train Type: Reefer";//Just as an example
    }
    public int scoreMarker()
    {
    	for (int i=0;i<4;i++)
    	{
    		System.out.println(scoreMarkerArray[i]);
    	}
    }
    
}



