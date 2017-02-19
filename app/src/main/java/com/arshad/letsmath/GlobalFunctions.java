package com.arshad.letsmath;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 19/2/17.
 */
public class GlobalFunctions {

    public static List<Movies> getMovies() {

        List<Movies> movies = new ArrayList<>();

        Movies m = new Movies();
        m.setName("Raees (2017)");
        m.setCast("Shah Rukh Khan, Nawazuddin Siddiqui, Mahira Khan");
        m.setDescription("Criticizing the prohibition of alcohol, prostitution and illegal drugs in Gujarat, this film unfolds the story of a cruel and clever bootlegger, whose business is challenged by a tough cop.");
        m.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BMTc2NTYwMTE1NV5BMl5BanBnXkFtZTgwODQ5MzAwMTI@._V1_QL50_SY1000_CR0,0,761,1000_AL_.jpg");
        m.setTrailer("J7_1MU3gDk0");
        movies.add(0, m);

        m = new Movies();
        m.setName("Jolly LLB 2 (2017)");
        m.setCast("Akshay Kumar, Sudhanva Deshpande, Avijit Dutt, Rajiv Gupta");
        m.setDescription("Jolly is a clumsy lawyer who is faced with representing the most critical court case of his career.");
        m.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BMDY5MzFlYzEtNTg0YS00OGM5LWI1ZDMtZDkxN2Y2OTI1NGUxL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjM1NjkwMDI@._V1_QL50_.jpg");
        m.setTrailer("q07SQFmL4rM");
        movies.add(1, m);

        m = new Movies();
        m.setName("Kaabil");
        m.setCast("Hrithik Roshan, Yami Gautam, Ronit Roy");
        m.setDescription("A blind man sets out to avenge the murder of his wife.");
        m.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BNGU0MDM1ODgtZmMwNi00NWRiLTgxYWEtMjJlNjMxNjc1NzQzL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNDkxMzY0Mjk@._V1_QL50_SY1000_CR0,0,738,1000_AL_.jpg");
        m.setTrailer("nubDFeiUAsI");
        movies.add(2, m);

        m = new Movies();
        m.setName("Dangal");
        m.setCast("Aamir Khan, Sakshi Tanwar, Fatima Sana Shaikh");
        m.setDescription("Biographical sports drama on former wrestler Mahavir Singh Phogat and his two wrestler daughters' struggle towards glory at the Commonwealth Games in the face of societal oppression.");
        m.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ4MzQzMzM2Nl5BMl5BanBnXkFtZTgwMTQ1NzU3MDI@._V1_QL50_SY1000_CR0,0,713,1000_AL_.jpg");
        m.setTrailer("x_7YlGv9u1g");
        movies.add(3, m);

        m = new Movies();
        m.setName("Force 2");
        m.setCast("John Abraham, Sonakshi Sinha, Tahir Raj Bhasin");
        m.setDescription("ACP Yashvardhan teams up with RAW Agent KK to bring down the mole within RAW.");
        m.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BYmI0ZmM3ZTItODhlOC00NjcwLWJlNzItNzFmMjIxZDY1MGY0XkEyXkFqcGdeQXVyNjQ2MjQ5NzM@._V1_QL50_SY1000_CR0,0,689,1000_AL_.jpg");
        m.setTrailer("r4O4Xec60_k");
        movies.add(4, m);

        m = new Movies();
        m.setName("Dear Zindagi");
        m.setCast("Alia Bhatt, Shah Rukh Khan, Kunal Kapoor");
        m.setDescription("Kaira is a budding cinematographer in search of a perfect life. Her encounter with Jug, an unconventional thinker, helps her gain a new perspective on life. She discovers that happiness is all about finding comfort in life's imperfections.");
        m.setImage("https://images-na.ssl-images-amazon.com/images/M/MV5BZWQzYWI3ZGMtYzgyYy00OWZkLWEwODYtNGNiMTZhODBkNzUyL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjY1MTg4Mzc@._V1_QL50_SY1000_CR0,0,750,1000_AL_.jpg");
        m.setTrailer("5DkO7ksXY8E");
        movies.add(5, m);

        return movies;
    }

}
