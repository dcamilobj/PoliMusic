/**
 * 
 */
package com.project.polimusic.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.polimusic.entity.LogAuditoria;
import com.project.polimusic.manager.LogAuditoriaManager;
import com.project.polimusic.repository.LogAuditoriaRepository;


/**
 * @author grupoMultidisciplinario
 *
 */
@Service
public class LogAuditoriaManagerImpl  implements LogAuditoriaManager{

	@Autowired
	LogAuditoriaRepository logAuditoriaRepository;
	
	@Override
	public List<LogAuditoria> getAllLogsAuditoria() {
		return logAuditoriaRepository.findAll();
	}

	@Override
	public LogAuditoria getLogAuditoriaById(long id) {
		return logAuditoriaRepository.findById(id).get();
	}

	@Override
	public void saveLogAuditoria(LogAuditoria logAuditoria) {
		logAuditoriaRepository.save(logAuditoria);
		
	}

	@Override
	public void deleteLogAuditoria(LogAuditoria logAuditoria) {
		logAuditoriaRepository.delete(logAuditoria);
		
	}


}
