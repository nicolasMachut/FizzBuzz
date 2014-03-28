import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nicolas on 28/03/14.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @Before
    public void SetUp()
    {
        this.fizzBuzz = new FizzBuzz();
    }


    @Test
    public void EstUnMultipleDeTrois()
    {
        Assert.assertEquals("FIZZ", this.fizzBuzz.CalculLeResultat(3));
    }

    @Test
    public void EstUnMultipleDeCinq()
    {
        Assert.assertEquals("BUZZ", this.fizzBuzz.CalculLeResultat(5));
    }

    @Test
    public void EstUnNombreNormal()
    {
        Assert.assertEquals("2", this.fizzBuzz.CalculLeResultat(2));
    }


    @Test
    public void EstUnNombreMultipleDeCinqEtTrois()
    {
        Assert.assertEquals("FIZZBUZZ", this.fizzBuzz.CalculLeResultat(15));
    }



}
