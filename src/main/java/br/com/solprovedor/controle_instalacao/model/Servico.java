package br.com.solprovedor.controle_instalacao.model;

public enum Servico {
    INSTALACAO("instalacao"),
    MIGRACAO("migracao"),
    MUDANCA_ENDERECO("mudanca_endereco"),
    CANCELAMENTO("cancelamento"),
    REATIVACAO("reativacao"),
    TROCA_EQUIPAMENTO("troca_equipamento");

    private String categoriaOmdb;

    Servico (String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }
    public static Servico fromString(String text) {
        for (Servico servico : Servico.values()) {
            if (servico.categoriaOmdb.equalsIgnoreCase(text)) {
                return servico;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
