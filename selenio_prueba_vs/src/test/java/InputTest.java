import driverConfiguracion.Inicio;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InputPage;


import static org.testng.Assert.assertTrue;

public class InputTest extends Inicio {

    //    incrementando con el tecldo flecha hacia arriba

    @Test
    public void testTeclaUp() throws InterruptedException {

        InputPage input = homepage.clickInputs();
        input.clickInput();
        input.multipleClickUp(10);
        Thread.sleep(1500);


    }

//    test case
//    incrementando con el tecldo flecha hacia arriba
//    ir a la pagina https://the-internet.herokuapp.com/");
//    click input
//    click incrementar valor repetidas veces hacia arriba (Fecla UP)

//    test case
//    decrementar con el tecldo flecha hacia abajo
//    ir a la pagina https://the-internet.herokuapp.com/");
//    click input
//    click incrementar valor repetidas veces hacia arriba (Fecla Down)


//    test case 3
//    decrementar con el tecldo flecha hacia abajo
//    ir a la pagina https://the-internet.herokuapp.com/");
//    click input
//    introducirn valores por el teclado



    @Test
    public void testTeclaDown() throws InterruptedException {
        InputPage input = homepage.clickInputs();
        input.clickInput();
        input.multipleClickDown(10);
        Thread.sleep(1000);
        input.clear();

    }

    @Test
    public void testEnterNegative() throws InterruptedException {
        InputPage input = homepage.clickInputs();
        input.enterNegativeNumber("-123456789");
        Thread.sleep(1000);
        input.clear();
        input.enterNegativeNumber("-9999");

        Thread.sleep(1500);


    }


}
