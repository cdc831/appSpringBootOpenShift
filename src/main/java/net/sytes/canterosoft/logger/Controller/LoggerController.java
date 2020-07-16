package net.sytes.canterosoft.logger.Controller;

import net.sytes.canterosoft.logger.Entity.Loggerdb;
import net.sytes.canterosoft.logger.Services.LoggerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logger")
public class LoggerController {
    @Autowired
    LoggerServiceImpl loggerService;

    @GetMapping("/list")
    public List<Loggerdb> listarLogs(){
        return loggerService.listarLogs();
    }

    @PostMapping("/add")
    public Loggerdb addLogs(@RequestBody Loggerdb loggerdb){
        return loggerService.guardarLogs(loggerdb);
    }

    @DeleteMapping("/del/{id}")
    public void delLogs(@PathVariable(name = "id") Integer id){
        loggerService.eliminarLog(id);
    }

    @DeleteMapping("/delall")
    public void borrarHistorial(){
        loggerService.eliminarTodo();
    }
}
