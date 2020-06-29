package ing.dev.school.alexandra.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int addNumbers (){
        return (this.firstNumber + this.secondNumber);
    }

    public int subtractNumbers (){
        return (this.firstNumber - this.secondNumber);
    }

    public int multiplyNumbers (){
        return (this.firstNumber * this.secondNumber);
    }

    public float divideNumbers (){
        if(secondNumber == 0){
            return 0;
        } else {
            return (float)(this.firstNumber / this.secondNumber);
        }
    }
}
