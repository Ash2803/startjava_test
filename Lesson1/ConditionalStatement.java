public class ConditionalStatement {   
    public static void main(String[] args) {
        int myAge = 18;
        boolean sexMale = true;
        double height = 1.82;
        char nameFirstLetter = 'G';

        if(myAge < 20){
            System.out.println("Younger");
        }

        if(sexMale){
            System.out.println("He is a male");
        }

        if(!sexMale){
            System.out.println("Female");
        }

        if(height < 1.80){
            System.out.println("Lower");
        }else{
            System.out.println("Taller then 1.80");
        }

        if(nameFirstLetter == 'M'){
            System.out.println("Maria");
        } else if(nameFirstLetter == 'I'){
            System.out.println("Irina");
        } else{
            System.out.println("His name is Grisha");
        } 
    }
}