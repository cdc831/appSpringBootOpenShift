package net.sytes.canterosoft.logger.Controller;

import lombok.extern.java.Log;
import net.sytes.canterosoft.logger.Entity.Loggerdb;
import net.sytes.canterosoft.logger.Services.ILoggerService;
import net.sytes.canterosoft.logger.Services.LoggerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Log
public class homeController {

    @Autowired
    LoggerServiceImpl loggerService;

    @GetMapping({"/index", "/", "home"})
    public String index(){
        return "index";
    }

    @GetMapping("/list")
    public String listarLogs(Model model){
        List<Loggerdb> listado = loggerService.listarLogs();
        model.addAttribute("listaDeLogs",listado);
        return "lista";
    }

    @GetMapping("/delall")
    public String borrarHistorial(){

        loggerService.eliminarTodo();
        return "index";
    }

    @GetMapping("/add/{clave}/{valor}")
    public String addLogs(@PathVariable(name = "clave") String clave, @PathVariable(name = "valor") String valor){

        Loggerdb campoNuevo = new Loggerdb();
        campoNuevo.setClave(clave);
        campoNuevo.setValor(valor);
        loggerService.guardarLogs(campoNuevo);
        return "index";
    }

    @GetMapping("/add/{clave}/{valor}/{opcional}")
    public String addLogs(@PathVariable(name = "clave") String clave, @PathVariable(name = "valor") String valor, @PathVariable(name = "opcional") String opcional){

        Loggerdb campoNuevo = new Loggerdb();
        campoNuevo.setClave(clave);
        campoNuevo.setValor(valor);
        campoNuevo.setOpcional(opcional);
        loggerService.guardarLogs(campoNuevo);
        return "index";
    }

}
