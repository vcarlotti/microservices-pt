package br.com.clarobrasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "SN_OCORRENCIA")
public class Occurrence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_OCORRENCIA")
	private Long id;

	@Column(name = "ID_TIPO_OCORRENCIA")
	private Long idTipoOcorrencia;

	@Column(name = "ID_ASSINANTE")
	private Long idAssinante;

	@Column(name = "NOME_INFORMANTE")
	private String nomeInformante;

	@Column(name = "TEL_INFORMANTE")
	private String telInformante;

	@Column(name = "DT_OCORRENCIA")
	private String dataOcorrencia;

	@Column(name = "ID_USR")
	private String idUsr;

	@Column(name = "SIT")
	private String sit;

	@Column(name = "DT_RETORNO")
	private String dataRetorno;

	@Column(name = "ID_ORIGEM")
	private String idOrigem;

	@Column(name = "OBS")
	private String observacao;

	@Column(name = "FN_CONVENIENCIA")
	private String fnConveniencia;

	@Column(name = "FN_FORA_PADRAO")
	private String fnForaPadrao;

	@Column(name = "ID_CHAMADA")
	private String idChamada;

	protected Occurrence() {
	}

	public Occurrence(String nomeInformante, Long idTipoOcorrencia, Long idAssinante, String telInformante,
			String dataOcorrencia, String idUsr, String sit, String dataRetorno, String idOrigem, String observacao,
			String fnConveniencia, String fnForaPadrao, String idChamada) {
		super();
		this.nomeInformante = nomeInformante;
		this.idTipoOcorrencia = idTipoOcorrencia;
		this.idAssinante = idAssinante;
		this.telInformante = telInformante;
		this.dataOcorrencia = dataOcorrencia;
		this.idUsr = idUsr;
		this.sit = sit;
		this.dataRetorno = dataRetorno;
		this.idOrigem = idOrigem;
		this.observacao = observacao;
		this.fnConveniencia = fnConveniencia;
		this.fnForaPadrao = fnForaPadrao;
		this.idChamada = idChamada;
	}

	public Long getId() {
		return id;
	}

	public String getNomeInformante() {
		return nomeInformante;
	}

	public Long getIdTipoOcorrencia() {
		return idTipoOcorrencia;
	}

	public Long getIdAssinante() {
		return idAssinante;
	}

	public String getTelInformante() {
		return telInformante;
	}

	public String getDataOcorrencia() {
		return dataOcorrencia;
	}

	public String getIdUsr() {
		return idUsr;
	}

	public String getSit() {
		return sit;
	}

	public String getDataRetorno() {
		return dataRetorno;
	}

	public String getIdOrigem() {
		return idOrigem;
	}

	public String getObservacao() {
		return observacao;
	}

	public String getFnConveniencia() {
		return fnConveniencia;
	}

	public String getFnForaPadrao() {
		return fnForaPadrao;
	}

	public String getIdChamada() {
		return idChamada;
	}

	@Override
	public String toString() {
		return String.format(
				"Occurrence [id=%s, nomeInformante=%s, idTipoOcorrencia=%s, idAssinante=%s, telInformante=%s, dataOcorrencia=%s, idUsr=%s, sit=%s, dataRetorno=%s, idOrigem=%s, observacao=%s, fnConveniencia=%s, fnForaPadrao=%s, idChamada=%s]",
				id, nomeInformante, idTipoOcorrencia, idAssinante, telInformante, dataOcorrencia, idUsr, sit,
				dataRetorno, idOrigem, observacao, fnConveniencia, fnForaPadrao, idChamada);
	}

}
