package br.com.styleAtual.controller.conversor;

import org.springframework.core.convert.converter.Converter;

import br.com.styleAtual.model.domain.EPeriodoMeta;

/**
 * 
 * @author MARCIO
 * 
 * Classe gerenciada pelo Spring responsavel para converter dados da requisição HTTP em uma classe Enun[EPeriodoMeta]
 *
 */
public class PeriodoMetaConverter implements Converter<String, EPeriodoMeta> {

	@Override
	public EPeriodoMeta convert(String meta) {
		
		if (meta.equals(EPeriodoMeta.DIARIA.getMeta())) {
			return EPeriodoMeta.DIARIA;
		} else if(meta.equals(EPeriodoMeta.SEMANAL.getMeta())){
			return EPeriodoMeta.SEMANAL;
		} else if(meta.equals(EPeriodoMeta.MENSAL.getMeta())) {
			return EPeriodoMeta.MENSAL;
		}
		return EPeriodoMeta.SEM_META;
	}
}
