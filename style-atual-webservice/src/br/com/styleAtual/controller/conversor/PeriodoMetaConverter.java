package br.com.styleAtual.controller.conversor;

import org.springframework.core.convert.converter.Converter;

import br.com.styleAtual.model.domain.PeriodoMeta;

/**
 * 
 * @author MARCIO
 * 
 * Classe gerenciada pelo Spring responsavel para converter dados da requisição HTTP em uma classe Enun[PeriodoMeta]
 *
 */
public class PeriodoMetaConverter implements Converter<String, PeriodoMeta> {

	@Override
	public PeriodoMeta convert(String meta) {
		
		if (meta.equals(PeriodoMeta.DIARIA.getMeta())) {
			return PeriodoMeta.DIARIA;
		} else if(meta.equals(PeriodoMeta.SEMANAL.getMeta())){
			return PeriodoMeta.SEMANAL;
		} else if(meta.equals(PeriodoMeta.MENSAL.getMeta())) {
			return PeriodoMeta.MENSAL;
		}
		return PeriodoMeta.SEM_META;
	}
}
