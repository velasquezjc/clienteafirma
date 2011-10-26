/*******************************************************************************
 * Este fichero forma parte del Cliente @firma.
 * El Cliente @firma es un aplicativo de libre distribucion cuyo codigo fuente puede ser consultado
 * y descargado desde http://forja-ctt.administracionelectronica.gob.es/
 * Copyright 2009,2010,2011 Gobierno de Espana
 * Este fichero se distribuye bajo  bajo licencia GPL version 2  segun las
 * condiciones que figuran en el fichero 'licence' que se acompana. Si se distribuyera este
 * fichero individualmente, deben incluirse aqui las condiciones expresadas alli.
 ******************************************************************************/

package es.gob.afirma.core;

/** Excepci&oacute;n para notificar que se ha proporcionado un fichero o dato con
 * un formato no v&aacute;lido para la acci&oacute;n en curso. */
public final class AOFormatFileException extends AOException {

    private static final long serialVersionUID = 6785819338728771962L;

    /** Crea una excepci&oacute;n relacionada con un formato de fichero con un mensaje determinado.
     * @param msg Mensaje descriptivo de la excepci&oacute;n. */
    public AOFormatFileException(final String msg) {
        super(msg);
    }
    
    /** Crea una excepci&oacute;n relacionada con un formato de fichero con un mensaje determinado
     * y preservando la pila de exceptiones.
     * @param msg Mensaje descriptivo de la excepci&oacute;n.
     * @param e Excepci&oacute;n que a su vez origin&oacute; esta
     */
    public AOFormatFileException(final String msg, final Exception e) {
        super(msg, e);
    }

}
