package net.sytes.canterosoft.logger.Services;

import net.sytes.canterosoft.logger.Entity.Loggerdb;
import net.sytes.canterosoft.logger.Repository.ILoggerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoggerServiceImpl implements ILoggerService{

    @Autowired
    ILoggerDAO iLoggerDAO;

    @Override
    public List<Loggerdb> listarLogs() {
        return iLoggerDAO.findAll();
    }

    @Override
    public Loggerdb guardarLogs(Loggerdb loggerdb) {
        return iLoggerDAO.save(loggerdb);
    }

    @Override
    public Loggerdb logById(Integer id) {
        return iLoggerDAO.findById(id).get();
    }

    @Override
    public void eliminarLog(Integer id) {
        iLoggerDAO.deleteById(id);
    }

    @Override
    public void eliminarTodo() {
        iLoggerDAO.deleteAll();
    }
}
