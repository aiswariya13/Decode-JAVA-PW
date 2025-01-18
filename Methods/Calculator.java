public  class Calculator {

//Example of with parameter and return value method

        int res;
        int add(int x, int y){
            res = x + y;
            return res ;
        }
    }

    class Launch{
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            int a = 10 ;
            int b = 20 ;
            int sum = calc.add(a,b);
            System.out.println(sum);
        }
    }
    
