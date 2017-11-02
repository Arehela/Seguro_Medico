package net.ausiasmarch.seguromedico.modelo;

/**
 *
 * @author Irina Garrigues Teruel
 */
public class SeguroMedico {

    // Propiedades
    private String trabajo;
    private int edad, numHijos;
    private double precioBase;
    private boolean hombre, mujer, embarazada;
    private boolean enfermedadCorazon, enfermedadOjos, enfermedadPiel;
    private boolean coberturaCorazon, coberturaOftalmologica, coberturaInVitro;
    private boolean coberturaPediatria, coberturaDermatologia;
    private String mensaje;
    private StringBuilder sb;
    private final int DESCUENTO_1 = 15;
    private final int DESCUENTO_2 = 5;

    // Método para reglas de validación ......................................
    public boolean validate() {
        sb = new StringBuilder();

//• La edad debe ser mayor o igual de 18 años
        if (edad < 18) {
            sb.append("-La edad debe ser mayor o igual a 18 años.\n");
        }

//• El número de hijos debe ser mayor o igual que cero
        if (numHijos < 0) {
            sb.append("El número de hijos debe ser mayor o igual que cero.\n");
        }

//• Si eligió ‘Embarazada’ o cobertura ‘Fecundación in vitro, el sexo debe ser ‘Mujer’.
        if ((isEmbarazada() || isCoberturaInVitro()) && !isMujer()) {
            sb.append("Si eligió ‘Embarazada’ o cobertura ‘Fecundación in vitro, el sexo debe ser ‘Mujer’.\n");

        }
//• Si eligió ‘Embarazada’ no puede seleccionar cobertura ‘Fecundación in vitro'.
        if (isEmbarazada() && isCoberturaInVitro()){
            sb.append("Si está embarazada no puede seleccionar cobertura in vitro.");
        }
//• Si eligió cobertura ‘Pediatría’ el número de hijos debe ser mayor de cero
        if (isCoberturaPediatria() && numHijos <= 0) {
            sb.append("Debe tener hijos para seleccionar una cobertura Pediátrica.\n");
        }

//• Si seleccionó la cobertura ‘Dermatológica” debe seleccionar la enfermedad ‘Piel’
        if (isCoberturaDermatologia() && !isEnfermedadPiel()) {
            sb.append("Debe seleccionar la enfermedad 'Piel' para la cobertura Dermatológica.\n");
        }

//• Si seleccionó la cobertura ‘Corazón” debe seleccionar la enfermedad ‘Corazón’
        if (isCoberturaCorazon() && !isEnfermedadCorazon()) {
            sb.append("Debe seleccionar la enfermedad 'Corazón' para la cobertura cardíaca.\n");
        }

//• Si seleccionó la cobertura Oftalmología” debe seleccionar la enfermedad ‘Ojos’
        if (isCoberturaOftalmologica() && !isEnfermedadOjos()) {
            sb.append("Debe seleccionar la enfermedad 'Ojos' para la cobertura Oftalmológica.\n");
        }

        //Convertimos el StringBuilder en un string
        mensaje = sb.toString();
        // devolvemos true o false
        return mensaje.isEmpty();
    }

    public double importeMensual() {
        double precio = precioBase;
        
        if (isEnfermedadCorazon()) {
            precio += 15;
        }
        if (isEnfermedadOjos()) {
            precio += 15;
        }
        if (isEnfermedadPiel()) {
            precio += 15;
        }
        if (isCoberturaOftalmologica()) {
            precio += 15;
        }
        if (isCoberturaPediatria()) {
            precio += 15;
        }
        if (isCoberturaInVitro()) {
            precio += 40;
        }
        if (isCoberturaCorazon()) {
            precio += 50;
        }
        if (isCoberturaDermatologia()) {
            precio += 25;
        }
        return precio;
    }

    public double descuento() {
        double descuento;
        if (trabajo.equals(TipoTrabajo.FUNCIONARIO.toString())) {
            descuento = DESCUENTO_1;
        } else {
            descuento = DESCUENTO_2;

        }
        return (importeMensual() * 12) * (descuento / 100);
    }
    
    public double importeAnual() {
        return (importeMensual() * 12) - descuento();
    }

    // Metodos get y set
    public boolean isHombre() {
        return hombre;
    }

    public void setHombre(boolean hombre) {
        this.hombre = hombre;
    }

    public boolean isMujer() {
        return mujer;
    }

    public void setMujer(boolean mujer) {
        this.mujer = mujer;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(boolean embarazada) {
        this.embarazada = embarazada;
    }

    public boolean isEnfermedadCorazon() {
        return enfermedadCorazon;
    }

    public void setEnfermedadCorazon(boolean enfermedadCorazon) {
        this.enfermedadCorazon = enfermedadCorazon;
    }

    public boolean isEnfermedadOjos() {
        return enfermedadOjos;
    }

    public void setEnfermedadOjos(boolean enfermedadOjos) {
        this.enfermedadOjos = enfermedadOjos;
    }

    public boolean isEnfermedadPiel() {
        return enfermedadPiel;
    }

    public void setEnfermedadPiel(boolean enfermedadPiel) {
        this.enfermedadPiel = enfermedadPiel;
    }

    public boolean isCoberturaCorazon() {
        return coberturaCorazon;
    }

    public void setCoberturaCorazon(boolean coberturaCorazon) {
        this.coberturaCorazon = coberturaCorazon;
    }

    public boolean isCoberturaOftalmologica() {
        return coberturaOftalmologica;
    }

    public void setCoberturaOftalmologica(boolean coberturaOftalmologica) {
        this.coberturaOftalmologica = coberturaOftalmologica;
    }

    public boolean isCoberturaInVitro() {
        return coberturaInVitro;
    }

    public void setCoberturaInVitro(boolean coberturaInVitro) {
        this.coberturaInVitro = coberturaInVitro;
    }

    /**
     * 
     * @return boolean
     */
    public boolean isCoberturaPediatria() {
        return coberturaPediatria;
    }

    public void setCoberturaPediatria(boolean coberturaPediatria) {
        this.coberturaPediatria = coberturaPediatria;
    }

    public boolean isCoberturaDermatologia() {
        return coberturaDermatologia;
    }

    public void setCoberturaDermatologia(boolean coberturaDermatologia) {
        this.coberturaDermatologia = coberturaDermatologia;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

}
