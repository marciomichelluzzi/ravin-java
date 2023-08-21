package br.com.devxlabs.ravin.view;

import br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants;

public class GeneralView {
	
	
	public static String buildGeneralSubMenu(String module) {
		StringBuilder builder = new StringBuilder();
		builder.append(" ==================== Gestão de ");
		builder.append(module);
		builder.append(" ==================== ");
		builder.append(ViewsTextConstants.BREAK_LINE);
		builder.append("1 -  Cadastrar \n");
		builder.append("2 -  Alterar \n");
		builder.append("3 -  Excluir \n");
		builder.append("4 -  Consultar \n");
		builder.append("5 -  Listar todos \n");

		return builder.toString();
	}
}
