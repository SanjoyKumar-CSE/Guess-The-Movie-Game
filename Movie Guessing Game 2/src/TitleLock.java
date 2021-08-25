
public class TitleLock {
    public String lockString;
    public String pickedMovie;
    public int numberOfSpace = 0;
    public void lockTheTitle()
    {
        RandomMoivePickup moviePicker = new RandomMoivePickup();
        pickedMovie = moviePicker.pickup();
        lockString = "";
        int lengthOfPickedMovie = pickedMovie.length();

        for(int i=0;i<lengthOfPickedMovie;i++) {
            if(pickedMovie.charAt(i)>='a' && pickedMovie.charAt(i) <= 'z')
                lockString += "_";
            else
            {
                lockString += " ";
                numberOfSpace += 1;
            }
        }
    }
}