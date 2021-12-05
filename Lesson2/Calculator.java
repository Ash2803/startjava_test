public class Calculator {
    
    private int a;
  
    public int getA() {
      return a;
    }
    
    public void setA(int calcOneA) {
       this.a = calcOneA;
    }
  
    private int b;
    
    public int getB() {
      return b;
    }
    
    public void setB(int calcOneB) {
       this.b = calcOneB;
    }
        
    private char sign;
  
    public char getSign() {
      return sign;
    }
    
    public void setSign(char calcOneSign) {
        this.sign = calcOneSign;
    }

    private String y;

    public String getY() {
        return y;
    }

    public void setY(String calcOneY) {
        this.y = y;
    }

    private String n;

    public String getN() {
        return n;
    }

    public void setN(String calcOneN) {
        this.n = n;
    }

    public double getResult() {
        switch(sign) {
        case '+':
            return a + b;
        case '-' :
            return a - b;
        case '/' :
            return a / b;
        case '*' :
            return a * b;
        case '%' :
            return a % b;
        case '^' :
            return Math.pow(a, b);
        default :
            return 0;
        }
    }
}