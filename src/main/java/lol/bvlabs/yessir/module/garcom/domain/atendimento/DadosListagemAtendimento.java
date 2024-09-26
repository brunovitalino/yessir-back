package lol.bvlabs.yessir.module.garcom.domain.atendimento;

import lol.bvlabs.yessir.module.garcom.domain.atendente.DadosListagemAtendente;
import lol.bvlabs.yessir.module.garcom.domain.mesa.DadosListagemMesa;

public record DadosListagemAtendimento(
		Long id,
		DadosListagemMesa dadosListagemMesa,
		DadosListagemAtendente dadosListagemAtendente,
		AtendimentoStatus status,
		Boolean ativo
) {
	
	public DadosListagemAtendimento(Atendimento atendimento) {
		this(atendimento.getId(), new DadosListagemMesa(atendimento.getMesa()), new DadosListagemAtendente(atendimento.getAtendente()), atendimento.getStatus(), atendimento.getAtivo());
	}
}
