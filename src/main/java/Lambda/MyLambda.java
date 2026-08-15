package Lambda;


import java.util.Scanner;

enum Dimensions {
    SI("SI"),
    MKS("MKS");

    private Dimensions(String desc){
    }
}

@FunctionalInterface
interface MapperDimensions  {
    void display(String dim);
}

class LambdaBuilder{
    void buildLambda(MapperDimensions md, String dim){
        md.display(dim);
    }
}

class LambdaRunner {
    int temp = 20;
    void runLambda(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dimensions");
        String dim = sc.nextLine();
        final short temp = 110;

        MapperDimensions md = (inputDimensions) -> {
            switch (inputDimensions){
                case "SI", "Internationale":
                    System.out.println("Can access and update this variable in the class: " + ++this.temp);
                    System.out.println("Can access but cannot update this variable from function: " + temp);
                    System.out.println(Dimensions.SI);
                    break;
                case "Metric":
                    System.out.println("Can access and update this variable in the class: " + ++this.temp);
                    System.out.println("Can access but cannot update this variable from function: " + temp);
                    System.out.println(Dimensions.MKS);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + dim);
            }
        };

        LambdaBuilder ld = new LambdaBuilder();
        ld.buildLambda(md, dim);

    }
}

public class MyLambda {
    int temp = 0;
    public static void main(String[] args) {
        new LambdaRunner().runLambda();
    }

}
