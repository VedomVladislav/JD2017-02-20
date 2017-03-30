package by.it.prigozhanov.matlab3;

public class ConsoleRunner {

    private static void oneRes(Var var){
        if (var != null) {
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        Var vec1=new VarV("{1.1,2.2,3.3,4.4,5}");
        Var vec2=new VarV("{1,2,3,4,5}");

        oneRes(Parser.calc("1+2"));
        oneRes(Parser.calc("a=5"));
        oneRes(Parser.calc("b=7"));
        oneRes(Parser.calc("c=10"));
        oneRes(Parser.calc("c={1,2,3,4,5}"));
//        oneRes(Parser.calc("{1,2,3,4,5}+2"));
//        oneRes(Parser.calc("{1,2,3,4,5}*2"));
//        oneRes(Parser.calc("{1,2,3,4,5}/2"));
//        oneRes(Parser.calc("{1,2,3,4,5}-2"));
//        oneRes(Parser.calc("A=3"));
//        oneRes(Parser.calc("B={1,2,3,4}"));
//        oneRes(Parser.calc("C=5"));
//        oneRes(Parser.calc("A=7"));

        System.out.println(Var.vars);

//        oneRes(vec1.add(vec2));
//        oneRes(vec1.sub(vec2));
//        oneRes(vec1.mul(vec2));
//        oneRes(vec1.div(vec2));

//        oneRes(new VarF("3.8").add(new VarF("26.2")));
//        oneRes(new VarF("3.8").add(new VarV()));
//
//        oneRes(new VarF("87.4").sub(new VarF("23.1")));
//        oneRes(new VarF("1.04").mul(new VarF("5.9")));
//        oneRes(new VarF("12.7").div(new VarF("5")));
    }
}