package ico.fes.intro.controller;

import ico.fes.intro.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.AttributeValueQuotes;
import org.thymeleaf.model.IAttribute;

import javax.management.AttributeValueExp;
import java.sql.Date;

@Controller
public class Principal {
    @GetMapping("/index")
    public String getIndex(Model model){
        Empleado emp= new Empleado(1,"Jose Sosa",23000,"Desarrollo", "12/12/2000");
        model.addAttribute("empleado",emp);
        return "index";
}

    }