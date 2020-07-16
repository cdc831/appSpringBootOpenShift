package net.sytes.canterosoft.logger.Repository;

import net.sytes.canterosoft.logger.Entity.Loggerdb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoggerDAO extends JpaRepository<Loggerdb,Integer> {}
