/**
 * 
 */
package br.com.storeweb.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author everson.lisboa.santos@gmail.com
 *Data : 24/06/2016
 *
 */
public interface GenericDAO <T, Cd_pk extends Serializable> {
		public T findEntityByPk(Cd_pk codigo);
		public void saveEntity(T entity);
		public List<T> filter(T entity, Map<String, String> parm);
		public List<T> findAllEntitys();
		public T findEntityByPk(Long cd_pk);
		
}
