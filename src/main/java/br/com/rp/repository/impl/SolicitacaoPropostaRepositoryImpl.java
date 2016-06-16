package br.com.rp.repository.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.rp.domain.SolicitacaoProposta;
import br.com.rp.repository.SolicitacaoPropostaRepository;

@Stateless
public class SolicitacaoPropostaRepositoryImpl extends AbstractRepositoryImpl<SolicitacaoProposta> implements SolicitacaoPropostaRepository {

    public SolicitacaoPropostaRepositoryImpl() {
        super(SolicitacaoProposta.class);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public SolicitacaoProposta save(SolicitacaoProposta object) {
        return super.save(object);
    }
}
