package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}: {1}")
    public static Object[][] getBuns() {
        return new Object[][]{
                {"Булочка с кунжутом", 5.25f},
                {"", 1111111111},
                {null, 0},
                {"#%&&%#@*!", -999.99999999f},
                {"ghjljgdtr", 0.000000000000000000000000000000000000000000001f},
        };
    }

    @Test
    public void checkBuns() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
        Assert.assertEquals(price, bun.getPrice(),0);
    }
}
