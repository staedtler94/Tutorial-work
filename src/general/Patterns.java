package general;

public class Patterns {

    public void printStarPattern_ChristmasTree(int depth){
//      int numOfStars = 2*depth@i +1

        System.out.println("");
        int totalStars = 2*depth +1;
        for(int i = 1; i <= depth; i++){
            for(int j = 1; j <= totalStars; j++){
                if(j > ((2*depth +1) / 2 - i) && j < (2*depth / 2 + i) )
                {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }

            System.out.println("");
        }
    }

//    public void printPatter<T>(int depth){
//
//    }
}
