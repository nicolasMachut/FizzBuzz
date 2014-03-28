/**
 * Created by nicolas on 28/03/14.
 */
public class FizzBuzz {


    public String CalculLeResultat(int nombre) {
        String result = "";
        boolean buzz = false;
        boolean fizz = false;

        if(nombre%5 == 0)
            buzz = true;

        if((nombre/3)*3 != nombre)
            result = String.valueOf(nombre);

        if ((nombre/3)*3 == nombre)
            fizz = true;

        if(buzz && fizz)
        {
            result = "FIZZBUZZ";
        }
        else
        {
            if(buzz)
                result = "BUZZ";

            if(fizz)
                result = "FIZZ";
        }
        System.out.println(nombre +" : "+result);
        return result;
    }

    public void LancerFizzBuzz()
    {
        for(int i = 0; i <101; i++)
        {
            this.CalculLeResultat(i);
        }
    }
}
