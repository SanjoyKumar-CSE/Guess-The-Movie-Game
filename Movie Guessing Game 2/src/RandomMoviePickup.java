class RandomMoivePickup {
    public String pickup()
    {
        ReadFile myObj = new ReadFile();
        myObj.fileReader();
        int maxLengthOfMovieName = myObj.movieName.size();
        double rnd = Math.random();
        int randomIndex = (int) (rnd * maxLengthOfMovieName);
        return myObj.movieName.get(randomIndex);
    }
}