package br.com.netservicos.start;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import br.com.netservicos.config.ThreadLocalStorage;
 
// This is a DataSource.
public class MyRoutingDataSource extends AbstractRoutingDataSource {
 
	@Override
    protected Object determineCurrentLookupKey() {
        return ThreadLocalStorage.getTenantName();
    }
 
   public void initDataSources(DataSource dataSource1, DataSource dataSource2) {
      Map<Object, Object> dsMap = new HashMap<Object, Object>();
      dsMap.put("SCTV1MG", dataSource1);
      dsMap.put("SBH3SP", dataSource2);
 
      this.setTargetDataSources(dsMap);
      
      this.afterPropertiesSet();
   }
 
}
