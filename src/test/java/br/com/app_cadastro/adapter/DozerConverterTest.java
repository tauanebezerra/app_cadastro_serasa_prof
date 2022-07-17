package br.com.app_cadastro.adapter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.app_cadastro.domain.entity.Pessoa;
import br.com.app_cadastro.domain.vo.v1.PessoaVO;



public class DozerConverterTest {

	//MOCKU = criar um objeto com a informação que vai ser testada
	
private Pessoa mockEntity(Long numero) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(0l);
		pessoa.setNome("Nome Teste"+numero);
		pessoa.setSobrenome("Sobrenome Teste"+numero);
		pessoa.setNomeSocial("NomeSocial Teste"+numero);
		pessoa.setEmail("Email Teste"+numero);
			
		return pessoa;
	}

private PessoaVO mockEntityVO(Long numero) {
	PessoaVO pessoa = new PessoaVO();
	pessoa.setKey(0l);
	pessoa.setNome("Nome Teste"+numero);
	pessoa.setSobrenome("Sobrenome Teste"+numero);
	pessoa.setNomeSocial("NomeSocial Teste"+numero);
	pessoa.setEmail("Email Teste"+numero);
	return pessoa;
}
private List<PessoaVO> mockEntityListVO() {
	List<PessoaVO> pessoas = new ArrayList<>();
	for (Long i = 0l; i < 5; i++) {
		pessoas.add(mockEntityVO(i));
	}
	return pessoas;
}

//casos de test

@Test
public void parseEntityToVoTest() {
	
	PessoaVO output = DozerConverter.parseObject(mockEntity(0l), PessoaVO.class);
	
	Assert.assertEquals(Long.valueOf(0l),output.getKey());
	Assert.assertEquals("Nome Teste0",output.getNome());
	Assert.assertEquals("Sobrenome Teste0",output.getSobrenome());
	Assert.assertEquals("NomeSocial Teste0",output.getNomeSocial());
	Assert.assertEquals("Email Teste0",output.getEmail());
}

}

