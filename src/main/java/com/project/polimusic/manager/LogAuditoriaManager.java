/**
 * 
 */
package com.project.polimusic.manager;

import java.util.List;

import com.project.polimusic.entity.LogAuditoria;


/**
 * @author grupoMultidisciplinario
 *
 */
public interface LogAuditoriaManager {

	public List<LogAuditoria> getAllLogsAuditoria();
	
	public LogAuditoria getLogAuditoriaById(long id);
	
	public void saveLogAuditoria(LogAuditoria logAuditoria);
	
	public void deleteLogAuditoria(LogAuditoria logAuditoria);
}
