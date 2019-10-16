package br.com.netservicos.endpoint;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.openuri.GerarOcorrenciaPrazoRequest;
import org.openuri.GerarOcorrenciaPrazoRequestResponse;
import org.openuri.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.netservicos.atender.ocorrencia.schema.OcorrenciaGeradaPrazo;
import br.com.netservicos.atender.ocorrencia.schema.RetornoGeraOcorrenciaPrazo;
import br.com.netservicos.core.schema.RetornoPadrao;

@Endpoint
public class WebServiceEndpoint {

	private static final String NAMESPACE_URI = "http://www.openuri.org/";
	
	@Autowired
	DataSource dataSource;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "gerarOcorrenciaPrazoRequest")
	@ResponsePayload
	public GerarOcorrenciaPrazoRequestResponse gerarOcorrenciaPrazo(@RequestPayload GerarOcorrenciaPrazoRequest request) {
		
		String sql = "   INSERT INTO "
			+ " PROD_JD.sn_ocorrencia (ID_OCORRENCIA, ID_TIPO_OCORRENCIA, ID_ASSINANTE,"
			+ " NOME_INFORMANTE, TEL_INFORMANTE, DT_OCORRENCIA, ID_USR, SIT,"
			+ " ID_ORIGEM, OBS, ID_CHAMADA) VALUES ({idOcorrencia}, {idTipoOcorrencia},"
			+ " {idAssinante}, upper({nomeInformante}), {telInformante}, SYSDATE, "
			+ "{idUsr}, {sit}, " 
			+ " {idOrigem}, upper({obs}), {idChamada})";
				
		
		try {
			@SuppressWarnings("unused")
			Connection conn = dataSource.getConnection();
			System.out.println("Base Selecionada");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Banco");
		
		ObjectFactory factory = new ObjectFactory();
		GerarOcorrenciaPrazoRequestResponse response = factory.createGerarOcorrenciaPrazoRequestResponse();
		
		RetornoGeraOcorrenciaPrazo retorno = new RetornoGeraOcorrenciaPrazo();
		retorno.setRetornoPadrao(new RetornoPadrao());
		
		OcorrenciaGeradaPrazo ocorr = new OcorrenciaGeradaPrazo();
		ocorr.setIDOCORRENCIA("" + Math.random());
		ocorr.setNRATENDIMENTO("" + Math.random());
		
		retorno.setOcorrenciaGeradaPrazo(ocorr);
		response.setRetornoGeraOcorrenciaPrazo(retorno);

		return response;
	}
}
