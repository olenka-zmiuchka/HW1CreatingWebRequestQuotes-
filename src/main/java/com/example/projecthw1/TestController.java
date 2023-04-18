package com.example.projecthw1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class TestController {
    @GetMapping("/wow")
    public String wow(){
        HashMap<Integer,String> quotes= new HashMap<Integer,String>();
        quotes.put(1,"Не чекай, що стане легше, простіше, краще. Не стане. Труднощі будуть завжди.\n " +
                "Вчися бути щасливим прямо зараз. Інакше не встигнеш.\n"  +
                "Біль іноді йде, але думки-то залишаються.\n");
        quotes.put(2, "Якщо під музику не танцюють – це не музика\n");
        quotes.put(3,"– Скажіть, Дрісом, як ви думаєте, чому людей тягне до мистецтва?\n" +
                "– Може, тому що це прибутково?\n" +
                "– Ні, це єдиний спосіб залишити слід на землі.\n");
        quotes.put(4,"Прокласти свій шлях майже неможливо, якщо ступати весь час по чужих слідах.\n");
        quotes.put(5,"Наш припис призвів до того, що ми вкрали в дітей саме те, що допоможе їм стати сильними, — складнощі.\n");
        quotes.put(6,"Ідеальний чоловік - це чоловік, що вважає, що у нього ідеальна дружина. \n");
        quotes.put(7,"Життя - це не пошук себе. Життя - це створення себе. \n");
        quotes.put(8,"Люди, які вміють веселитися, не мають грошей, а люди, які мають гроші, не вміють веселитися. \n");
        quotes.put(9,"Людина - як цегла: обпалюючись, твердне.\n");
        quotes.put(10,"Тепер, коли ми навчилися літати у повітрі, як птахи, плавати під водою, як риби, \n" +
                " нам не вистачає тільки одного: навчитися жити на землі, як люди.\n");

        String result = quotes.get((int) (Math.random()*10+1));

        System.out.println(result);
        return result;
    }
}
