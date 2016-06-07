package com.fincatto.nfe310.classes.danfe;

import org.junit.Test;

import com.fincatto.nfe310.FabricaDeObjetosFake;
import com.fincatto.nfe310.classes.nota.NFNota;
import com.fincatto.nfe310.classes.nota.NFNotaInfo;
import com.fincatto.nfe310.classes.nota.assinatura.NFSignature;

public class NFGeraDanfeTest {

	@Test
	public void deveGerarDanfeAPartirDoXML() {
		final NFNota nota = new NFNota();
		final NFSignature assinatura = new NFSignature();
		assinatura.setSignatureValue("NFe89172658591754401086218048846976493475937081");
		final NFNotaInfo notaInfo = FabricaDeObjetosFake.getNFNotaInfo();
		final int identificadorLocal = 123456;
		nota.setAssinatura(assinatura);
		nota.setInfo(notaInfo);
		nota.setIdentificadorLocal(identificadorLocal);
		nota.toString();
		NFDanfeReport.imprimirDanfe(nota, "/home/felipe/teste.pdf");
		//Assert.assertTrue(NFDanfeReport.imprimirDanfe(nota, "/tmp/"));
	}

}