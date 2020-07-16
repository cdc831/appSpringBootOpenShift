package net.sytes.canterosoft.logger.Services;

import net.sytes.canterosoft.logger.Entity.Loggerdb;

import java.util.List;

public interface ILoggerService {

    public List<Loggerdb> listarLogs();
    public Loggerdb guardarLogs(Loggerdb loggerdb);
    public Loggerdb logById(Integer id);
    public void eliminarLog(Integer id);
    public void eliminarTodo();
}
