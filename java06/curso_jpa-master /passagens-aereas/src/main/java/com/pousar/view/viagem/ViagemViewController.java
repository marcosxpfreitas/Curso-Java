package com.pousar.view.viagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.pousar.app.util.JsonUtil;
import com.pousar.app.util.Strings;
import com.pousar.domain.ValidacaoException;
import com.pousar.domain.viagem.Viagem;
import com.pousar.domain.viagem.ViagemService;
import com.pousar.view.operacao.ResultadoOperacaoErro;
import com.pousar.view.operacao.ResultadoOperacaoSucesso;

public class ViagemViewController {

	private ViagemService viagemService = new ViagemService();

	public String buscar(String origem, String destino, String dataIdaString, String dataVoltaString) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dataIda = Strings.isNotEmpty(dataIdaString) ? format.parse(dataIdaString) : null;
		Date dataVolta = Strings.isNotEmpty(dataVoltaString) ? format.parse(dataVoltaString) : null;
		
		List<Viagem> viagens = viagemService.buscarPor(origem, destino, dataIda, dataVolta);
		return JsonUtil.toJson(viagens);
	}

	public String salvar(String viagemJson) {
		try {
			Viagem viagem = 
					new GsonBuilder()
						.setDateFormat("dd/MM/yyyy HH:mm")
						.create()
						.fromJson(viagemJson, Viagem.class);
			
			viagemService.salvar(viagem);
			return JsonUtil.toJson(new ResultadoOperacaoSucesso());
		} catch (ValidacaoException e) {
			return JsonUtil.toJson(new ResultadoOperacaoErro(e.getMessage()));
		} catch (Exception e) {
			return JsonUtil.toJson(new ResultadoOperacaoErro("Ocorreu um erro ao salvar. Verifique as datas e o preco informado"));
		}
	}

	public String buscarPorId(String id) {
		return JsonUtil.toJson(viagemService.buscarPorId(Long.valueOf(id)));
	}
}