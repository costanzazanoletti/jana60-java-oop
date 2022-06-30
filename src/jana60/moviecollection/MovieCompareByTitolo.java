package jana60.moviecollection;

import java.util.Comparator;

public class MovieCompareByTitolo implements Comparator<Movie> {

  @Override
  public int compare(Movie o1, Movie o2) {
    // ritorna il compareTo dei titoli dei due Movie
    return o1.getTitolo().compareTo(o2.getTitolo());
  }

}
