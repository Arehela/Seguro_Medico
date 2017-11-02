package net.ausiasmarch.seguromedico.modelo;

/**
 *
 * @author lmateor
 */
public enum TipoTrabajo {
    FUNCIONARIO, AUTONOMO, CUENTA_AJENA;

    @Override
    public String toString() {
        String cad = "";

        switch (this) {
            case FUNCIONARIO:
                cad = "Funcionario";
                break;
            case CUENTA_AJENA:
                cad = "Cuenta Ajena";
                break;
            case AUTONOMO:
                cad = "Autónomo";
        }
        return cad;
    }
}
