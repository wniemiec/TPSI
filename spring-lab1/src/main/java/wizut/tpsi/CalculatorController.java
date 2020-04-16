package wizut.tpsi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController
{

    @RequestMapping("/calc")
    public String func1(Model model, Integer a, Integer b) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("w", a+b);
        return "calc";
    }


    @RequestMapping("/operacje")
    public String func2(Model model, Integer a, Integer b, String operacja) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);

        if (operacja.equals("+")) {
            model.addAttribute("w", a + b);
            model.addAttribute("znak", "+");
        }

        else if(operacja.equals("-")) {
            model.addAttribute("w", a - b);
            model.addAttribute("znak", "-");
        }

        else if(operacja.equals("*")) {
            model.addAttribute("w", a * b);
            model.addAttribute("znak", "*");
        }

        return "operacje";
    }

    @RequestMapping("/zad3")
    public String func3(Model model, CalculatorForm calculatorForm) {

        model.addAttribute("calculatorForm", calculatorForm);

        if((calculatorForm.getOperator().equals("+"))) {
            model.addAttribute("wynik", calculatorForm.getA() + calculatorForm.getB());
            model.addAttribute("znak", "+");
        }

        else if((calculatorForm.getOperator().equals("-"))) {
            model.addAttribute("wynik", calculatorForm.getA() - calculatorForm.getB());
            model.addAttribute("znak", "-");
        }

        else if((calculatorForm.getOperator().equals("*"))) {
            model.addAttribute("wynik", calculatorForm.getA() * calculatorForm.getB());
            model.addAttribute("znak", "*");
        }

        return "zad3";
    }


}
